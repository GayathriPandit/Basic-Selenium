package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathbyMultipleAttribute
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		
		//syntax1: And
		//htmltag[@AttributeName="AttributeValue" and @AttributeName="AttributeValue"]
		
	    //driver.findElement(By.xpath("//input[@title=\"Search for Products, Brands and More\" and @name=\"q\" ]")).sendKeys("puma");
	    // driver.findElement(By.xpath("//button[contains(@aria-label,\"Search\")]")).click();
	     
	    //syntax2: Or
		
		//driver.findElement(By.xpath("//input[@title=\"Search for Products, Brands and More\" or @name=\"q\" ]")).sendKeys("puma");
	    //driver.findElement(By.xpath("//button[contains(@aria-label,\"Search\")]")).click();
		
		//syntax3: Or
		//htmltag[text()="AttributrValue" and @AttributeName="AttributeValue"]
		//driver.findElement(By.xpath("//span[text()=\"Mobiles\" or @sdjgv=\"bfh\"")).click();
		
		
		
		
		driver.findElement(By.xpath("//input[@title=\"Search for Products, Brands and More\"]")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		List<WebElement> allNames = driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]"));
		List<WebElement> allPrice = driver.findElements(By.xpath("//div[@class=\"_30jeq3 _1_WHN1\"]"));
		
		/* for printing all names
		for(WebElement name: allNames)
		{
			System.out.println(name.getText());
		}*/
		
		for(int i=0;i<allNames.size();i++)
		{
			System.out.println(allNames.get(i).getText()+"\t"+allPrice.get(i).getText());
		}

	}

}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

