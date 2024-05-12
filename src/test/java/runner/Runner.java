package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/LandingPage.feature"
		,glue={"stepdefinitions"},monochrome = true,dryRun = false,plugin= {"html:reports/cucumberhtml.html","pretty"},tags= "@smoke"
		)

public class Runner {

}
