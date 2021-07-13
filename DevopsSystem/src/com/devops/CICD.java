package com.devops;

public class CICD extends DevopsComponent {

	@Override
	public void setup(String tool) {
		// TODO Auto-generated method stub
		this.tool = tool;
		System.out.println("Installing.....and Seting up CI CD "+ tool);
	}

	@Override
	public void start(String job) {
		// TODO Auto-generated method stub
		System.out.println("Doing Activity on....."+tool+ " The task you asked for "+job);
	}

}
