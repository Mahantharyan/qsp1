package mahanth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multipleframe {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 Thread.sleep(2000);
		 driver.get("file:///C:/Users/mr/OneDrive/Desktop/us%20frame/mp.html");
		 WebElement usn = driver.findElement(By.id("mp"));
		 usn.sendKeys("mahanth");
		 driver.switchTo().frame("frame1");
		 WebElement pwd1 = driver.findElement(By.id("i4"));
		 pwd1.sendKeys("mahanth123");
		 driver.switchTo().defaultContent();
		 driver.switchTo().frame("frame2");
		 WebElement pwd2= driver.findElement(By.id("i1"));
		 pwd2.sendKeys("mahant565");
		 driver.close();
		 
	}

}
