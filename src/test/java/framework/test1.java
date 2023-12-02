package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test1 {
	@Test
	public void facebook() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		
	}

}
