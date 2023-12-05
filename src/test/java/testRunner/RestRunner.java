package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//public class RestRunner {
	@CucumberOptions(features = "src/test/resources/features", glue = "stepDefinition")
	public class RestRunner extends AbstractTestNGCucumberTests {
	}


