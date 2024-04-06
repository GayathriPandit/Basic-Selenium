package advanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoAutomation 
{
	public static void main(String[] args) throws Throwable 
	{

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("Skills")).click();
		Thread.sleep(1000);
		WebElement skills = driver.findElement(By.id("Skills"));
		
		 Select select = new Select(skills);
		 select.selectByValue("C");
	}

}
