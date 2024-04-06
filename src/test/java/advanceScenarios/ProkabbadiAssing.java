package advanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ProkabbadiAssing
{
	public static void main(String[] args) 
	{
		WebDriver driver = new EdgeDriver();
		// //html tag[contains(@Attribute name,'Partial Attribute Value')]
		driver.get("https://www.google.com/search?q=pro+kabaddi+points+table&oq=pr&gs_lcrp=EgZjaHJvbWUqBggCEEUYOzIGCAAQRRg7MhIIARAuGEMYgwEYsQMYgAQYigUyBggCEEUYOzIGCAMQRRg5MhIIBBAuGEMYgwEYsQMYgAQYigUyBggFEEUYPDIGCAYQRRg8MgYIBxBFGDzSAQgzODkzajBqOagCALACAA&sourceid=chrome&ie=UTF-8");
		
		List<WebElement> heading = driver.findElements(By.xpath("//th[@class=\"tsp-kscs tsp-cm\"]"));
	    WebElement head = driver.findElement(By.xpath("//span[text()=\"Team\"]"));
	    List<WebElement> name = driver.findElements(By.xpath("//span[@class=\"tsp-w tsp-el tsp-db\"]"));
	    
	  //List<WebElement> allSugg = driver.findElements(By.xpath("//th[@role=\"columnheader\"]"));
		
	  		/*for(int i=0;i<names.size();i++)
	  		{
	  			String text = allSugg.get(i).getText();
	  			if(names.contains("Puneri Paltan"));
	  			{
	  				System.out.println(allSugg.get(i).getText()+" = "+names.get(i).getText());
	  			}
	  			
	  		}*/
	}

}
