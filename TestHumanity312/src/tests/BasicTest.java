package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BasicTest {

	protected WebDriver driver;
	protected String baseUrl = "https://www.humanity.com/";
	
	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
	@AfterTest
	public void quit() {
//		driver.close();
	}
}
