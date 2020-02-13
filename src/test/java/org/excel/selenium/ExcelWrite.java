package org.excel.selenium;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
     public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Sridhar\\eclipse-workspace\\Sri\\SelemiunAll\\src\\test\\java\\org\\excel\\selenium\\Excel file\\Book2.xlsx");
		
        Workbook w = new XSSFWorkbook();
        Sheet s = w.createSheet("Sheet2");
        Row r = s.createRow(0);
        Cell c = r.createCell(0);
        c.setCellValue("Sridhar Sri");
        System.out.println();
        FileOutputStream Op = new FileOutputStream(f);
        w.write(Op);
        System.out.println("Write done");
	}                
	
}
