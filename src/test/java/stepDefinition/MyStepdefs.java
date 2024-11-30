package stepDefinition;

import cucumberRunner.CucumberRunner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.loginHelper;

import java.net.MalformedURLException;

public class MyStepdefs {

    @Given("User opens Application")
    public void user_opens_application() throws MalformedURLException {
        CucumberRunner.setup();
    }

    @Then("User Clicks on menu")
    public void userClicksOnMenu() {
        loginHelper.clicksOnMenu();
    }

    @Then("User Clicks on login")
    public void userClicksOnLogin() {
        loginHelper.clicksOnLogin();
    }

    @Then("User Enters username")
    public void userEntersUsername() {
        loginHelper.fillUsername();

    }

    @And("User Enters password")
    public void userEntersPassword() {
        loginHelper.fillPassword();
    }

    @Then("User Clicks on login button")
    public void userClicksOnLoginButton() {
        loginHelper.clicksOnLoginButton();
    }

    @And("User Enters no password")
    public void userEntersNoPassword() {
        loginHelper.fillNoPassword();
    }

    @Then("Verify that login successfully")
    public void verifyThatLoginSuccessfully() {
        loginHelper.verifyThatLoginSuccessfully();
    }

    @Then("Verify that no password error message")
    public void verifyThatNoPasswordErrorMessage() {
        loginHelper.verifyThatNoPasswordErrorMessage();
    }

    @And("User Enters no user details")
    public void userEntersNoUserDetails() {
        loginHelper.fillNoUserDetails();
    }

    @Then("Verify that no username error message")
    public void verifyThatNoUsernameErrorMessage() {
        loginHelper.verifyThatNoUsernameErrorMessage();
    }

    @And("User Enters no match details")
    public void userEntersNoMatchDetails() {
        loginHelper.fillNoMatchDetails();
    }

    @Then("Verify that no match error message")
    public void verifyThatNoMatchErrorMessage() {
        loginHelper.verifyThatNoMatchErrorMessage();
    }

    @And("User Enters locked user")
    public void userEntersLockedUser() {
        loginHelper.fillLockedUser();
    }

    @Then("Verify that locked error message")
    public void verifyThatLockedErrorMessage() {
        loginHelper.verifyThatLockedErrorMessage();
    }
}