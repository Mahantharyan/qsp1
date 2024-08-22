import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class singleselect {
public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	 WebDriver driver=new FirefoxDriver();
	 Thread.sleep(2000);
	 driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
	 Thread.sleep(2000);
	
   ver.findElement(By.id("select1"));
	new Select(ele);
}
}
