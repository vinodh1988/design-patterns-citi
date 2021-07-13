package com.demo2;

import com.subsystem.Activity;

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
    
    public static void facade(String activity,String name) {
       //Activity temp=	TaskFactory.getInstance(activity);
       //System.out.println("Hash code "+temp.hashCode());
    	//doActivity((x)->{TaskFactory.getInstance(activity).activity(x);},name);
      doActivity(TaskFactory.getInstance(activity)::activity, name); 
    }
}
