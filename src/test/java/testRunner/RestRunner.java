package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//public class RestRunner {
	@CucumberOptions(features = "src/test/java/features", glue = "stepDefinition",monochrome=true)
	public class RestRunner extends AbstractTestNGCucumberTests {
	}


