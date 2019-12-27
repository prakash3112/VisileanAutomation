package bom.stepdefincation.testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.junit.Assert;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.asserts.SoftAssert;

import bom.pageobjectelement.LoginPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTestcases extends BaseClass {

	@Before
	public void setup() throws IOException {
		
		logger = Logger.getLogger("LoginSenario");// Add login Log
		PropertyConfigurator.configure("log4j.properties");

		// Reading Properties
		configProp = new Properties();
		FileInputStream configProfile = new FileInputStream("config.properties");
		configProp.load(configProfile);

		String br = configProp.getProperty("browser");
		if (br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", configProp.getProperty("chromepath"));
			driver = new ChromeDriver();
		} else if (br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", configProp.getProperty("firefoxpath"));
			driver = new FirefoxDriver();
		}

		logger.info("******** Launch Brower*************");
		driver.manage().window().maximize();

	}

	@Given("^Open Chrome Browser and Start Application$")
	public void startApplication() {

		lp = new LoginPage(driver);

	}

	@When("^I enter URL \"([^\"]*)\"$")
	public void enterURL(String URL) {

		logger.info("******** Launch URL*************");
		driver.get(URL);
	}

	@And("^I should should see visilean login page$")
	public void lpPageTitle() throws Exception {
		logger.info("******** Check page Titile*************");
		String actualTitle = driver.getTitle();
		String expatedTitle = "Visilean :: Login";
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualTitle, expatedTitle);
	}

	@When("^I enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void usernameAndpassword(String username, String password) {
		logger.info("******** Providing Login Details*************");
		lp.enterUserName(username);
		lp.enterPassword(password);
	}

	@And("^I click on Submit button on login page$")
	public void submitButtonLoginPage() {
		logger.info("******** Submit Event Details*************");
		lp.clickOnLogin();
	}

	@Then("^I should login sucessfully$")
	public void loginSucessfully() {

		String actualTitle = driver.getTitle();
		String expatedTitle = "VisiLean";
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualTitle, expatedTitle);

	}

	@Then("^I should See validation message$")
	public void validationMessage() {
		logger.info("******** Validation Message Info*************");
		Assert.assertTrue("I should not see validation Message", lp.checkvalidationMessage());
	}

	@Then("^I click on System button dropdown button$")
	public void selectSystemDropDown() throws Exception {
		logger.info("********Logout Sytem DropDown*************");
		lp.clickonLogoutDropDown();
	}

	@Then("^I click on logout button$")
	public void clickOnLogoutButton() {
		logger.info("********Logout Information*************");
		lp.clickOnLogoutButton();
	}

}
