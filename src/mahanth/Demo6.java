package mahanth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo6
{
public static void main(String[] args) throws InterruptedException {
	
	String key="webdriver.gecko.driver";
	String value="./software/geckodriver.exe";
	System.setProperty(key,value);
	WebDriver driver=new FirefoxDriver();
Thread.sleep(2000);
driver.get("file:///C:/Users/mr/OneDrive/Desktop/link.html");
Thread.sleep(2000);
driver.findElement(By.tagName("a")).click();
}
}