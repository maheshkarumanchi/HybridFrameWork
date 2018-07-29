package com.NewMavenProject1.NewMavenProject1.Utilities;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.NewMavenProject1.NewMavenProject1.Reports;
import com.beust.jcommander.Parameter;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class DriverUtility {
	private static WebDriver driver;
	private static ExtentReports er;
	private static ExtentTest et;
	private static Logger log;
	@Parameters("browser")
	@BeforeSuite
	public void LaunchBrowser(String browser)
	{
		PropertyConfigurator.configure("F:\\durga\\NewMavenProject1\\src\\main\\java\\com\\NewMavenProject1\\NewMavenProject1\\Objectrepositories\\log4j.properties");
		er=new ExtentReports("F:\\durga\\NewMavenProject1\\test-output\\reports.html");
	
	   if(browser.equalsIgnoreCase("firefox"))
	     {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	     }
	     else if(browser.equalsIgnoreCase("chrome"))
       	{
	    	System.setProperty("webdriver.chrome.driver", "‪G:\\Lib\\chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
     	}
	
	
	
	}
	@BeforeMethod
	public void BeforeMethod(Method m)
	{
		//er.startTest(m.getName());
		log=Logger.getLogger(m.getName());
		et=er.startTest(m.getName());

	}


@AfterMethod
public void AfterMethod(ITestResult result) throws IOException
{
	if(ITestResult.FAILURE==result.FAILURE)
	{
		String path1=ScreenshotUtility.GetScreenShot(driver, result.getName());
		Reports.ReportInfo("failed area"+et.addScreenCapture(path1));
	}
	
	er.flush();
	er.endTest(et);
}
public  static WebDriver GetDriver()
{
	return driver;
	
}

public static Logger getlog()
{
	return log;
	
}
public static ExtentTest getet()
{
	return et;
	
}

@AfterSuite
public void CloseBrowser()
{
	driver.close();
}

}
