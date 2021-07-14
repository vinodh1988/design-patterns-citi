package com.command;

public class MainClass {
    public static void main(String n[]) {
    	Robot r=new Robot(); //behavior
    	
    	Instructor.Instruct(new WalkCommand(r));
    	Instructor.Instruct(new RechargeCommand(r));
    	Instructor.Instruct(new DanceCommand(r));
    }
}
