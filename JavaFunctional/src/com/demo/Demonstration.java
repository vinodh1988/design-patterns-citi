package com.demo;

public class Demonstration {
   public static void main(String[] args) {
	   //way 1
	 /*  class Adhoc implements Task{

		@Override
		public void doIt(String process) {
			// TODO Auto-generated method stub
			System.out.println("Processing.....");
			System.out.println(process);
		}
		   
	   }
	   
	   Performer.perform(new Adhoc());*/
	   //way2
	  /* Performer.perform(new Task() {

		@Override
		public void doIt(String process) {
			// TODO Auto-generated method stub
			System.out.println("Processing.....");
			System.out.println(process);
		}
		   
	   });*/
	   
	   //way 3
	   
	/*   Performer.perform(x->{
		    System.out.println("Processing.....");
			System.out.println(x);
	   });*/
    }
} 
