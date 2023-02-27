package com.UtilsPractice;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderfb {
	private static XSSFWorkbook workbook;
	public ExcelReaderfb(String filepath) {
		
		File f = new File(filepath);
		
		try {
		FileInputStream fis = new FileInputStream(f);
		workbook = new XSSFWorkbook(fis);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getData(int sheet, int row, int col) {
		
		XSSFSheet  sheets = workbook.getSheetAt(sheet);
		String data= sheets.getRow(row).getCell(col).getStringCellValue();
		return data;
	}

}
