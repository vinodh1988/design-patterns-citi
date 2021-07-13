package com.demo2;

import com.subsystem.Activity;
import com.subsystem.Debugging;
import com.subsystem.FastBuild;
import com.subsystem.Testing;
import com.subsystem2.Convert;

//Factory pattern
public class TaskFactory {
	//Singleton implementation
	private final static FastBuild build=new FastBuild();
	private final static Testing test=new Testing();
	private final static Debugging debug=new Debugging();
	private final static Convert convert=new Convert();
			
	static {
		System.out.println("Loaded....");
	}
    public static Activity getInstance(String task) {
    	switch(task) {
    	   default:
    		     return null;
    	   case "build":
    		      return build;
    	   case  "test":
    		      return test;
    	   case "debug":
    		   	  return debug;
    	   case  "convert":
    		      return convert;
    	}
    }
}
