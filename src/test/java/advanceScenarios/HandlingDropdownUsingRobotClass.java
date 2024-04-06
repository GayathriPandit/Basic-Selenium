package advanceScenarios;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropdownUsingRobotClass {

	public static void main(String[] args) throws Throwable
	{
	
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 
		 
		 driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		 
		 Thread.sleep(1000);
		 WebElement dateList = driver.findElement(By.id("day"));
		 dateList.click();
		 Robot rob= new Robot();
		 rob.keyPress(KeyEvent.VK_DOWN);
		 rob.keyRelease(KeyEvent.VK_DOWN);
		 
		 
		 
	}

}
