package PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup //confirmation popup or java script popup
{
	public static void main(String[] args) 
	{
		//08/02/24
		WebDriver driver = new ChromeDriver();
	    driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    //case1:
	    /*driver.findElement(By.xpath("//button[.=\Click for JS Alert\"]")).click();
	    Alert alt = driver.switchTo().alert();
	    alt.accept();*/
	    //switching driver to alter, no need to create obj for alert, alert is interface
	    
	    //case2:
	    driver.findElement(By.xpath("//button[text()=\"Click for JS Confirm\"]")).click();
	    Alert alt = driver.switchTo().alert();
	    String txt = alt.getText();
	    System.out.println(txt);
	   // alt.dismiss(); //used to select cancel button
	    	    
	    //09/02/24
	    //case2:
	    /*driver.findElement(By.xpath("//button[.=\"Click for JS Prompt\"]")).click();
	    Alert alt1 = driver.switchTo().alert();
	    alt1.sendKeys("welcome");
	    alt1.accept();*/
	    
	}

}
