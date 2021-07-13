package com.factory;

import com.devops.CICD;
import com.devops.DevopsComponent;
import com.devops.SCM;

public class AbstractDevopsFactory {
      public static DevopsComponent getInstance(String type){
    	  DevopsComponent temp;
    	  switch(type) {
    	      case "github": case"bitbucket": case "azurerepos":
    	    	    temp=new SCM();
    	    	    temp.setup(type);
    	    	    return temp;
    	      case "jenkins": case "azure":
    	    	   temp=new CICD();
    	    	   temp.setup(type);	
   	    	       return temp;
   	    	  default:
   	    		   return null;
    	  }
    	  
      }
}
