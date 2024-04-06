package practise;

import java.util.List;

import org.openqa.selenium.By;
//org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment
{
		public static void main(String[] args)
		{			
	      WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("http://www.amazon.in");
	      WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
	      ele.sendKeys("samsung");
	      ele.submit();

	      List<WebElement> names = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']//div[@class='a-section a-spacing-small a-spacing-top-small']//h2"));
	      List<WebElement> Allprice = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']//span[@class='a-price-whole']"));
	      
	      for(int i=0;i<names.size();i++)
	      {
	         String text = Allprice.get(i).getText();
	    	 String myPrice = text.replaceAll(",", "");
	 	     int ActualPrice = Integer.valueOf(myPrice);
	    	 
	    	  if(ActualPrice<=18000)
	    	  {
	    		  System.out.println(names.get(i).getText()+" = "+Allprice.get(i).getText());
	    	  }
	      }
	      driver.quit();
		}	

}