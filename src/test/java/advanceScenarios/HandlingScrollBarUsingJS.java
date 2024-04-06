package advanceScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBarUsingJS {

	public static void main(String[] args) throws Throwable 
	{
		//05/02/24
		/* WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com");
		// driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		WebElement ele = driver.findElement(By.xpath("//a[text()=\"ಕನ್ನಡ\"]"));
		/*Point data = ele.getLocation();
		System.out.println(data.getX());
		System.out.println(data.getY());
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(117,750)");
		ele.click();*/
		//or
		/*JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()",ele);
		ele.click();*/
		
		
		
		
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		/*WebElement ele = driver.findElement(By.xpath("//a[text()=\"Facebook\"]"));
		Point data = ele.getLocation();
		System.out.println(data.getX());
		System.out.println(data.getY());
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(519,1420)");
		ele.click();*/
		
		//to scroll full length
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");

	}

}
