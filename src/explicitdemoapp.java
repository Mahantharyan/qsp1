import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitdemoapp 
{
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	 WebDriver driver=new FirefoxDriver();	
	 driver.manage().window().maximize();
	/* driver.get("https://demoapps.qspiders.com/ui/progress?sublist=0");
	   driver.findElement(By.xpath("//button[.='Start']")).click();
	 WebDriverWait wait = new WebDriverWait(driver, 5);
     wait.until(ExpectedConditions.visibilityOf(null));
	 driver.findElement(By.xpath("//button[.='Reset']")).click();
	  WebDriverWait wait1= new WebDriverWait(driver, 10);
     wait.until(ExpectedConditions.visibilityOf(null));
     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  //   driver.findElement(By.xpath("//button[.='Pause']")).click();*/
//	 driver.get("https://demoapps.qspiders.com/ui/progress/timer?sublist=1");
	// driver.findElement(By.xpath("//input[placeholder='Enter time in seconds']")).sendKeys("5");
     
	 
	 driver.get(" https://demoapps.qspiders.com/ui/pageLoad?sublist=0");
	 driver.findElement(By.xpath("//a[.='Open In New Tab']")).click();
	 Set<String> swit = driver.getWindowHandles();
	 for (String wh : swit)
	 {
	driver.switchTo().window(wh);	
	}
	  WebElement ele = driver.findElement(By.id("email")) ;	
	  Point xy = ele.getLocation();
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	 // js.executeScript("window.scrollBy(0,340
	 
	 
	 
	 
	 
	 
	 
	 
}
}