package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Naukri 
{
	public static void main(String[] args) throws Throwable
	{
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.naukri.com");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    WebElement job = driver.findElement(By.xpath("//div[text()=\"Jobs\"]"));
	    
	    //used for mouse over function
	    Actions act =new Actions(driver);
	    act.moveToElement(job).perform();
	    
	    Thread.sleep(1000);
	    
	    driver.findElement(By.linkText("Jobs by skill")).click();
	    
	   WebElement service = driver.findElement(By.xpath("//div[text()=\"Services\"]"));
	   Actions act1 =new Actions(driver);
	   act1.moveToElement(service).perform();
	   Thread.sleep(1000);
	   driver.findElement(By.linkText("Resume Samples")).click();
	}

}
