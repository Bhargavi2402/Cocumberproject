package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src/main/java/Features/flightsdt.feature"
 ,glue={"stepdefinitions"},
 format = {"pretty","html:test-output","json:json_Output/Cocumber.json"},
 dryRun =false,
 monochrome= true
 )
public class Testrunner {

}
