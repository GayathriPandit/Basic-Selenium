package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandlingEx3 
{
	public static void main(String[] args) 
	{
		//06/02/24
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/frames ");
		
		driver.findElement(By.linkText("Nested Frames")).click();
		WebElement top = driver.findElement(By.xpath("//frame[@name=\"frame-top\"]"));
		driver.switchTo().frame(top);
		
		WebElement leftFrame = driver.findElement(By.xpath("//frame[@name=\"frame-left\"]"));
		driver.switchTo().frame(leftFrame);
		
		String ele=driver.findElement(By.xpath("//body[contains(text(),\"LEFT\")]")).getText();
		System.out.println(ele);
		
		//07/02/24
		
		driver.switchTo().parentFrame();
		WebElement midFrame = driver.findElement(By.xpath("//frame[@name=\"frame-middle\"]"));
		driver.switchTo().frame(midFrame);
		
		String ele2=driver.findElement(By.xpath("//div[text()=\"MIDDLE\"]")).getText();
		System.out.println(ele2);
		
		driver.switchTo().defaultContent();
		
		WebElement bottom = driver.findElement(By.xpath("//frame[@name=\"frame-bottom\"]"));
		driver.switchTo().frame(bottom);
		
		String ele3=driver.findElement(By.xpath("//body[contains(text(),\"BOTTOM\")]")).getText();
		System.out.println(ele3);
	}

}
