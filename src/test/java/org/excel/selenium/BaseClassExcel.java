package org.excel.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BaseClassExcel {
	public static String getData(int rowno, int cellno) throws Exception {
		File f = new File("C:\\Users\\Sridhar\\eclipse-workspace\\Sri\\SelemiunAll\\src\\test\\java\\org\\excel\\selenium\\Excel file\\BookSH.xlsx");
		FileInputStream Ip = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(Ip);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(rowno);
		Cell c = r.getCell(cellno);
		System.out.println(c);
		String name = null;
		int type = c.getCellType();
		
		if (type==1) {
			name = c.getStringCellValue();
		}
			else if (type == 0) {
				if (DateUtil.isCellDateFormatted(c)) {
				Date date = c.getDateCellValue();
				SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
				name = sdf.format(date);
						
			} 
			}
			else {
				double d = c.getNumericCellValue();
				long l = (long)d;
				name = String.valueOf(l);
				
			}
		return name;
		
	}
	public static void main(String[] args) throws Exception {
//		getData(0,0);
		System.out.println(getData(0,1));
	}
	
	
	}




