package advanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseActions2 
{
	public static void main(String[] args) throws Throwable 
	{
		//02/02/24
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 //case4: rt click
		/* driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		 WebElement ele = driver.findElement(By.xpath("//span[text()=\"right click me\"]"));
		 Actions act = new Actions(driver);
		 //act.contextClick(ele).perform();
		
		WebElement ele2 = driver.findElement(By.xpath("//a[.=\"Insurance Project\"]"));
		act.contextClick(ele2).perform();
		
		WebElement txt = driver.findElement(By.xpath("//button[.=\"Double-Click Me To See Alert\"]"));
		act.doubleClick(txt).perform();*/ //doubleclick()select web element target
		 
		 //case5:movebyoffset: used close popup after launching application
		 driver.get("https://www.agoda.com/");
		 Actions act = new Actions(driver);
		 Thread.sleep(3000);
		 act.moveByOffset(50, 60).click().build().perform();
		 
		 
		 
	}

}
