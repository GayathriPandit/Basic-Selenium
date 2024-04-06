package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramePopupEx2 {

	public static void main(String[] args) 
	{
		//06/02/24
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.manage().window().maximize();
				
				driver.get("https://demo.automationtesting.in/Frames.html");
				
				
				/*//*switching from using index value ------>0
				driver.switchTo().frame(0);//for getting index value in inspect //iframe
				
				driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Gayu");*/
				
				/*//*switching from using id and name Attribute value
				driver.switchTo().frame("singleframe");
				driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Gayathri");*/
				
				//*switching from using webElements(locators)
				WebElement txt = driver.findElement(By.xpath("//iframe[@name=\"SingleFrame\"]"));
				driver.switchTo().frame(txt);
				driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Gayathri1");
				
				
				
				
	}

}
