package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * Junit runner class to run the feature files.
 * We are also passing the extent report plugin to cucumber options for the report generation.
 * @author karan
 *
 */

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/featureFiles",
		glue= {"stepDefinitions"},
		plugin = { "pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}//this adapter needed for the new extent reports.
		)

public class TestRunners2 {


}
