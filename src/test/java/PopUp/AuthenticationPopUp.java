package PopUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {

	public static void main(String[] args)
	{
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://the-internet.herokuapp.com/basic_auth");
	   driver.manage().window().maximize();
	   
	   //driver.get("https://username:password@Url")
	   
	   driver.get("https://the-internet.herokuapp.com/basic_auth");
	
	}
}
