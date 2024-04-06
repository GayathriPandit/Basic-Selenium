package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramePopupEx1
{

	public static void main(String[] args) 
	{
		//06/02/24
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//approaches
		//*switching from using index value ------>0
		//*switching from using id and name Attribute value
		//*switching from using webElements(locators)
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
	WebElement drag = driver.findElement(By.id("draggable"));
	WebElement drop = driver.findElement(By.id("droppable"));	
	
	Actions act =new Actions(driver);
	act.dragAndDrop(drag, drop).perform();
		
	}

}
