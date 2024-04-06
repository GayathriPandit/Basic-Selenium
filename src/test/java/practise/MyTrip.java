package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyTrip
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		List<WebElement> AllLinks = driver.findElements(By.xpath("//a"));
		
		/*for(WebElement name: AllLinks)
		{
			System.out.println(name.getText());
		}*/
		
		int count = 0;
		for(WebElement link : AllLinks)
		{
			System.out.println(link.getText());
			count++;
		}
		System.out.println("total num of Links:"+count);
	}

}
