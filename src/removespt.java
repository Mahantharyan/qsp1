import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class removespt
{
public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	 WebDriver driver=new FirefoxDriver();
	 Thread.sleep(2000);
	 driver.get("https://www.facebook.com/r.php");
	 WebElement ele = driver.findElement(By.id("month"));
	 Select s = new Select(ele);
	 List<WebElement> opt = s.getOptions();
	
		 for (WebElement we:opt) 
			{
			String text = we.getText()	;
			
			
					
		
		
	 if(text.equals("Sep"))
	 {
		 System.out.println("yes");
	 }
	 else
	 {
		 System.out.println("no");
	 }
			}
}
}