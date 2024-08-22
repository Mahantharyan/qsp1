import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class images {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 Thread.sleep(2000);
		 driver.get("https://Amazon.com");
		 Thread.sleep(2000);
		  List<WebElement> links = driver.findElements(By.xpath("//img"));
		  int count=links.size();
		  System.out.println(count);
		  for (WebElement webElement : links) {
			System.out.println(webElement.getAttribute("src"));
		}
  
	}
	}
