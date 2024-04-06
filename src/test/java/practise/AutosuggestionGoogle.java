package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestionGoogle {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]")).sendKeys("selenium");
		
		Thread.sleep(2000);
		
		List<WebElement>allSugg=driver.findElements(By.xpath("//li[@class=\"sbct PZPZlf\"]"));
		for(WebElement sugg:allSugg)
		{
			System.out.println(sugg.getText());
		}
		
		
	}

}
