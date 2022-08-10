package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="Features",
				glue="steps",
				strict=true,
				plugin= {"pretty","json: target/json-report/cucumber.json"},
				dryRun=false,
				tags= {"@p1 "},
				monochrome=true
				//false true
				)
public class TestRunner {

}
