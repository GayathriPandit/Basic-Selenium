package advanceScenarios;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBarUsingRobotClass
{
	public static void main(String[] args) throws AWTException ,Throwable
	{
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in");
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 Robot rob = new Robot();
		
		 Thread.sleep(2000);		 
		 rob.keyPress(KeyEvent.VK_PAGE_DOWN);
		 rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
		 
		 Thread.sleep(2000);	
		 rob.keyPress(KeyEvent.VK_PAGE_DOWN);
		 rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
		 
		 Thread.sleep(2000);		 
		 rob.keyPress(KeyEvent.VK_PAGE_UP);
		 rob.keyRelease(KeyEvent.VK_PAGE_UP);
		 
		 
	}

}
