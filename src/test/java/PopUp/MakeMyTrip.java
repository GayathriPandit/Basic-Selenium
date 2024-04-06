package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip
{
	public static void main(String[] args) throws Throwable 
	{
		//08/02/24
		WebDriver driver = new ChromeDriver();
		driver.get("https://makemytrip.com");
		driver.manage().window().maximize();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()=\"Departure\"]")).click();
		//driver.findElement(By.xpath("//div[text()=\"February 2024\"]/ancestor::div[@class=\"DayPicker-Month\"]/descendant::p[text()=\"20\"]")).click();
		//for feb 20 we have written program
		
		
		String month = "February 2024";
		String date = "15";
		driver.findElement(By.xpath("//div[text()=\""+month+"\"]/ancestor::div[@class=\"DayPicker-Month\"]"
				+ "/descendant::p[text()=\""+date+"\"]")).click();
		//here if we want to change the i/p data we can give data in string value outside the path
		
	
	}

}
