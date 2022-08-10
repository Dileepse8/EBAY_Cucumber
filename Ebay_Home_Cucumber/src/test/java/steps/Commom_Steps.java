package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Commom_Steps {
	private WebDriver driver;
	
	
	@Before (order=0)
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@After (order=0)
	public void TearDown() throws Exception {
		driver.quit();
		Thread.sleep(1000);
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
}
