package com.work;

import com.devops.DevopsComponent;
import com.factory.AbstractDevopsFactory;

public class PutToWork {
     public static void main(String[] args) {
		DevopsComponent devops= AbstractDevopsFactory.getInstance("github");
		devops.start("push folder src");
		devops=AbstractDevopsFactory.getInstance("azurerepos");
		devops.start("commit this folder unit-test");
		devops=AbstractDevopsFactory.getInstance("jenkins");
		devops.start("Build a maven project pipeline");
		
		
	}
}
