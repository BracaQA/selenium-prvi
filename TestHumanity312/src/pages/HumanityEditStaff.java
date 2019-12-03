package pages;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityEditStaff extends BasicPage {
	
	private By editDetails = By.cssSelector(".EmployeeTop > a:nth-of-type(2)");
	private By editPictureButton = By.id("fileupload");
	private By nickName = By.id("nick_name");
	private By saveEmployee = By.id("act_primary");

	public HumanityEditStaff(WebDriver driver) {
		super(driver);
	}
	
	public WebElement getEditDetails() {
		return this.driver.findElement(editDetails);
	}
	
	public WebElement getEditPictureButton() {
		return this.driver.findElement(editPictureButton);
	}
	
	public WebElement getNickName() {
		return this.driver.findElement(nickName);
	}
	
	public WebElement getSaveEmployee() {
		return this.driver.findElement(saveEmployee);
	}
	
	public void editEmployeeSettings() {
		this.getEditDetails().click();
		this.getEditPictureButton().sendKeys(new File("images\\avatar.jpg").getAbsolutePath());
		this.getNickName().sendKeys("maya");
		this.getSaveEmployee().click();
	}
	
	//isImageUploadedSuccesff
	//return this.driver.findElement(taj element) != null

}
