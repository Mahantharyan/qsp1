package mahanth;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebMethod
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	 WebDriver driver=new FirefoxDriver();
	 Thread.sleep(2000);
	 driver.navigate().to("https://google.com");
	 Thread.sleep(2000);
	 WebElement ele = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
	 boolean res =ele.isDisplayed();
	 System.out.println(res);
	 boolean res1 = ele.isEnabled();
	 System.out.println(res1);
	 Thread.sleep(2000);
	 ele.sendKeys("klm");
	Thread.sleep(2000);
	 ele.clear();
	 Thread.sleep(2000);
	 WebElement ele1 = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
	 String text = ele1.getText();
 System.out.println(text);
	 Thread.sleep(2000);
	 String att = ele.getAttribute("id");
	 Thread.sleep(2000);
	 System.out.println(att);
	 Point locn = ele1.getLocation();
	 System.out.println(locn);
	 String fsize = ele.getCssValue("font-size");
	 System.out.println(fsize);
	 Thread.sleep(2000);
	 System.out.println(ele.getSize().getHeight());
	 System.out.println(ele.getSize().getWidth());
	 Thread.sleep(2000);
	 driver.manage().window().maximize();
 driver.navigate().to("https://facebook.com");
	 Thread.sleep(2000);
	 driver.navigate().forward();
	 Thread.sleep(2000);
	 driver.navigate().back();
	 Thread.sleep(2000);
	driver.navigate().refresh();
    Dimension D = new Dimension(500,799);
	 driver.manage().window().setSize(D);
	 Thread.sleep(2000);
	 Point P = new Point(600, 700);
	 driver.manage().window().setPosition(P);
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
}
