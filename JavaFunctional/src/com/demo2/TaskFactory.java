package com.demo2;

import com.subsystem.Activity;
import com.subsystem.Building;
import com.subsystem.Debugging;
import com.subsystem.Testing;
import com.subsystem2.Convert;

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
    	   case  "convert":
    		      return new Convert();
    	}
    }
}
