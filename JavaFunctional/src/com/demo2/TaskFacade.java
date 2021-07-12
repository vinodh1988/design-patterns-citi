package com.demo2;

public class TaskFacade {
    public static void doActivity(Task t,String name) {
    	System.out.println("preparing the task..!!!");
    	System.out.println("Setting things ready");
    	System.out.println("Ready steady Go...!!!!");
    	t.perform(name);
    	System.out.println("Done with the tasks");
    	System.out.println("Closing all the resources");
    	System.out.println("----------------------------------------");
    }
}
