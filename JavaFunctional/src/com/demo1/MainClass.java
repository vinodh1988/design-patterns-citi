package com.demo1;

public class MainClass {
   public static void main(String n[]) {
	   Operator.operate(()->System.out.println("I am anonymous task"));
	   Operator.operate(RandomClass::job);
	   //Operator.operate(new OneMoreRandom()::act);
	   Operator.operate(()->new OneMoreRandom().act());
	   Operator.operate(new OneMoreRandom()::cry);
   }
}
