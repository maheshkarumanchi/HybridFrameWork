package com.NewMavenProject1.NewMavenProject1.Testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.NewMavenProject1.NewMavenProject1.Utilities.ActionEngine;
import com.NewMavenProject1.NewMavenProject1.Utilities.DriverUtility;
import com.NewMavenProject1.NewMavenProject1.Utilities.ExtentReport;
import com.NewMavenProject1.NewMavenProject1.Utilities.LogUtility;
import com.NewMavenProject1.NewMavenProject1.Utilities.PojoClass;

public class OnlineStoresValidationtest extends DriverUtility {
	@Test
	public void OnlineStoretest() throws IOException, InterruptedException
	{
	DriverUtility.GetDriver().get(PojoClass.getconFigfile().getPropertyValue("OnlineStore"));
	ExtentReport.ReportInfo("application is successfully launched");
	LogUtility.LogInfo("Aplication is succesfully launched"+DriverUtility.GetDriver().getTitle());
	WebElement E1=DriverUtility.GetDriver().findElement(By.xpath("//nav/ul/li[3]/a/span/span/span"));
	ExtentReport.ReportInfo("element stored in E1");
	Thread.sleep(2000);
	ActionEngine.MouseHour(E1);
	WebElement E2=DriverUtility.GetDriver().findElement(By.xpath("//nav/ul/li[3]/a/span/span/span"));
	
	ActionEngine.MouseHour(E2);
	}

}
