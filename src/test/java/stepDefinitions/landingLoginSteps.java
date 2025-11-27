package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;
import pageObjects.landingAndLogins;

public class landingLoginSteps extends PageObject {

    @Steps
    landingAndLogins landingAndLogins;

    @Given("user has openWebsite and logged into Automations bootCamp.")
    public void userHasOpenWebsiteAndLoggedIntoAutomationsBootCamp() {
        landingAndLogins.openWebsite();
    }

    @Then("user clicks on LEARNING MATERILAS button")
    public void userClicksOnLEARNINGMATERILASButton() {
        landingAndLogins.clickOnLearningMaterial();

    }

    @And("enters EMAIL")
    public void entersEMAIL(String email) {
        landingAndLogins.enterEmail(email);

    }

    @And("enters PASSWORD")
    public void entersPASSWORD(String password) {
        landingAndLogins.enterPassword(password);

    }

    @And("click on LOGIN button")
    public void clickOnLOGINButton() {
        landingAndLogins.clickOnLoginButton();

    }

    @Then("the user should be redirected to the welcome page.")
    public void theUserShouldBeRedirectedToTheWelcomePage() {
        landingAndLogins.isWelcomePageDisplayed();
    }
}
