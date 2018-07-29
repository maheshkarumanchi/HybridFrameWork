package com.NewMavenProject1.NewMavenProject1.Utilities;

import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport extends DriverUtility {
	public static void ReportInfo(String stepDetails)
	{
		DriverUtility.getet().log(LogStatus.INFO, stepDetails);
	}

}
