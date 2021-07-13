package com.current.project;

import com.demo2.TaskFacade;
import com.demo2.TaskFactory;
import com.subsystem2.MediaPlayer;

public class ActivityRunner {
   public static void main(String[] args) {
	   TaskFacade.facade("build", "Maven Project");
	   TaskFacade.facade("build", "Gradle Project");
	   TaskFacade.facade("build", "Node JS Project");
	   TaskFacade.facade("build", "Android Project");
	   
	   TaskFacade.facade("test", "Maven Project");
	   TaskFacade.facade("test", "Gradle Service");
	   TaskFacade.facade("test", "Node JS Project");
	   TaskFacade.facade("test", "Android Project");
	   
	   TaskFacade.facade("debug", "Maven Project");
	 
	   TaskFacade.facade("convert", "MP4");
	
	   TaskFacade.facade("github","Commit all my project code");
	   TaskFacade.facade("bitbucket","Commit all the changes maded in feature1 branch");
	   
	   TaskFacade.facade("jenkins", "Invoke the build pipeline");
	   
    }
}
