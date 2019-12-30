package bom.runner;
//import org.junit.runner.RunWith;
import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//src/test/resources",

glue="bom.stepdefincation.testcases",
dryRun=false,
strict=false,
//tags = {"@123"},

plugin={"pretty","html:test-output","pretty:target/prettyReport.txt","html:target/cucumber-html-report",
        "json:target/cucumber.json", }
		)

public class TestRunner extends AbstractTestNGCucumberTests {
	
}
