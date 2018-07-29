package com.NewMavenProject1.NewMavenProject1.Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtility {
	public static String GetScreenShot(WebDriver driver,String imgname) throws IOException
	{
		
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	String path="F:\\"+imgname+".jpeg";
	File dest=new File(path);
	FileUtils.copyFile(src, dest);
	return path;

}
}
