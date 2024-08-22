import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class withelement
{
public static void main(String[] args) {
	    
	
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	 WebDriver driver=new FirefoxDriver();	
     driver.get("https://demoapps.qspiders.com/ui/progress/element?sublist=2");
     driver.findElement(By.xpath("//input[@placeholder='Enter time in seconds']"));
}
}
