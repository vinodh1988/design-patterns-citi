package com.security;

import com.subsystem.Activity;
//Calls the original activity if and only security check is passed
//the activity reference is caught in the constructor
public class SecurityDecorator implements Activity{
	Activity obj;
	
	public SecurityDecorator(Activity obj) {
		this.obj = obj;
	}

	@Override
	public void activity(String name) {
		// TODO Auto-generated method stub
		if(name.contains("Project"))
		{
			System.out.println("Log::: Security check passed");
			obj.activity(name);
		}
		else {
			System.out.println("Log:Error:: Security check failed");
		}
	}

}
