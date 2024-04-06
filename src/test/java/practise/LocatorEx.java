package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorEx 
{
	public static void main(String[] args)
	{
		//launching chrome Browser
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		/*driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();*/
		
		
		//driver.findElement(By.name("user-name")).sendKeys("standard_user");
		//driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		
		//using css selector
		//driver.findElement(By.cssSelector("[data-test=\"username\"]")).sendKeys("standarc_user");
		
		//driver.findElement(By.className("btn_action")).click();
		
		//syntax3:
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		
		//syntax4: htmltag#AttributeValue
		//driver.findElement(By.cssSelector("input#login-button")).click();
		
		
		//class attribute
		driver.findElement(By.cssSelector(".btn_action")).click();
	}

}
