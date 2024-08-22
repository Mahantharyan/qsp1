import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxfel {


public static void main(String[]args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 Thread.sleep(10000);
	 driver.get("file:///C:/Users/mr/OneDrive/Desktop/us%20frame/checkbox.html");
	   List<WebElement> links = driver.findElements(By.xpath("//input"));
	   int count=links.size();
	   Thread.sleep(2000);
	   System.out.println(count);
	   for (WebElement webElement : links)
	   {
		 webElement.click();
		
	}
	   for(int j=count-1;j>=0;j--)
		  {
		   Thread.sleep(2000);
			 WebElement we1 = links.get(j);
			we1.click();
		  } 
	    
		  
}
}