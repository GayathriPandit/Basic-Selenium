package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPractice
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		//linktext() locator
		//html code starts with <a  in that select value between >  <
		//driver.findElement(By.linkText("Today's Deals")).click();
		
		//partial linkedtext
		//driver.findElement(By.partialLinkText("Today's")).click();
		
		
		
	}

}
