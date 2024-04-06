package advanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingKeyBoardStrokeUsingKeysClass {

	public static void main(String[] args) 
	{
         WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		
		//Normal Approach
		/*driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();*/
		
		
		//case 1: 
		/*driver.findElement(By.id("user-name")).sendKeys("standard_user");
		WebElement PASSWORD = driver.findElement(By.id("password"));
		PASSWORD.sendKeys("secret_sauce");
		PASSWORD.sendKeys(Keys.ENTER);*/	
	
		/*driver.findElement(By.id("user-name")).sendKeys("standard_user");
		WebElement PASSWORD = driver.findElement(By.id("password"));
		PASSWORD.sendKeys("secret_sauce",Keys.ENTER);*/
		
		
		//case2:
		/*driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce",Keys.ENTER);*/
		
		
		//case3: 
		driver.findElement(By.id("user-name")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER);
		
		
		
	}

}
