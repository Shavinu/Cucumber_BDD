package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"feature"},
		glue =  {"steps"},
		plugin = {"pretty","html:Report4"},
		dryRun = false,
		strict = true,
		monochrome = true,
		tags = {"@P25"}
		)
public class TestRunner {}
