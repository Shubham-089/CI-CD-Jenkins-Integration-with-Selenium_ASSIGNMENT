package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "C:\\Users\\Shubham.Yetonde\\Desktop\\BDD_Cucumber\\BDD_Cucumber\\src\\test\\resources\\features\\Login.feature", 
    glue = "StepDefination",                           
    dryRun = false,
    plugin = {"pretty", "html:target/cucumber-reports.html"},
    monochrome = true,
    publish = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
	
}


