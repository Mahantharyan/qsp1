import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class renovaljan {
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	 WebDriver driver=new FirefoxDriver();
	 Thread.sleep(2000);
	 driver.get("https://www.facebook.com/r.php");
	 WebElement ele = driver.findElement(By.id("month"));
	 Select s = new Select(ele);
	 List<WebElement> opt = s.getOptions();
	 ArrayList<String> l=new ArrayList<String>()	; 
		for (WebElement we:opt) 
		{
		String text = we.getText()	;
		l.add(text);
		
		}
		l.remove("Jan");
		for (String l1 : l) {
		System.out.println(l1 );	
		}
	 
}
}
