package com.mineactivity.automessage;

import java.util.Timer;
import java.util.TimerTask;

public class AutoMessageTimer
{
	  Timer timer;
	  private int time = Misc.interval;
	  private boolean console = Misc.postToConsole;

	  public AutoMessageTimer()
	  {
	    this.timer = new Timer();
	    this.timer.schedule(new RemindTask(), 0, time * 1000);
	  }
 
	  class RemindTask extends TimerTask {

		    RemindTask()
		    {
		    	
		    }
		    
		    public void run() 
		    {  
		    	if(console)
		    	{
		    		System.out.format(Misc.prefix + Misc.message + "%n", new Object[0]);
		    	}
		    	else
		    	{
		    		// Chat packet stuff goes here =D
		    	}
		    }
	  }
}
