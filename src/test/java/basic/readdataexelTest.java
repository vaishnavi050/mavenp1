package basic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class readdataexelTest {
	
	
 
	@Test

	public void mvnTest() throws EncryptedDocumentException, IOException {
		final WebDriver driver; 

	FileInputStream ex=new FileInputStream("src\\test\\resources\\vtigercrm.xlsx");
	
	Workbook wb=WorkbookFactory.create(ex);
	Sheet sh=wb.getSheet("Sheet1");
	
	Row rw = sh.getRow(0);
	Cell cl = rw.getCell(1);
	String browser=cl.getStringCellValue();
	
	Row r= sh.getRow(1);
	Cell c= r.getCell(1);
	String url=c.getStringCellValue();
	
	Row us= sh.getRow(2);
	Cell uss= us.getCell(1);
	String  user=uss.getStringCellValue();
	
	Row pw = sh.getRow(3);
	Cell p = pw.getCell(1);
	String pwd=p.getStringCellValue();
	
	
	
	if(browser.equalsIgnoreCase("Chrome"))
	{
		driver=new ChromeDriver();	
		
    }
	
	else if(browser.equalsIgnoreCase("firefox"))
	{
		 driver=new FirefoxDriver();
	}
	else
		{
			driver=new EdgeDriver();
		}
	


	driver.get(url);
	driver.findElement(By.name("user_name")).sendKeys(user);
	driver.findElement(By.name("user_password")).sendKeys(pwd);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	System.out.println("gn");
	





	
	
			  
	

}
}