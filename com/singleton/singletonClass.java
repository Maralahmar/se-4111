package com.singleton;

public class singletonClass {

    private static singletonClass singleton;

    private int leenaTemp;
    private int mariamTemp;
    private int hadeelTemp;

    private singletonClass() {}

    public static singletonClass getInstance() {
        if (singleton == null) {
            singleton = new singletonClass();
        }
        return singleton;
    }

    // Leena
    public void setLeenaTemp(int temp) {
        leenaTemp = temp;
        if (temp < 7) {
            System.out.println(++leenaTemp);
            System.out.println("cold weather");
        } else {
            System.out.println(--leenaTemp);
            System.out.println("hot weather");
        }
    }

    // Mariam
    public void setMariamTemp(int temp) {
        mariamTemp = temp;
        if (temp < 20) {
            System.out.println(++mariamTemp);
            System.out.println("cold weather");
        } else {
            System.out.println(--mariamTemp);
            System.out.println("hot weather");
        }
    }

    // Hadeel
    public void setHadeelTemp(int temp) {
        hadeelTemp = temp;
        if (temp < 20) {
            System.out.println(++hadeelTemp);
            System.out.println("cold weather");
        } else {
            System.out.println(--hadeelTemp);
            System.out.println("hot weather");
        }
    }

    // (Optional) Getter functions if you need them
    public int getLeenaTemp() {
        return leenaTemp;
    }

    public int getMariamTemp() {
        return mariamTemp;
    }

    public int getHadeelTemp() {
        return hadeelTemp;
    }
}
