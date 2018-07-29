package com.NewMavenProject1.NewMavenProject1.Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtilty {
	private String filePath;
	private FileInputStream fip;
	private Properties pr;
	public PropertiesUtilty(String filePath) throws IOException
	{
		this.filePath=filePath;
		fip = new FileInputStream(filePath);
		pr = new Properties();
		pr.load(fip);
	}
	public String getPropertyValue(String key)
	{
		String value = pr.getProperty(key);
		return value;
	}
	
	public void setPropertyValue(String key,String value) throws IOException
	{
		pr.setProperty(key, value);
		FileOutputStream fop = new FileOutputStream(filePath);
		pr.store(fop, "succesfully saved the data");
	}
	
	public void removeProperty(String key) throws IOException
	{
		pr.remove(key);
		FileOutputStream fop = new FileOutputStream(filePath);
		pr.store(fop, "succesfully saved the data");
	}
	
	


}
