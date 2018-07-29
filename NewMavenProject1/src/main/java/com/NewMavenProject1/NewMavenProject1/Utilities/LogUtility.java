package com.NewMavenProject1.NewMavenProject1.Utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

public class LogUtility  {
	

	public static void LogInfo(String details)
	{
		
	DriverUtility.getlog().info(details);
	}
	}


