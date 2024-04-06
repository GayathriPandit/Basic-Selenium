package advanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ProKabbadi 
{
	public static void main(String[] args)
	{
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.google.com/search?q=pro+kabaddi+points+table&oq=pr&gs_lcrp=EgZjaHJvbWUqBggCEEUYOzIGCAAQRRg7MhIIARAuGEMYgwEYsQMYgAQYigUyBggCEEUYOzIGCAMQRRg5MhIIBBAuGEMYgwEYsQMYgAQYigUyBggFEEUYPDIGCAYQRRg8MgYIBxBFGDzSAQgzODkzajBqOagCALACAA&sourceid=chrome&ie=UTF-8");
		
		List<WebElement> names = driver.findElements(By.xpath("//tr[@class=\"tsp-trtb tsp-rr tsp-cbd tsp-hbd\"]"));
		
		
		for(WebElement sugg:names)
		{
			String ele = sugg.getText();
			if(ele.contains("Patna Pirates"))
			{
				System.out.println(sugg.getText());
			}
		}
		
		
	}

}
