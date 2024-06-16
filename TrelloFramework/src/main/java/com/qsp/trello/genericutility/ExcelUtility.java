package com.qsp.trello.genericutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	

	public String readTheStringDataFromWorkbook(String sheetName, int rowNum, int cellNum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		String value = cell.getStringCellValue();
		return value;
	}
	public double readThedoubleNumericDataFromWorkbook(String sheetName, int rowIndex, int cellIndex ) throws IOException
	{
		FileInputStream fis = new FileInputStream("");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowIndex);
		Cell cell = row.getCell(cellIndex);
		double value = cell.getNumericCellValue();
		return value;
		
	}
	public long readTheLongNumericDataFromWorkbook(String sheetName, int rowNum, int cellNum) throws IOException
	{
		FileInputStream fis = new FileInputStream("");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		 long value = (long)cell.getNumericCellValue();
		return value;
		
	}
	public double readTheNumericDoubleDataFromWorkbook(String sheetName, int rowNum, int cellNum) throws IOException
	{
		FileInputStream fis = new FileInputStream("");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		 long value = (long)cell.getNumericCellValue();
		return value;
		
	}



}
