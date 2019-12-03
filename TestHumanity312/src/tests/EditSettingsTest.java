package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HumanityEditStaff;
import pages.HumanityHome;
import pages.HumanityLogin;
import pages.HumanityProfile;

public class EditSettingsTest extends BasicTest {

	@BeforeTest
	public void setup() throws InterruptedException {
		super.setup();
		driver.get(this.baseUrl);
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HumanityHome humanityHome = new HumanityHome(driver);
		Thread.sleep(2000);
		
		humanityHome.clickLogIn();
		Thread.sleep(2000);

		HumanityLogin humanityLogin = new HumanityLogin(driver);
		humanityLogin.fillEmail("keleh63976@xmail2.net");
		humanityLogin.fillPassword("sifrasifra1");
		Thread.sleep(2000);
		
	}
	
	@Test
	public void editSettings() {
		HumanityProfile profile = new HumanityProfile(driver);
		profile.getAvatar().click();
		profile.getProfile().click();
		
		HumanityEditStaff editStaff = new HumanityEditStaff(driver);
		editStaff.editEmployeeSettings();
		
	}
	
}
