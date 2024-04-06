package advanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeysClassEx 
{
	public static void main(String[] args)
	{
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.saucedemo.com/v1/");
		 driver.manage().window().maximize();
		 
		 //NormalApproach
		 WebElement name = driver.findElement(By.id("user-name"));
		 name.sendKeys("standar_user");
		 name.sendKeys(Keys.CONTROL,"a");//select
		 name.sendKeys(Keys.CONTROL,"c");//copy
		 name.sendKeys(Keys.TAB,Keys.CONTROL,"v");
		 
		/* WebElement word =driver.findElement(By.name("password"));
		 word.sendKeys(Keys.CONTROL,"v");//paste*/
		 
		
	}

}
