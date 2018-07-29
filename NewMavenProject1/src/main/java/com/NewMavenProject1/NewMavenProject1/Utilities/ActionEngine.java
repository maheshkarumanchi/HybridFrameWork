package com.NewMavenProject1.NewMavenProject1.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class ActionEngine {
	private static WebElement element;
	private static Actions action=new Actions(DriverUtility.GetDriver());
	public ActionEngine() {
		
	}
	public static void clickAction(String locatormechanism,String locator)
	{
		String locmech=locatormechanism;
		switch(locmech)
		{
		case"id":
		element=DriverUtility.GetDriver().findElement(By.id(locator));
		if(element.isDisplayed()&&element.isEnabled())
		{
			element.click();
		}break;
		case"css":
			element=DriverUtility.GetDriver().findElement(By.cssSelector(locator));
			if(element.isDisplayed()&&element.isEnabled())
			{
				element.click();
			}break;
			
		}
	
	}
public static void MouseHour(WebElement element)
{
	action.moveToElement(element).build().perform();
}
public static void SenKeysAction(String locatormechanism,String locator,String testdata)
{
	String locmech=locatormechanism;
	switch(locmech)
	{
	case"id":
		element=DriverUtility.GetDriver().findElement(By.id(locator));
		if(element.isDisplayed()&&element.isEnabled())
		{
			element.sendKeys(testdata);
		}break;
	case"cssSelector":
		element=DriverUtility.GetDriver().findElement(By.id(locator));
		if(element.isDisplayed()&&element.isEnabled())
		{
			element.sendKeys(testdata);
		}break;
		
		
	}
	
	
}
public static void dropDown(WebElement elementone,String dropDownSelect,String dropDownData)
{
	String tagName = elementone.getTagName();
	if (tagName.equalsIgnoreCase("select")) {
		Select select = new Select(elementone);

switch(dropDownSelect)
{
case "value":
select.selectByValue(dropDownData);
break;
case "text":
select.selectByVisibleText(dropDownData);
break;
case "index":
select.selectByIndex(Integer.parseInt(dropDownData));
break;
}
	}

	
}
}
