 package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingDataFromExcel 
{
	public static void main(String[] args) throws Throwable 
	{
		FileInputStream fes = new FileInputStream("D:\\Selenium\\Example.xlsx");
		//FileInputStream fes = new FileInputStream("./Example.xlsx");//for this save excel file in selenium
		Workbook book = WorkbookFactory.create(fes);
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(1);
		String exceldata = cell.getStringCellValue();
		System.out.println(exceldata);
		//we can fetch alphanumeric but cannot read numbers from this method
		
	}

}
