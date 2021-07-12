package com.subsystem;

//Factory pattern
public class TaskFactory {
    public static Activity getInstance(String task) {
    	switch(task) {
    	   default:
    		     return null;
    	   case "build":
    		      return new Building();
    	   case  "test":
    		      return new Testing();
    	   case "debug":
    		   	  return new Debugging();
    	}
    }
}
