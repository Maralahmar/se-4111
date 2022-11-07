package com.singleton;

public class singletonClass {

	private static singletonClass singleton ;
		private int LeenaTemp;
		private int MariamTemp;
		// private int tempH;

		   private singletonClass() { }
		   public static singletonClass getInstance( ) {
			 if (singleton == null) {	 				 singleton	 = new singletonClass( ); }
		      return singleton;
	}		  
	// leenaCode:	   
	 public int getTemp() {
		 return this.LeenaTemp;}
	 public void setTemp(int LeenaTemp) {
		if (LeenaTemp<7) {
			System.out.println(++LeenaTemp );
			System.out.println("cold weather"); }

		else {
  			System.out.println(--LeenaTemp); 
			System.out.println("hot weather");}  }}
//mariamCode:	   
	 public int getTemp() {
		 return this.MariamTemp;}
	 public void setTemp(int MariamTemp) {
		if (MariamTemp<20) {
			System.out.println(++MariamTemp );
			System.out.println("cold weather"); }

		else {
			System.out.println(--MariamTemp); 
			System.out.println("hot weather");}  }}