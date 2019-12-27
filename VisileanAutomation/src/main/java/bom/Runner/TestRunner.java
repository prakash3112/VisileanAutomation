package bom.Runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//src/test/resources",

glue="bom.stepdefincation.testcases",
dryRun=false,
strict=false,
//tags = {"@1234"},

plugin={"pretty","html:test-output","pretty:target/prettyReport.txt"}
		)
public class TestRunner {

}
