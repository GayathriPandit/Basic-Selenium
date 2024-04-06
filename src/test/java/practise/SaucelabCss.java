package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SaucelabCss 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		//syntax1: [AttributeName = AttributeValue"]
		//driver.findElement(By.cssSelector("[data-test=\"username\"]")).sendKeys("standard_user");
		//driver.findElement(By.cssSelector("[id=\"password\"]")).sendKeys("secret_sauce");
		
		//syntax2: html[Attributename="AttributeValue"]
		//driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		
		
		//syntax3: #AttributeValue [# indicate id() in cssSelector]
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		
		//syntax4: htmltag#AttributeValue [# indicate id() in cssSelector]
		//driver.findElement(By.cssSelector("input#login-button")).click();
		
		//syntax5: .AttributeValue [. indicate class() in cssSelector]
		//driver.findElement(By.cssSelector(".btn_action")).click();
		
		//syntax6: html.AttributeValue
		driver.findElement(By.cssSelector("input.btn_action")).click();
		
	}
}