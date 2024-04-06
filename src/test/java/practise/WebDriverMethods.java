package practise;

import java.awt.Window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods 
{
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	//we don't run more than one method in a class
	
	
	//method 1: get() --> launching web application
	//driver.get("https://www.flipkart.com");
	driver.get("https://www.amazon.in");
	
	//method 2: getTitle() -->fetches the title of the webpage
	String title=driver.getTitle();
	System.out.println(title);
	
	//method 3:getPagesource() --> fetches the source code
	//String source=driver.getPageSource();
	//System.out.println(source);
	
	//method 4: get current url
	String URL = driver.getCurrentUrl();
	System.out.println(URL);
	
	//method 5: 
	/*Options opt =driver.manage();
	Window win = opt.window();
	win.maximize();*/
	
	driver.manage().window().maximize();
	
	driver.manage().window().fullscreen();
	
	driver.manage().window().minimize();
	
	
	
	//method 6: closes single tab/window, driver currently focusing
	//driver.close();
	
	//method 7: closes all the tabs/windows including browser
	//driver.quit();
	
}
}
