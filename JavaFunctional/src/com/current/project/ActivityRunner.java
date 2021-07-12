package com.current.project;

import com.demo2.TaskFacade;
import com.demo2.TaskFactory;
import com.subsystem2.MediaPlayer;

public class ActivityRunner {
   public static void main(String[] args) {
	    TaskFacade.doActivity(TaskFactory.getInstance("test")::activity, "Java project");
	    TaskFacade.doActivity(TaskFactory.getInstance("build")::activity, "Maven Project");
	    TaskFacade.doActivity(TaskFactory.getInstance("debug")::activity, "ERP Project");
	    TaskFacade.doActivity(MediaPlayer::play, "Song 243");
	    TaskFacade.doActivity(TaskFactory.getInstance("convert")::activity, "mp3");
    }
}
