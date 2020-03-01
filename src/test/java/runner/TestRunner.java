package runner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"features"},
        glue = {"stepdefinition"},
        plugin = {"html:target/cucumber-html-report"},
        tags = {"@ContactUs"},
        monochrome = true)
public class TestRunner {

}
