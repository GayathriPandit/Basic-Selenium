package ExcelPractise;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class InsertDataToPropertiesClass
{
	public static void main(String[] args) throws Throwable 
	{
		Properties pro = new Properties();
		pro.setProperty("username", "admin");
		pro.setProperty("password", "admin");
		pro.setProperty("url","http://localhost:8888/");
		
	    FileOutputStream fos = new FileOutputStream(".\\src\\test\\resources\\CommonData.properties.txt");
		pro.store(fos, "Common Data");
		System.out.println("data written successfully");
	}

}
