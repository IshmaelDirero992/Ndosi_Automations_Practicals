package pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.TimeoutException;

public class landingAndLogins extends PageObject {

    // landing and login Variables.
    public String URL = "https://www.ndosi.com/";
    public String learningMaterialsXpath = "//a[@href='/learning-material']";
    public String usernameXpath = "//input[@id='login-email']";
    public String passwordXpath = "//input[@id='login-password']";
    public String loginButtonXpath = "//button[@id='login-submit']";
    public String welcomeMessageXpath = "//h2[@id='practice-heading']";

    // landing and login Methods & Actions
    public void openWebsite() {
        try {
            getDriver().get(URL);
            getDriver().manage().window().maximize();
        }   catch (Exception e) {
            throw new RuntimeException("Failed to open website: " + e.getMessage());
        }
    }

    public void clickOnLearningMaterial() {
        $(learningMaterialsXpath).waitUntilClickable().click();
    }
    public void enterEmail(String email){
        $(usernameXpath).waitUntilVisible().sendKeys(email);
    }
    public void enterPassword(String password){
        $(passwordXpath).waitUntilVisible().sendKeys(password);
    }
    public void clickOnLoginButton(){
        $(loginButtonXpath).waitUntilClickable().click();
    }
    public boolean isWelcomePageDisplayed() {
        try {
            return $(welcomeMessageXpath).waitUntilVisible().isDisplayed();
        } catch (TimeoutException e) {
            return false;
        }
    }

}
