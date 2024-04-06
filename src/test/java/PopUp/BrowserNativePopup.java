package PopUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserNativePopup {

	public static void main(String[] args) 
	{
		//09/02/24
		//for browser popup which cannot be inspected by usual inspect
		/*ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
	    WebDriver driver = new ChromeDriver(opt);
	    driver.get("https://www.irctc.co.in/nget/train-search");
	    driver.manage().window().maximize();*/
		
		
		//to navigate to incognito
	    ChromeOptions opt = new ChromeOptions();
	    opt.addArguments("--incognito");
	    WebDriver driver = new ChromeDriver(opt);
	    driver.get("https://www.facebook.com");
	    driver.manage().window().maximize();
	    
	}

}
