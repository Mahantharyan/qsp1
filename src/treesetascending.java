import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class treesetascending {
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 Thread.sleep(2000);
		 driver.get("https://www.facebook.com/r.php");
		 WebElement ele = driver.findElement(By.id("month"));
		 Select s = new Select(ele);
		 List<WebElement> opt = s.getOptions();
		 TreeSet<String>t=new TreeSet<String>();
		for(WebElement we:opt)
		{	
		String text = we.getText() ;
		t.add(text);
		 
}
		for (String l1 : t) {
			System.out.println(l1);
			
		}
		
		
}
}