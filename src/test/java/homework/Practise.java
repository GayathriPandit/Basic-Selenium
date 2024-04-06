package homework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nyse.com/ipo-center/recent-ipo");
		List<WebElement> rowsNumber = driver.findElements(By.xpath("//*[@data-testid=\"largest-10\"]/tbody/tr"));
		System.out.println(rowsNumber.size());
	
	}

}
