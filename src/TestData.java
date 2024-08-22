import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.remote.http.HttpClient.Factory;

public class TestData {
public static void main(String[] args) 
{
	FileInputStream fis = new FileInputStream("./Excel/TestData.xlsx");
   Workbook Book = WorkbookFactory.create(fis);
	Sheet Sheet = Book.getSheet("sheet1");
	Row rw = Sheet.getRow(0);
	Cell cl = rw.getCell(0);
	String usn = cl.getStringCellValue();
	Row rw1 = Sheet.getRow(1);
	Cell cl1 = rw.getCell(0);
	String pwd = cl.getStringCellValue(); 
	System.out.println(usn);
	System.out.println(pwd);
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	
	
	
	
	
	
	
	
	
	
	
	
}
	}
