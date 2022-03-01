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
    public void redirectToSignUpPage() {
        base.setupBrowser("win", "firefox", propertyManager.getResourceBundle.getProperty("BASE_URL"));
    }

    @When("User sign in using valid login email address")
    public void   jiraLogin() {
        installAppTests = new InstallAppTests(base.getdriver());
        installAppTests.userJiraLogin();
    }

    @And("User creates instance on Jira cloud")
    public void createInstance() {
        installAppTests = new InstallAppTests(base.getdriver());
        installAppTests.createJiraInstance();
    }

    @Then("User should be able to install app")
    public boolean validateAppInstall() {
        installAppTests = new InstallAppTests(base.getdriver());
        return installAppTests.validateJiraEVMAppInstallation();
    }
}
