package com.NewMavenProject1.NewMavenProject1.Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFilesutility {
	private String filepath;
	private FileInputStream fip;
	private static Workbook wb;
	private static Sheet sh;
	public ExcelFilesutility(String filepath) throws EncryptedDocumentException, InvalidFormatException, IOException {
		this.filepath=filepath;
		fip=new FileInputStream(filepath);
		wb=WorkbookFactory.create(fip);
	}
	public static String getCellData(String sheetname,int rwno,int colno)
	{
		sh=wb.getSheet(sheetname);
		Row r=sh.getRow(rwno);
		Cell c=r.getCell(colno);
		String celldata=c.getStringCellValue();
		return celldata;
	}

}
