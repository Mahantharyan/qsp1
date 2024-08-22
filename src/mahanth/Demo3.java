package mahanth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo3 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	 WebDriver driver=new FirefoxDriver();
	 
    Thread.sleep(2000);
    driver.get("https://www.facebook.com");
    driver.findElement(By.id("email")).sendKeys("mahanth");
    Thread.sleep(2000);
    driver.findElement(By.name("pass")).sendKeys("mahanth123");
    Thread.sleep(2000);
    driver.findElement(By.name("login")).click();
    Thread.sleep(2000);
   String t = driver.getTitle();
   System.out.println(t);
  String url = driver.getCurrentUrl();
  System.out.println(url);
 String src = driver.getPageSource();
 System.out.println(src);
 driver.close();
    


	

}
}
