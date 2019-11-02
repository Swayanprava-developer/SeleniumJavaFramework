package SeleniumJavaFramework.SeleniumJavaFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import net.bytebuddy.asm.Advice.Return;

public class BrowserTest {
	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		String projectPath = System.getProperty("user.dir");
		
		//Automation for firefox
		//System.setProperty("webdriver.gecko.driver", projectPath+"/drivers/geckodriver/geckodriver");
		//driver = new FirefoxDriver();
		
		//Automation for chrome driver
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://google.co.uk/");
		
		driver.findElement(By.name("q")).sendKeys("Selenium Automatio");
		driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']")).click();
		//driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		
		
		Thread.sleep(3000);
		driver.quit();
	}

}
