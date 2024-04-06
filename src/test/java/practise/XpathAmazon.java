package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAmazon
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		
		//xpath by attribute()
		/*  //syntax1: //htmltag[@Attrribute="AttributeValue"] 
		//html tag[@Attributename='Attribute value']      
		@->Search given value only in attribute.*/
		//driver.findElement(By.xpath("//a[@data-csa-c-slot-id=\"nav_cs_1\"]")).click();
		//driver.findElement(By.xpath("//a[text()=\"Amazon miniTV\"]")).click();
	
		//xpath by text()
		/* //syntax2: //htmltag[text()="AttributeValue"]  
	    //html tag[text()='Complete_visible_text']        
		text()->It is xpath function which search given value only in visible text.*/
		
		//driver.findElement(By.xpath("//span[text()=\"Web Series\"]")).click();
	
	    //xpath by contains Attribute()
		//syntax3: //htmltag[contains(@AttributeName."AttributeValue")]
		driver.findElement(By.xpath("//input[contains(@id,\"tw\")]")).sendKeys("Nike");
	
		//xpath by contains text()
		//syntax4:  //htmltag[contains(text(),"AttributeValue")]
		//driver.findElement(By.xpath("//a[contains(text(),\" Electronics \")]")).click();
		driver.findElement(By.xpath("//a[contains(text(),\"Ideas\")]")).click();
	
	}

}
