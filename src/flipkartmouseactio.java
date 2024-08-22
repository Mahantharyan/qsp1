import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkartmouseactio {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 Thread.sleep(2000);
//mouseoveraction		// driver.get("https://demoapps.qspiders.com/ui/mouseHover?sublist=0");
		/* Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//img[@src='/assets/message-hint-J20Zlhln.png']"));
		 Actions act = new Actions(driver);
		 act.moveToElement(ele).perform();
		 driver.close();*/
     driver.get("https://demoapps.qspiders.com/ui/mouseHover/rating?sublist=2");
		 Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("(//label)[4]"));
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(ele).perform();
   /*    driver.get("https://demoapps.qspiders.com/ui/mouseHover/tab?sublist=3");
        Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//li[@class='HomeAndLiving relative']"));
		 Actions act = new Actions(driver);
		 act.moveToElement(ele).perform();
		 Thread.sleep(2000);
		 driver.close();*/
}
}
	