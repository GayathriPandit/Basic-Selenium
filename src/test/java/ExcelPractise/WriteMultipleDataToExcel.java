package ExcelPractise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WriteMultipleDataToExcel {

	public static void main(String[] args) throws  IOException
	{
		//22/02/24
		WebDriver driver = new EdgeDriver();
		
		FileInputStream fes = new FileInputStream(".\\src\\test\\resources\\Example.xlsx");
		
		//Step 2: open workbook in read mode
		Workbook book = WorkbookFactory.create(fes);
		
		//step 3: get control to the sheet
		Sheet sheet = book.getSheet("Data");
		
		driver.get("https://www.amazon.in");
	    List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
	    
	    int count = allLinks.size();
	    for(int i = 0;i<count;i++)
	    {
	    	Row row = sheet.createRow(i);
	    	Cell cell = row.createCell(0);
	    	cell.setCellValue(allLinks.get(i).getAttribute("href"));
	    }
	    
	     FileOutputStream fos = new FileOutputStream(".\\src\\test\\resources\\Example.xlsx");
	     book.write(fos);
	     book.close();
	     	
	}

}
