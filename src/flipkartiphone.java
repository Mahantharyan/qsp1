import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipkartiphone 
{
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 Thread.sleep(2000);
		 driver.get("https://www.flipkart.com");
		 WebElement se = driver.findElement(By.xpath("//input[@type='text']"));
		 se.sendKeys("iphones");
		 se.sendKeys(Keys.ENTER);
		 WebElement sch = driver.findElement(By.xpath("//div[@class='KzDlHZ']"));
			sch.click();
		 
		 String pid = driver.getWindowHandle();
		 Set<String> all = driver.getWindowHandles();
			ArrayList<String> l = new ArrayList<String>(all)	;	
					String w = l.get(1);
					driver.switchTo().window(w);
					
}
}
