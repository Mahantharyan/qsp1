import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class closebrowser 
{
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 Thread.sleep(2000);
		 Robot r =new Robot();
		 r.keyPress(KeyEvent.VK_WINDOWS);
		 r.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(2000);
		 r.keyRelease(KeyEvent.VK_WINDOWS);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_ALT);
		 r.keyPress(KeyEvent.VK_F4);
		 r.keyRelease(KeyEvent.VK_ALT);
		 r.keyRelease(KeyEvent.VK_F4);
		 
		 
		 
}
}