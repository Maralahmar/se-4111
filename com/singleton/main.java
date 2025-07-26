package com.singleton;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        singletonClass tmp = singletonClass.getInstance();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature for Mariam:");
        int mariamTemp = scanner.nextInt();
        System.out.println("Mariam Alahmar:");
        tmp.setMariamTemp(mariamTemp);

        System.out.println("\nEnter temperature for Hadeel:");
        int hadeelTemp = scanner.nextInt();
        System.out.println("Hadeel Abdullah:");
        tmp.setHadeelTemp(hadeelTemp);

        System.out.println("\nEnter temperature for Leena:");
        int leenaTemp = scanner.nextInt();
        System.out.println("Leena Abdullah:");
        tmp.setLeenaTemp(leenaTemp);

        scanner.close();
    }
}
