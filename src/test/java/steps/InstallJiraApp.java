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

    @When("User sign in using valid login email address")
    public void jiraLogin() {
        installAppTests = new InstallAppTests(base.getdriver());
        installAppTests.userJiraSgnIn();
        base.closeBrowser();
    }

    @Then("User should be able to install app")
    public void user_should_be_able_to_install_app() {
        installAppTests = new InstallAppTests(base.getdriver());
        installAppTests.validateAppInstall();
    }
}
