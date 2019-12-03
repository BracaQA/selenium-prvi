package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityProfile extends BasicPage {

	private By avatar = By.id("tr_avatar");
	private By profile = By.cssSelector("div#userm > div > a:nth-of-type(1)");
	private By version = By.id("humanityAppVersion");
	private By settings = By.cssSelector("div#userm > div > a:nth-of-type(2)");
	private By signOut = By.cssSelector("#userm > div > div:nth-child(13) > a");
	
	public HumanityProfile(WebDriver driver) {
		super(driver);
		
	}
	
	public WebElement getAvatar() {
		return this.driver.findElement(avatar);
	}
	
	public WebElement getProfile() {
		return this.driver.findElement(profile);
	}
	
	public WebElement getVersion() {
		return this.driver.findElement(version);
	}

	public WebElement getSettings() {
		return this.driver.findElement(settings);
	}
	
	public WebElement getSignOut() {
		return this.driver.findElement(signOut);
	}
	
	public void profileBaratejsn(WebElement element) {
		element.click();
	}
	
	public void printHumanityVersion() {
		System.out.println(getVersion().getText());
	}
	
	
}
