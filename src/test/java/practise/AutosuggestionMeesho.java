package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestionMeesho {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.meesho.com");
		driver.manage().window().maximize();
		
         driver.findElement(By.cssSelector("input[placeholder=\"Try Saree, Kurti or Search by Product Code\"]")).sendKeys("saree");
		Thread.sleep(2000);
		List<WebElement>allSugg=driver.findElements(By.xpath("//p[@class=\"sc-eDvSVe hpsLdS sc-lbVpMG fUgglx sc-lbVpMG fUgglx\"]"));
		for(WebElement sugg:allSugg)
		  {
			System.out.println(sugg.getText());
	        //upto here to print all suggestions
			String ele = sugg.getText();
			if(ele.contains("saree net saree"))
			{
				sugg.click();
				break;
			}	
			
		  }
		
	}

}
