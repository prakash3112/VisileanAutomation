package bom.stepdefincation.testcases;

import java.io.File;

import org.junit.Assert;
import org.junit.Test;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
//import org.testng.Assert;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class ExtentsReportsClass{

	ExtentReports extent;
	ExtentTest logger;
	
	@BeforeTest
	public void startTest(){
		extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/STMExtentreport.html", true);
		extent.addSystemInfo("Host Name", "Visilean Automation")
		.addSystemInfo("Enviroment", "AutomationTesting")
		.addSystemInfo("Username", "prakash");
		
		extent.loadConfig(new File(System.getProperty("user.dir")+"//test-output//ExtentReportsConfig.xml"));
	}
	
	@Test
	public void passTest(){
		
		logger=extent.startTest("PassTest");
		Assert.assertTrue(true);
	   logger.log(LogStatus.PASS,"Test Pass");
	
	}
	@Test
	public void failTest(){
		logger=extent.startTest("FailTest");
		Assert.assertTrue(false);
		logger.log(LogStatus.FAIL,"Test Fail");
	}
	@Test
	public void skipTest(){
		logger =extent.startTest("skipTest");
		throw new SkipException("Skip Test");
		
	}
	@AfterMethod
	public void getResult(ITestResult reuslt){
		
		if(reuslt.getStatus()==ITestResult.FAILURE){
			logger.log(LogStatus.FAIL, "Test result fail" +reuslt.getName());
			logger.log(LogStatus.FAIL, "Test result fail" +reuslt.getThrowable());
		}else if(reuslt.getStatus()==ITestResult.SKIP){
			logger.log(LogStatus.SKIP,"Test Skip" +reuslt.getName());
		}
		extent.endTest(logger);
	}
	@AfterTest
	public void endReport(){
		extent.flush();
		extent.close();
	}
}
