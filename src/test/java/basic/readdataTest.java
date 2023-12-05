package basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class readdataTest {
	
	public void vtigercrmTest() throws IOException {
 
		
		final WebDriver driver;
		FileInputStream fis=new FileInputStream("src\\test\\resources\\propmp1.properties");
		Properties p=new Properties ();
		p.load(fis);
				
		String Browser=p.getProperty("browser");
		String Url=p.getProperty("url");
		String username=p.getProperty("username");
		String pwd=p.getProperty("pwd");
		
		
		
		if(Browser.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();	
			
	    }
		
		else if(Browser.equalsIgnoreCase("firefox"))
		{
			 driver=new FirefoxDriver();
		}
		else
			{
				driver=new EdgeDriver();
			}
		
		

		driver.get(Url);
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("gm");
		
		
		//
		
		
		
		
		
		
	
	
		
		
		
	}



}
