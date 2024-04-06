package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod 
{
        public static void main(String[] args) throws Throwable

        {
        	WebDriver driver=new ChromeDriver();
        	
        	Thread.sleep(1000);
        	driver.navigate().to("https://www.facebook.com");
        	
        	Thread.sleep(1000);
        	driver.navigate().back();
        	
        	Thread.sleep(1000);
        	driver.navigate().forward();
        	
        	Thread.sleep(1000);
        	driver.navigate().refresh();
        }
}
