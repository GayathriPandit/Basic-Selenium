package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethod 
{
	public static void main(String[] args) throws Throwable 
	
	{
		
		WebDriver driver = new ChromeDriver();
		/*//driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		//method 1,2,3,4:-sendKeys(),clear(),click(),submit()
		/*WebElement search = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		Thread.sleep(3000);
		search.sendKeys("bluetooth");
		Thread.sleep(3000);
		search.clear();
		Thread.sleep(3000);
		search.sendKeys("puma");
		//driver.findElement(By.xpath("//input[@type()=\"submit\"]")).click();
		search.submit();*/
		
		//method 5:-> getLocation()
		/*WebElement ele=driver.findElement(By.xpath("//a[text()=\"Facebook\"]"));
		Point loc = ele.getLocation();
		System.out.println(loc.getX());
		System.out.println(loc.getY());
		
		
		//method 6:--> getSize()
		Dimension size=ele.getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		
		//method 7:--> getRect()
		Rectangle value = ele.getRect();
		System.out.println(value.getX());
		System.out.println(value.getY());
		System.out.println(value.getHeight());
		System.out.println(value.getWidth());*/
	
	    //method 8:--> getCssValue()
	    /*driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		WebElement search = null;
		String col=search.getCssValue("font-size");
		
	
		
		
		//method9:-->getTagName()
		WebElement logo = driver.findElement(By.id("nav-logo-sprites"));
		String name = logo.getTagName();
		System.out.println(name);
		
		
		//method 10:--> getAttribute()
		String value = logo.getAttribute("class");
		System.out.println(value);
		
		*/
		
		//29/01/24
		
		//WebElement logo = driver.findElement(By.xpath("//a[@id=\"nav-logo-sprites"));
		
		
		//method 12: isEnable
		/*WebElement search = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		if(search.isEnabled())
		{
			search.sendKeys("bluetooth");
		}
		else
		{
			System.out.println("element not found");
		}
		*/
		
		//syntax 13: isSelected
		
		/*driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		Thread.sleep(2000);
		WebElement radiobutton = driver.findElement(By.xpath("//input[@value=\"1\"]"));
		
		if(radiobutton.isSelected())
		{
			System.out.println("radiobutton is selected");
		}
		
		else
		{
			System.out.println("radiobutton is not selected");
		}
		*/
		//syntax 14: 
		//DOM : Document Object Module
		/*WebElement name = driver.findElement(By.name("firstname"));
		Thread.sleep(2000);
		System.out.println(name.getDomAttribute("id"));
		
		//syntax 15:
		WebElement button =driver.findElement(By.xpath("//button[@name=\"websubmit\"]"));
		System.out.println(button.getDomProperty("isConnected"));
		*/
		
		//syntax 16:getAccessibleName()
		/*WebElement name=driver.findElement(By.xpath("//button[@name=\"websubmit\"]"));
		System.out.println(name.getAccessibleName());
		
		//syntax 17: getAriaRole()
		System.out.println(name.getAriaRole());
		
		WebElement radiobutton = driver.findElement(By.xpath("//input[@value=\"1\"]"));
		System.out.println(radiobutton.getAriaRole());
		*/
		
		//syntax 18: getText()
		
		driver.get("https://flipkart.com");
		WebElement bar = driver.findElement(By.name("q"));
		bar.sendKeys("puma");
		bar.submit();
		
		driver.findElement(By.xpath("//a[@title=\""));
				
	}
	
}
