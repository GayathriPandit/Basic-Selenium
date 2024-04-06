package advanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWebElements {

	public static void main(String[] args) 
	{
		//05/02/24
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in");
	List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
	
	int count=0;
	for(WebElement link:allLinks)
	{
		System.out.println(link.getText());
		//System.out.println(link.getAttribute("href"));
		count++;
	}
		System.out.println("total no.of links: "+count);
	}

}
