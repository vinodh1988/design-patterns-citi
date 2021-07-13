package com.devops;

abstract public class DevopsComponent {
     protected String tool;
     
     DevopsComponent(){tool="undefined";}
     public abstract void setup(String tool);
     public abstract void start(String job);
}
