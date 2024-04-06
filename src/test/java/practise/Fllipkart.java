package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Fllipkart {
public static void main(String[] args) 
{
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.cssSelector("[class=\"Pke_EE\"]")).sendKeys("puma");
	driver.findElement(By.cssSelector("[class =viewBox=\"0 0 24 24\"]")).click();
}
}