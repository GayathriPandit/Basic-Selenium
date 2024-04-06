package advanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSvgElements 
{
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.kayak.co.in");
	
		driver.manage().window().maximize();

		//syntax:- //*[name()="svg"]
		
		//*[name()="svg" and @AttributeName="AttributeVAlue"]
		driver.findElement(By.xpath("//*[name()=\"svg\" and @class=\"c8LPF-icon\"]")).click();
	}
	
}
