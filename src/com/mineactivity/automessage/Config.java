package com.mineactivity.automessage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.logging.Logger;

public class Config
{
	
	public static void createConfigDir() throws FileNotFoundException, UnsupportedEncodingException
	{
	    File configDir = new File("plugins/" + Misc.name);
	    File configFile = new File("plugins/" + Misc.name + "/config.yml");
	    if (!configDir.exists())
	    {
	    	configDir.mkdirs();
	    	Logger.getLogger(Misc.name).info("[" + Misc.name + "]" + " Couldn't find config directory.. directory created.");
	    	return;
	    }
	    
	    if (!configFile.exists())
	    {
	    	
	    	PrintWriter writer = new PrintWriter("plugins/" + Misc.name + "/config.yml", "UTF-8");
	    	writer.println("#-------------------------#");
	    	writer.println("# AutoMessage config file #");
	    	writer.println("#    By: Puharesource     #");
	    	writer.println("#-------------------------#");
	    	writer.println("");
	    	writer.println("prefix: 'AutoMessage> '");
	    	writer.println("interval: 60");
	    	writer.println("write-to-console: true");
	    	writer.println("testmessage: 'This is a test message'");
	    	writer.close();
	    	
	    	Logger.getLogger(Misc.name).info("[" + Misc.name + "]" + " Couldn't find config file.. file created.");
	    	
	    	return;
	    }
	}
	
	public String prefix()
	{
		//Waiting to be able to write the YML file
		return "";
	}
	
	public int interval()
	{
		//Waiting to be able to write the YML file
		return 0;
	}
	
	public boolean writeToConsole()
	{
		//Waiting to be able to write the YML file
		return true;
	}
	
	public List messages()
	{
		//Waiting to be able to read the messages
		return null;
	}
}
