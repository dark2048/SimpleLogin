package TestCoverage;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		features="src/test/java/features",
		glue={"StepDefinition"}
		)
public class TestRun {

}
