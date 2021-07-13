package com.demo2;

import com.adapter.DevopsAdapter;
import com.security.SecurityDecorator;
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
	
	//Requirement is Build, Test, debug needs to pass security Test ..then only activity can 
	//performed
	//So we need to intorduce security decorator on build ,test ,debug
	
	private final static Convert convert=new Convert();
			
	static {
		System.out.println("Loaded....");
	}
    public static Activity getInstance(String task) {
    	switch(task) {
    	   default:
    		     return null;
    	   case "build":
    		      return new SecurityDecorator(build);
    	   case  "test":
    		      return new SecurityDecorator(test);
    	   case "debug":
    		   	  return new SecurityDecorator(debug);
    	   case  "convert":
    		      return convert;
    	   case "azure": case "azurerepos": case "github": case "jenkins": case "bitbucket":
    		      return new DevopsAdapter(task);
    	}
    	
    }
    
   
}
