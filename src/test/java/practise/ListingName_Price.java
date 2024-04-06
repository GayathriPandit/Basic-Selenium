package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListingName_Price 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@title=\"Search for Products, Brands and More\"]")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		List<WebElement> allNames = driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]"));
		List<WebElement> allPrice = driver.findElements(By.xpath("//div[@class=\"_30jeq3 _1_WHN1\"]"));
		
		for(int i=0;i<allNames.size();i++)
		{
			System.out.println(allNames.get(i).getText()+"\t"+allPrice.get(i).getText());
		}
		
	}

}
