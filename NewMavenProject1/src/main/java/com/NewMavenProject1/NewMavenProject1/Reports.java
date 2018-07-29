package com.NewMavenProject1.NewMavenProject1;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Formatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reports {
	static ExtentReports er;
	public static ExtentTest et;
	@Test
	public static void ReportInfo(String stepdetails )
	{
		er=new ExtentReports("F:\\d.html");
		et=er.startTest("mahesh");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		et.log(LogStatus.PASS, stepdetails);
		er.endTest(et);
		er.flush();
	}
	

}
