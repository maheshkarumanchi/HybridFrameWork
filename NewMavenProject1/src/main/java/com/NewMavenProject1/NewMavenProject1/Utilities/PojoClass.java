package com.NewMavenProject1.NewMavenProject1.Utilities;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;



public class PojoClass {
	private static String configFile="F:\\durga\\NewMavenProject1\\src\\main\\java\\com\\NewMavenProject1\\NewMavenProject1\\Objectrepositories\\config.properties";
	private static String ExcelFile="F:\\durga\\NewMavenProject1\\src\\main\\java\\com\\NewMavenProject1\\NewMavenProject1\\Objectrepositories\\book2.xlsx";

	public static PropertiesUtilty getconFigfile() throws IOException
	{
		PropertiesUtilty pf=new PropertiesUtilty(configFile);
		return pf;
	}
	
	public static ExcelFilesutility getExcelFile() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		ExcelFilesutility er=new ExcelFilesutility(ExcelFile);
		return er;
	}}
