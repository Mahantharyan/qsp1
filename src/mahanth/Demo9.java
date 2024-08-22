package mahanth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo9
{
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 Thread.sleep(2000);
		 driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		 	WebElement Name=driver.findElement(By.id("name"));
		 	Name.sendKeys("admin");
		 Thread.sleep(2000);
		 WebElement EmailId=driver.findElement(By.id("email"));
		 EmailId.sendKeys("admin@123.com");
		 Thread.sleep(2000);
		 WebElement Password=driver.findElement(By.name("password"));
		 Password.sendKeys("admin222");
		 Thread.sleep(2000);
		 WebElement login=driver.findElement(By.className("poppins text-[12px] font-sans font-bold text-slate-500 relative top-3 hover:text-slate-700 cursor-pointer underline"));
		 login.click();
		 }
}
