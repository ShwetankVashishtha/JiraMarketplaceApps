package steps;

import forms.InstallAppTests;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.PropertyManager;
import wrappers.TestBase;

public class InstallJiraApp {

    TestBase base = new TestBase();
    PropertyManager propertyManager = new PropertyManager();
    InstallAppTests installAppTests;

    @Given("User is redirected to Jira sign in page")
    public void user_is_redirected_to_jira_sign_in_page() {
        base.setupBrowser("win", "firefox", propertyManager.getResourceBundle.getProperty("BASE_URL"));
    }

    @Then("User should be able to install app")
    public void user_should_be_able_to_install_app() {
        installAppTests = new InstallAppTests(base.getdriver());
        installAppTests.validateAppInstall();
    }

    @When("User sign in using valid login email address {string}$\"")
    public void userSignInUsingValidLoginEmailAddress$(String username) throws Throwable {
        installAppTests = new InstallAppTests(base.getdriver());
        installAppTests.userJiraSgnIn(username);
        base.closeBrowser();
         }
}
