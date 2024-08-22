import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class childbrowserpopup {
	public static void main(String[] args) throws InterruptedException {
		
	

	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	 WebDriver driver=new FirefoxDriver();
	 Thread.sleep(2000);
	  driver.get("https://www.google.co.in");
	  String parent = driver.getWindowHandle();
	  System.out.println(parent);
	 
	 
}
}