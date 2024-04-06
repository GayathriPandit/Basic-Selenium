package ExcelPractise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.format.CellDateFormatter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcel 
{
	public static void main(String[] args) throws Throwable 
	{
		//FileInputStream fes = new FileInputStream("D:\\Selenium\\Example.xlsx");//from folder
		FileInputStream fes = new FileInputStream(".\\src\\test\\resources\\Example.xlsx");//from src/test/resources
		Workbook book = WorkbookFactory.create(fes);
	    Sheet sheet = book.getSheet("Contacts");
	    Row row = sheet.getRow(2);
	    Cell cell = row.getCell(1);
	   // String excelData = cell.getStringCellValue(); //from this we cannot fetch numbers
	    //System.out.println(excelData);
	    
	    DataFormatter  data = new DataFormatter();
	    String data1 = data.formatCellValue(cell);
	    System.out.println(data1);
	    
	}
	

}
