package advanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseActions 

{
	public static void main(String[] args) throws Throwable 
	{	
	//02/02/24
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 
	 //case1
	 /*driver.get("https://www.amazon.in");
	 WebElement ele = driver.findElement(By.xpath("(//a[text()=\"Customer Service\"])[1]"));
	 
	 Actions act = new Actions(driver);
	 act.moveToElement(ele).perform();
	 act.click(ele).perform();
	 //or
	//act.moveToElement(ele).click(ele).perform();*/
	 
	 //case2
	/* driver.get("https://saucedemo.com/v1/");
	 WebElement USERNAME = driver.findElement(By.name("user-name"));
	 WebElement PASSWORD=driver.findElement(By.name("password"));
	 WebElement loginButton=driver.findElement(By.className("btn_action"));
	 
	 Actions act = new Actions(driver);
	 /*act.sendKeys(USERNAME,"standard_user").perform();
		act.sendKeys(PASSWORD,"secret_sauce").perform();
		act.click(loginButton).perform();*/
		
	/*act.sendKeys(USERNAME,"standard_user").sendKeys(PASSWORD,"secret_sauce").click(loginButton).build().perform();*/
	 // when we use multiple action class method in sequence we call build() 
	 
	 
	 //case3
	/* driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	 WebElement drag = driver.findElement(By.id("draggable"));
	 WebElement drop = driver.findElement(By.id("droppable"));
	 Thread.sleep(2000);
	 Actions act = new Actions(driver);
	 //act.clickAndHold(drag).perform();
	 //act.release(drop).perform();
	 //or
	 
	 act.dragAndDrop(drag, drop).perform();*/
	 
	}
}