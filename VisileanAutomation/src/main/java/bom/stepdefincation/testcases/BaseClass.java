package bom.stepdefincation.testcases;

import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import bom.pageobjectelement.LoginPage;


public class BaseClass {
	
	
	public WebDriver driver;
	public LoginPage lp; 
	public static Logger logger;
	public Properties configProp;
	public ExtentsReportsClass extent;
	 

	
	public static String randomeString(){
		String generatedString1 =RandomStringUtils.randomAlphabetic(10);
		return(generatedString1);
	}
	
	

}
