package mahanth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo12 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 Thread.sleep(2000);
	 driver.get("https://www.youtube.com");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@id='search']")).sendKeys("pushpa");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//div[@id='thumbnail-container'and]")).click();
	 Thread.sleep(2000);
}
}
