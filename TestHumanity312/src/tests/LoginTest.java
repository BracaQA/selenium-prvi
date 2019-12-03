package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HumanityHome;
import pages.HumanityLogin;
import pages.HumanityMenu;
import pages.HumanityStaff;
import pages.TitlePage;

public class LoginTest extends BasicTest {

	private String baseUrl = "https://www.humanity.com/";

	@Test(priority = 1)
	public void basicLogin() throws Exception {
		driver.get(baseUrl);
		// OVO JE KLJUCNO - zato tebi nije radilo :)
		driver.manage().window().maximize();
		HumanityHome humanityHome = new HumanityHome(driver);
		Thread.sleep(2000);

		humanityHome.clickLogIn();
		Thread.sleep(2000);

		HumanityLogin humanityLogin = new HumanityLogin(driver);
		humanityLogin.fillEmail("keleh63976@xmail2.net");
		humanityLogin.fillPassword("sifrasifra1");
		Thread.sleep(2000);

		// ova klasa je uvedena jer drugacije ne moze da se dohvati driver i vidi title
		TitlePage titlePage = new TitlePage(driver);

		Assert.assertTrue(titlePage.getTitle().contains("Dashboard"));
		;
	}

	@Test(priority = 2)
	public void addNewEmployee() throws InterruptedException {
		driver.get("https://sdn1.humanity.com/app/dashboard/");
		Thread.sleep(2000);

		HumanityMenu humanityMenu = new HumanityMenu(driver);
		humanityMenu.clickStaff();
		Thread.sleep(2000);

		HumanityStaff humanityStaff = new HumanityStaff(driver);
		humanityStaff.clickAddEmployees();
		Thread.sleep(2000);
		humanityStaff.addEmployee("Maya", "Sky", "maya.sky@hotmail.com");
		humanityStaff.addEmployee("Pera", "Peric", "test.pera@gmail.com");
		humanityStaff.addEmployee("Voj", "Mi", "braca.ludak@outlook.com");
		humanityStaff.clickSaveEmployees();

		driver.navigate().back();
		Thread.sleep(2000);

		// i ovo radiii!!!
		Assert.assertTrue(humanityStaff.employeeAdded("Maya Sky"));
	}

}
