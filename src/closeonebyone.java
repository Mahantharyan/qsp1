import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class closeonebyone {
public static void main(String[] args) throws InterruptedException {
		
		

		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 Thread.sleep(2000);
		  driver.get("https://skpatro.github.io/demo/links/");
		  Thread.sleep(2000);
		  driver.findElement(By.name("NewWindow")).click();
		  Set<String> alll = driver.getWindowHandles();
		  
		  System.out.println(alll.size());
		  for (String wh : alll) 
		  {
			driver.switchTo().window(wh);
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			driver.close();
		}
		  
}
}
