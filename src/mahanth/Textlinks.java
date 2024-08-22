package mahanth;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Textlinks {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 Thread.sleep(2000);
		 driver.get("https://Amazon.com");
		 Thread.sleep(2000);
		  List<WebElement> links = driver.findElements(By.xpath("//a"));
		  int count=links.size();
		  System.out.println(count);
		  for(int i=0;i<count;i++)
		  {
			 WebElement we = links.get(i);
			 System.out.println(we.getText());
			  
		  }
	}
}