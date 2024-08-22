import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.ScreenshotException;

public class takescrenshotint
{
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 Thread.sleep(2000);
		 driver.get("https://www.facebook.com");
	TakesScreenshot ts =(TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	Thread.sleep(2000);
	File dst = new File("C:\\Users\\mr\\OneDrive\\Pictures\\Saved Pictures\\faidedTC1.jpeg");
			FileHandler.copy(src, dst);
		 
		 
		 
}
}
