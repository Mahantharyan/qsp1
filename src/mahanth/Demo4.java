package mahanth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo4 
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 Thread.sleep(2000);
	 driver.get("https://www.facebook.com/");
	 driver.close();

	 String key="webdriver.gecko.driver";
		String value="./software/geckodriver.exe";
		System.setProperty(key,value);
		WebDriver driver1=new FirefoxDriver();
	Thread.sleep(2000);
	driver.get("https://www.youtube.com/");
}
}
