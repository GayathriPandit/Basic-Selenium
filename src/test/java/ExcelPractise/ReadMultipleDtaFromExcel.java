package ExcelPractise;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class ReadMultipleDtaFromExcel 
{
	public static void main(String[] args) throws Throwable
	{
		
	 Workbook wb = WorkbookFactory.create(new FileInputStream(".\\src\\test\\resources\\Example.xlsx"));
	 Sheet sh = wb.getSheet("Data");
	 int row = sh.getLastRowNum();
	 
	 for(int i=0;i<=row;i++)
	 {
		 Row r = sh.getRow(i);
		 short rows = r.getLastCellNum();
		 for(int j=0;j<=rows;j++)
		 {
			org.apache.poi.ss.usermodel.Cell c = r.getCell(j);
			DataFormatter dataFormatter = new DataFormatter();
			String data = dataFormatter.formatCellValue(c);
			System.out.println(data);
		 }
	 }
	}

}
