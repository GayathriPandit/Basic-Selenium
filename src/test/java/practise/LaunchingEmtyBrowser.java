package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingEmtyBrowser 
{
	public static void main(String[] args) 
	{
	//case1: Selenium Version :-3.141.59 and chromedriver.exe
		
	/*	String key = "webdriver.chrome.driver";
		String value = "./chromedriver.exe";
		
		System.setProperty(key,value);
		WebDriver driver = new ChromeDriver();*/
		//this is older approach
   //case 2: Selenium Version :-3.141.59, webdrivermanager:-5.6.3
		
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver = new EdgeDriver();
		
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
		
		
 //case 3: Selenium Version : 4.16.1
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
		
	//	WebDriver driver = new InternetExplorerDriver();
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver=new EdgeDriver();
		}
}
