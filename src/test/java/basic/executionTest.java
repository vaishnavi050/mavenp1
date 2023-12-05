package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class executionTest {
	@Test(groups="food")
	
	public void zomatoTest() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com/india");
		
		
	}
	@Test
	
	public void fbTest() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
	}
	@Test(groups="food")
	public void swiggyTest() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		
		
	}

}


