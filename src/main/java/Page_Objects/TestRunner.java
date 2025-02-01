package Page_Objects;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/java/features/Login.feature", 
    glue = "StepDefination",                           
    dryRun = false,
    plugin = {"pretty", "html:target/cucumber-reports.html"},
    monochrome = true,
    publish = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
	
}
