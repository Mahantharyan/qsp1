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

public class googleswitch
{
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 Thread.sleep(2000);
		 driver.get("https://www.google.com/");
		 WebElement ele = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
		 Actions act= new Actions(driver);
		 Thread.sleep(2000);
		 act.contextClick(ele).perform();
		 Robot r =new Robot();
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
			String pid = driver.getWindowHandle();
			Set<String> all = driver.getWindowHandles();
		ArrayList<String> l = new ArrayList<String>(all)	;	
				String w = l.get(1);
				driver.switchTo().window(w);
		}
			
			
			
			
			
			
			
			
			
}

