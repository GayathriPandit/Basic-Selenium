package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Meesho 
{
	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.meesho.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[class=\"sc-dkrFOg kAJwOV sc-fbYMXx wGHEP search-input-elm sc-fbYMXx wGHEP search-input-elm\"]")).sendKeys("shoes");
		
		//syntax4: 
		
	}

}
