package advanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class HandlingDropDownUsingSelectClass {

	public static void main(String[] args) throws Throwable 
	{
		
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		 
		 Thread.sleep(1000);
		 WebElement dateList = driver.findElement(By.id("day"));
		 //index value starts from 0
		 Select select = new Select(dateList);
		// select.selectByIndex(9);
		// select.selectByValue("20");
		 select.selectByVisibleText("25");//only 
		 
		 WebElement monthList = driver.findElement(By.id("month"));
		 //index value starts from 0
		 Select select1 = new Select(monthList);
		// select1.selectByIndex(5);
		// select1.selectByValue("8");
		 select1.selectByVisibleText("Oct");
		 
		 WebElement yearList = driver.findElement(By.id("year"));
		 //index value starts from 0
		 Select select2 = new Select(yearList);
		// select2.selectByValue("2020");
		 select2.selectByVisibleText("2018");

	}

}
