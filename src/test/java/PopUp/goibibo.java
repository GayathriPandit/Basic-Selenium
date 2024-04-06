package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class goibibo 
{
	@Test
	public static void goibibo() throws Throwable
	{
		//08/02/24 assessment
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class=\"logSprite icClose\"]")).click();
		driver.findElement(By.xpath("//span[@class=\"sc-12foipm-22 cUvQPq fswDownArrow\"]")).click();

		String month = "February 2024";
		String date = "20";
		driver.findElement(By.xpath("//div[text()=\""+month+"\"]/ancestor::div[@class=\"DayPicker-Month\"]"
				+ "/descendant::p[text()=\""+date+"\"]")).click();
	
	}

}
