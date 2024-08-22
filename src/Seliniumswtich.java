import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Seliniumswtich 
{
public static void main(String[] args) throws InterruptedException, AWTException {
	 	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.get("https://www.selenium.dev");
		 WebElement  ele = driver.findElement(By.xpath("//span[.='Downloads']"));
		 WebElement ele1 = driver.findElement(By.xpath("//span[.='Documentation']"));
		 WebElement ele2 = driver.findElement(By.xpath("//span[.='Projects']"));
		 WebElement ele3 = driver.findElement(By.xpath("//span[.='Support']"));
		 WebElement ele4 = driver.findElement(By.xpath("//span[.='Blog']"));
		 ArrayList<WebElement> l= new ArrayList<WebElement>();
		 l.add(ele);
		 l.add(ele1);
		 l.add(ele2);
		 l.add(ele3);
         l.add(ele4);
         
         Actions act = new Actions(driver);
        Robot r = new Robot();
         
        for (WebElement l1 : l) 
        {
		act.contextClick(l1).perform();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(2000);
		}
       
      Set<String> elle = driver.getWindowHandles();
      for (String stng: elle)
      {
		driver.switchTo().window(stng);
	    String title = driver.getTitle();
	    Thread.sleep(2000);
	    System.out.println(title);
	   /* if (title.equals("Blog | Selenium")) 
	    {
		driver.close()	;
		}*/
	    
	    
	    
	    
       }  
	}
		
	
         
         
         
         
         
         
         
         
		 
}

