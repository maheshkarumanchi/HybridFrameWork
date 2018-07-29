package com.NewMavenProject1.NewMavenProject1.Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.NewMavenProject1.NewMavenProject1.Reports;
import com.NewMavenProject1.NewMavenProject1.Utilities.ActionEngine;
import com.NewMavenProject1.NewMavenProject1.Utilities.DriverUtility;
import com.NewMavenProject1.NewMavenProject1.Utilities.ExtentReport;
import com.NewMavenProject1.NewMavenProject1.Utilities.LogUtility;
import com.NewMavenProject1.NewMavenProject1.Utilities.PojoClass;
import com.relevantcodes.extentreports.ExtentReports;

public class facebooklogin extends DriverUtility {
	@Test
	public void LoginTest() throws IOException
	{
		DriverUtility.GetDriver().get(PojoClass.getconFigfile().getPropertyValue("Facebook_Url"));
		LogUtility.LogInfo("firefoxbrowser launched and facebook app is opened");
		Reports.ReportInfo("facebook application is succesfully launched");
		ActionEngine.SenKeysAction("id", "email", "mahi080290@gmail.com");
		
	}
	

}
