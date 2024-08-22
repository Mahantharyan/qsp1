import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class slide {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 Thread.sleep(2000);
		 driver.get("https://demoapps.qspiders.com/ui/slider");
		 Thread.sleep(2000);
			WebElement slider= driver.findElement(By.xpath("//input[@type='range']"));
			Actions act= new Actions(driver);
			 Thread.sleep(2000);
			act.dragAndDropBy(slider,200,0).perform();
	}
}