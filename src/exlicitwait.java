import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class exlicitwait 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	 WebDriver driver=new FirefoxDriver();	
	 driver.manage().window().maximize();
	 driver.get("https://www.Facebook.com");
	//String title = driver.getTitle();
	 //System.out.println(title);
	/*WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.titleContains(title));
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("mahantharyan");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mahanth99**");
	driver.findElement(By.xpath("//button[@type='submit']")).click();*/
                    String url = driver.getCurrentUrl();
                    System.out.println(url);
                    WebDriverWait wait = new WebDriverWait(driver, 5);
                    wait.until(ExpectedConditions.urlContains(url));
                    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                    WebElement usn=driver.findElement(By.id("email"));
            	 	usn.sendKeys("admin");
             WebElement pwd=driver.findElement(By.id("pass"));
            	 pwd.sendKeys("admin@123");
            	 WebDriverWait wait1 = new WebDriverWait(driver, 5);
            	WebElement ele = driver.findElement(By.name("login"));
            	wait1.until(ExpectedConditions.visibilityOf(ele));
            	ele.click();
            	
            	 
	 
}
}
