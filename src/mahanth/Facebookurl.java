package mahanth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebookurl 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 Thread.sleep(2000);
		 driver.get("https://Facebook.com");
		 Thread.sleep(2000);
		 String Title = driver.getTitle();
		 System.out.println(Title);
		 if(Title.equals("FB-log in or sign up"))
		 {
			 System.out.println("YES");
		 }
		 else
		 {
			 System.out.println("FALSE");
			 
		 }
		 String s1=Title;
		 String s2="Facebook";
		 if (s1.contains(s2))
		 {
			 System.out.println("yes");
		 }
		 else
		 {
			 System.out.println("false");
		 }
		 
		 }
}
