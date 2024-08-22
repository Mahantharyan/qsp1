import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
public static void main(String[] args) throws InterruptedException 
{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 Thread.sleep(2000);
		 driver.get("file:///C:/Users/mr/OneDrive/Desktop/dropdown.html");
		 WebElement ele = driver.findElement(By.id("nandanas"));
		 Select s = new Select(ele);
		 s.selectByIndex(2);
		 Thread.sleep(2000);
		 s.selectByValue("n");
		 Thread.sleep(2000);
		 s.selectByVisibleText("chicken lolipop biriyani");
		 Thread.sleep(2000);
		s.deselectAll();
		
		 
}
}
