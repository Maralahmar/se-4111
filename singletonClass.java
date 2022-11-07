package com.singleton;

public class singletonClass {

	private static singletonClass singleton ;
		private int LeenaTemp;
		// private int tempM;
		// private int tempH;

		   private singletonClass() { }
		   public static singletonClass getInstance( ) {
			 if (singleton == null) {	 				 singleton	 = new singletonClass( ); }
		      return singleton;
	}		  
	// mariamcode:	   
	 public int getTemp() {
		 return this.LeenaTemp;}
	 public void setTemp(int LeenaTemp) {
		if (LeenaTemp<7) {
			System.out.println(++LeenaTemp );
			System.out.println("cold weather"); }

		else {
  			System.out.println(--LeenaTemp); 
			System.out.println("hot weather");}  }}