package com.demo;

public class Performer {
    public static void perform(Task t) {
    	System.out.println("Started performing Task");
    	System.out.println("Please carry your part");
    	t.doIt("set1 tasks to be performed");
    	System.out.println("Continuing...........");
    	System.out.println("I am going to give you some more data");
    	t.doIt("set2 tasks to be performed");
    	System.out.println("Well done let me wrap up");
    	System.out.println("F I N I S H E D");
    }
}
