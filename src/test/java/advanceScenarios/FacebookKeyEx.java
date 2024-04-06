package advanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookKeyEx
{
	@Test
	public static void FacebookKeyEx() throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 
		 
		 driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		 
		 Thread.sleep(1000);
		 WebElement datelist = driver.findElement(By.id("day"));
		 datelist.click();
		 datelist.sendKeys(Keys.ARROW_DOWN);
		 datelist.sendKeys(Keys.ARROW_DOWN);
		 datelist.sendKeys(Keys.ARROW_DOWN);
		 datelist.sendKeys(Keys.ARROW_DOWN);
		 
		 
		WebElement monthlist = driver.findElement(By.id("month"));
		monthlist.click();
		monthlist.sendKeys(Keys.ARROW_DOWN);
		monthlist.sendKeys(Keys.ARROW_DOWN);
		monthlist.sendKeys(Keys.ARROW_DOWN);
		
	}

}
