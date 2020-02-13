package org.excel.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUpdate {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Sridhar\\eclipse-workspace\\Sri\\SelemiunAll\\src\\test\\java\\org\\excel\\selenium\\Excel file\\BookSH.xlsx");
		FileInputStream Ip = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(Ip);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(0);
		Cell c = r.getCell(0);
		System.out.println(c);
		String scvalue = c.getStringCellValue();
		if (scvalue.equals("Sridhar")) {
			c.setCellValue("Sri");
		}
		FileOutputStream Ot = new FileOutputStream(f);
		w.write(Ot);
		System.out.println("Update Done");
	}

}
