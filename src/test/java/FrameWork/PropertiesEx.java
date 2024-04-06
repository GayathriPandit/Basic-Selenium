package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ObjectRepo.HomePage;
import ObjectRepo.LoginPage;

public class PropertiesEx {

	public static void main(String[] args) throws Throwable  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1");
		
		//using id() locator
		/*driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();*/
		
		
		FileInputStream fis = new FileInputStream("D:\\Selenium\\Properties.properties.txt");
		Properties pro = new Properties();
		pro.load(fis);
		String URL = pro.getProperty("url");
		String USERNAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");
		driver.get(URL);
		
		//normal approach
		/*driver.findElement(By.id("user-name")).sendKeys(USERNAME);
		driver.findElement(By.id("password")).sendKeys(PASSWORD);
		driver.findElement(By.id("login-button")).click();*/
		
		//using getter methods
		LoginPage login=new LoginPage(driver);
		//fetched from pom class in object repo package
		/*login.getUSERTEXT().sendKeys(USERNAME);
		login.getPASSWORDTEXT().sendKeys(PASSWORD);
		login.getLOGIN().click();*/
		
		//using business logic
		login.loginToApp(USERNAME, PASSWORD);
		
		
		HomePage home = new HomePage(driver);
		home.clickText();
		home.printPrice();
		
		
	}

}
