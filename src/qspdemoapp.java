import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class qspdemoapp
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("./Excel/TestData.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet2");
		Row rw = sheet.getRow(0);
		Cell c = rw.getCell(0);
		String us = c.getStringCellValue();
		/*Row rw1 = sheet.getRow(1);
		Cell c1 = rw.getCell(0);
		String us1 = c1.getStringCellValue();*/
		
		System.out.println(us);
	//	System.out.println(us1);
		
	
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.get("https://demoapps.qspiders.com/ui/formValidation?sublist=0");
	
	
	
	
	
	
	}
	}

