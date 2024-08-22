package mahanth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 
{
public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 Thread.sleep(2000);
	 driver.get("https://www.facebook.com");
	 	WebElement usn=driver.findElement(By.id("email"));
	 	usn.sendKeys("admin");
	 Thread.sleep(2000);
	 WebElement pwd=driver.findElement(By.id("pass"));
	 pwd.sendKeys("admin@123");
	 Thread.sleep(2000);
	 WebElement login=driver.findElement(By.name("login"));
	 login.click();
	 
}
}
