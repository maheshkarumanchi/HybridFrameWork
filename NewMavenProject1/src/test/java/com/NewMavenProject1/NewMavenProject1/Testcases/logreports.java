package com.NewMavenProject1.NewMavenProject1.Testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class logreports {
	private static  Logger log;
	public static void logreporting(Object msg)
	{
		PropertyConfigurator.configure("paste log4j properties path here");
		log=Logger.getLogger("give any name");
		log.info(msg);
	}

}
