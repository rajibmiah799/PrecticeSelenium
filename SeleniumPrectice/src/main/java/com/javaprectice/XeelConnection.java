package com.javaprectice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XeelConnection {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream("./ExcelFile/POST MAN.ods");
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("sheet1");
		String value = sh.getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(value);

	}

}
