package mahanth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frameofmainpage
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	 WebDriver driver=new FirefoxDriver();
	 Thread.sleep(2000);
	 driver.get("file:///C:/Users/mr/OneDrive/Desktop/mainpage.html");
	 WebElement usn = driver.findElement(By.id("mp"));
	 usn.sendKeys("mahanth");
	// driver.switchTo().frame("f1");//using id of the frae
	 WebElement frm1 = driver.findElement(By.xpath("//iframe[@src='Frame1.html']"));
	 driver.switchTo().frame(frm1);
	 WebElement Ln = driver.findElement(By.id("mp"));
	 Ln.sendKeys("mahanth123");
	 driver.switchTo().frame(0);//using index of the frame
	 WebElement us = driver.findElement(By.id("t3"));
	 us.sendKeys("chite");
	 driver.switchTo().defaultContent();
	 
	 driver.switchTo().frame(0);
	WebElement email = driver.findElement(By.id("t4"));
	 email.sendKeys("ms");
	// driver.switchTo().parentFrame();
	
	// driver.switchTo().defaultContent();
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
}