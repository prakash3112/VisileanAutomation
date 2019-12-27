package bom.pageobjectelement;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bom.utilities.WaitHelper;



public class LoginPage {

	public WebDriver ldriver;
	
    WaitHelper waithelper;
    

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		 PageFactory.initElements(rdriver, this);
		waithelper=new WaitHelper(ldriver);
	}

	public static Properties config = new Properties();

	@FindBy(xpath = "//input[@name='username']")
	@CacheLookup 
	private WebElement Username;

	public void enterUserName(String Email_id) {

		Username.sendKeys(Email_id);
	}

	@FindBy(xpath = "//input[@name='password']")
	@CacheLookup
	private WebElement Password;

	public void enterPassword(String pass) {

		Password.sendKeys(pass);

	}

	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	private WebElement loginButton;

	public void clickOnLogin() {

		loginButton.click();
	}

	@FindBy(xpath = "//div[contains(text(),'Username or password incorrect.')]")
	@CacheLookup
	private WebElement validationMessag;

	public boolean checkvalidationMessage() {
		return (validationMessag.isDisplayed());

	}

	@FindBy(xpath = "//span[@id='btnForProfileMenuName']")
	@CacheLookup
	private WebElement logoutDropDown;

	public void clickonLogoutDropDown() throws Exception {
		waithelper.WaitForElement(logoutDropDown, 20);
		logoutDropDown.click();
	}

	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	@CacheLookup
	private WebElement logoutButton;

	public void clickOnLogoutButton() {
		logoutButton.click();
	}

}
