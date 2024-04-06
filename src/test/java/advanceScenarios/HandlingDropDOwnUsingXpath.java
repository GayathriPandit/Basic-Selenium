package advanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropDOwnUsingXpath {

	public static void main(String[] args) throws Throwable 
	{

		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//option[@value=\"18\"]")).click();

		 driver.findElement(By.xpath("//option[text()=\"May\"]")).click();

		 driver.findElement(By.xpath("//option[text()=\"2016\"]")).click();
	}

}
