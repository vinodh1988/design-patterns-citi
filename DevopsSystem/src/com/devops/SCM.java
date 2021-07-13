package com.devops;

public class SCM extends DevopsComponent{

	@Override
	public void setup(String tool) {
		// TODO Auto-generated method stub
		this.tool= tool;
		System.out.println("Installing .... "+tool);
	}

	@Override
	public void start(String job) {
		// TODO Auto-generated method stub
		System.out.println("Executing the task-->"+ job + " with the scm system "+tool);
	}

}
