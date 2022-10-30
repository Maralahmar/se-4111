package com.singleton;

public class singletonClass {

		   private static singletonClass singleton = new singletonClass( );

		   /* A private Constructor prevents any other
		    * class from instantiating.
		    */
		   private singletonClass() { }

		   /* Static 'instance' method */
		   public static singletonClass getInstance( ) {
		      return singleton;
		   }

		   /* Other methods protected by singleton-ness */
		   protected static void demoMethod( ) {
		      System.out.println("demoMethod for singleton");
		   }
		}

