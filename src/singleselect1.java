import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class singleselect1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	 WebDriver driver=new FirefoxDriver();
	 Thread.sleep(2000);
	 driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
	 Thread.sleep(2000);
	WebElement ele = driver.findElement(By.id("select1"));
	Select s = new Select(ele);
	driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("6586848454");
	 Thread.sleep(2000);
	WebElement gender = driver.findElement(By.id("select2"));
	Select s1 = new Select(gender);
	s1.selectByValue("male");
	WebElement cou = driver.findElement(By.id("select3"));	
	Select s2 = new Select(cou);
	s2.selectByValue("India");
	Thread.sleep(2000);
	WebElement stat = driver.findElement(By.id("select5"));	
	Select s3 = new Select(cou);
	s3.deselectByValue("karnataka");
	Thread.sleep(2000);
	//WebElement city = driver.findElement(By.id("select4"));	
	//Select s4 = new Select(cou);
	//s3.deselectByValue("udapi");
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("//button[text()='Continue']"));
	
	
	
	
	
	
	
	
	
}
}
