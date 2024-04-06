package advanceScenarios;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBarUsingJavaScriptExecutor {

	public static void main(String[] args) throws Throwable
	{
		//05/02/24
		 WebDriver driver = new ChromeDriver();
		// driver.get("https://www.flipkart.com");
		 driver.get("https://www.amazon.in");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 for(int i=0;i<3;i++)
		 {
			js.executeScript("window.scrollBy(0,200)");
			Thread.sleep(1000);
		 }

		
		 for(int i=0;i<2;i++)
		 {
			js.executeScript("window.scrollBy(0,-200)");
			Thread.sleep(1000);
		 }
		 /*(x,y) x coordinates are used to scroll side ways +ve is rt side, -ve is lt side
		 y coordinates are used to scroll up & down +ve is to move down & -ve is to move upwards
		 magnitude like 200,400 is size of bar, usually is will be given in requrements*/
	}

}
