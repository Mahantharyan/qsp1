package mahanth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Instagram 
{
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	 WebDriver driver=new FirefoxDriver();
	 Thread.sleep(2000);
	 driver.get("https://Instagram.com");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("mahantharyan");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mahanth99**");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 Thread.sleep(2000);
}
}