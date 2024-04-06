package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestionAmazon 
{
	public static void main(String[] args) throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		
	driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("puma");
	
	Thread.sleep(2000);
	
	List<WebElement> allSugg =driver.findElements(By.xpath("//div[@class=\"s-suggestion s-suggestion-ellipsis-direction\"]"));
	for(WebElement sugg:allSugg)
	  {
		System.out.println(sugg.getText());
        //upto here to print all suggestions
		String ele = sugg.getText();
		if(ele.contains("puma sneakers for men"))
		{
			sugg.click();
			break;
		}	
		
	  }
	}

}
