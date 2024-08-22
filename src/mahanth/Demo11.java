package mahanth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.ClickAction;

public class Demo11
{
public static void main(String[] args) throws InterruptedException {
	String key="webdriver.gecko.driver";
	String value="./software/geckodriver.exe";
	System.setProperty(key,value);
	WebDriver driver1=new FirefoxDriver();
Thread.sleep(2000);
driver1.get("https://www.youtube.com");
Thread.sleep(2000);
driver1.findElement(By.cssSelector("input[type='text']")).sendKeys("kgf trailer");
Thread.sleep(2000);
driver1.findElement(By.cssSelector("input[id='search']")).click();
}
}
