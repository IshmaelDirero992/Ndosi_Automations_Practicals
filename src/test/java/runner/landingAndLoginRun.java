package runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        // Path to your feature files
        features = "src/test/resources/features/homePage.feature",

        // Package where your step definitions are located
        glue = "stepDefinitions/landingLoginSteps.java",

        // Optional plugins for reporting
        plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"}
)

public class landingAndLoginRun {
}
