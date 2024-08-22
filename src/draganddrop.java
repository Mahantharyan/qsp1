import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 Thread.sleep(2000);
		 driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=1");
		 Thread.sleep(2000);
		 WebElement dst = driver.findElement(By.xpath("//"));
			Thread.sleep(2000);
			WebElement dst = driver.findElement(By.xpath("//div[@class='drop-column  min-h-[200px] bg-slate-100']"));
			Thread.sleep(2000);
			Actions act = new Actions(driver);
			Thread.sleep(2000);
			act.dragAndDrop(dst, dst)).perform();
		 

}
}