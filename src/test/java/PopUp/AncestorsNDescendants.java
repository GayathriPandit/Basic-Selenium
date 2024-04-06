package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AncestorsNDescendants
{
	public static void main(String[] args) 
	{
		//09/02/24
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.flipkart.com");
       driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder=\"Search for Products, Brands and More\"]")).sendKeys("samsung s4 ultra");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		String phone = driver.findElement(By.xpath("//div[text()=\"SAMSUNG Galaxy S24 Ultra 5G (Titanium Gray, 256 GB)\"]")).getText();
		
		String price = driver.findElement(By.xpath("//div[text()=\"SAMSUNG Galaxy S24 Ultra 5G (Titanium Gray, 256 GB)\"]"
				+ "/ancestor::div[@class=\"_3pLy-c row\"]/descendant::div[text()=\"₹1,29,999\"]")).getText();
		System.out.println("phone is: "+ phone +  "price is: "+price);
	}

}
