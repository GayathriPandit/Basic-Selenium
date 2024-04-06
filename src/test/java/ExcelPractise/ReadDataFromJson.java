package ExcelPractise;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadDataFromJson {

	public static void main(String[] args) throws Throwable, IOException {
		
		File file = new File("D:\\Selenium\\JasonFileData.json");
		
		ObjectMapper jasonData = new ObjectMapper();
		JsonNode data = jasonData.readTree(file);
		
		String URL = data.get("url").asText();
      	String USERNAME = data.get("username").asText();
    	String PASSWORD = data.get("password").asText();
    	
    	WebDriver driver = new ChromeDriver();
    	driver.get(URL);
	}

}
//JsonParseException