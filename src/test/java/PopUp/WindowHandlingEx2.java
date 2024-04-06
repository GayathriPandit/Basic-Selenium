package PopUp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingEx2 
{
public static void main(String[] args) throws Throwable

	{	
		//07/02/24
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[.=\"Open New Seperate Windows\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
     
		Set<String> allIds = driver.getWindowHandles();//win1 win2
   	    System.out.println(allIds);

   	    for (String id : allIds)
 	     {
 		   driver.switchTo().window(id);
 		   String title = driver.getTitle();
 		   System.out.println(title);
 		
 		  if(title.contains("Selenium"))
 		   {
 			  break;
 		   }
 	     }
 	    driver.findElement(By.xpath("//a[text()=\"Watch the Videos\"]")).click();
 	   
 	    
 	    Set<String> allIds1 = driver.getWindowHandles();//win1 win2 //win3
  	    System.out.println(allIds1);

 	    for (String id1 : allIds1)
 	      {
 		     driver.switchTo().window(id1);
 		     String title1 = driver.getTitle();
 		     Thread.sleep(1000);
 		     System.out.println(title1);
 		
 		     if(title1.contains("SeleniumConf Chicago"))
 		     {
 			    break;
 		     }
          }
 	   driver.findElement(By.xpath("//a[@title=\"Selenium: State of the Union - Diego Molina, Sauce Labs\"]")).click();
 	   
 	   //08/02/24
 	  Set<String> allIds2 = driver.getWindowHandles();//win1 win2 //win3
	  System.out.println(allIds2);

	     for (String id2 : allIds2)
        	{
		       driver.switchTo().window(id2);
		       String title2 = driver.getTitle();
		       Thread.sleep(1000);
	        	System.out.println(title2);
		
	     	if(title2.contains("Frames & windows"))
		     {
			   break;
		     }
      
	        }
	    driver.findElement(By.linkText("Home")).click();
	    
	    
	    
	}
}
