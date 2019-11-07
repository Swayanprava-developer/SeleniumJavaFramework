package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		
		String projectPath = System.getProperty("user.dir");

		
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver");
		driver = new ChromeDriver();
	}

	@Test
	public void test() {

	driver.get("https://google.co.uk/");
	
	driver.findElement(By.name("q")).sendKeys("Selenium Automatio");
	driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']")).click();
	//driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
	
	}
	
	@AfterTest
	public void tearDown() throws Exception {
	Thread.sleep(3000);
	driver.quit();
	}

}
