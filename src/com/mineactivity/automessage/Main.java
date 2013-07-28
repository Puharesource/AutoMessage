package com.mineactivity.automessage;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.logging.Logger;

import javax.swing.Timer;

import org.glydar.glydar.plugin.Plugin;

public class Main extends Plugin
{
	private final Logger log = Logger.getLogger(getName());
	Timer timer;
	
	  public void onEnable()
	  {
	    log.info(Misc.fullName + " is powered by MineActivity.com");
	    
	    try
		{
			Config.createConfigDir();
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (UnsupportedEncodingException e)
		{
			e.printStackTrace();
		}
	    new AutoMessageTimer();
	  }
	  
	  public void onDisable()
	  {
	  }

	public String getName()
	{
		return Misc.name;
	}

	public String getVersion()
	{
		return Misc.version;
	}
	
	public String getAuthor()
	{
		return Misc.author;
	}
}
