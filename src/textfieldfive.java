import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class textfieldfive {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 Thread.sleep(10000);
		 driver.get("file:///C:/Users/mr/OneDrive/Desktop/textfield.html");
	//	 driver.findElement(By.xpath("input type="test"));
		 
}
}	