package forms;

import locators.installJiraApp;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import utilities.GenerateTestData;
import utilities.PropertyManager;
import wrappers.PageBase;
import wrappers.TestBase;

import java.util.ArrayList;

public class InstallAppTests extends PageBase implements installJiraApp {

    /**
     * @param driver the driver
     */
    public InstallAppTests(WebDriver driver) {
        super(driver);
    }

    PropertyManager propertyManager = new PropertyManager();
    GenerateTestData generateTestData = new GenerateTestData();
    TestBase base = new TestBase();

    @FindBy(xpath = SELECT_BTN)
    private WebElement selectBtn;

    public WebElement getSelectBtn() {
        return selectBtn;
    }

    @FindBy(xpath = JIRA_USERNAME_FIELD)
    private WebElement jiraUsernameField;

    public WebElement getJiraUsernameField() {
        return jiraUsernameField;
    }

    @FindBy(xpath = CONTINUE_BTN)
    private WebElement continueBtn;

    public WebElement getContinueBtn() {
        return continueBtn;
    }

    @FindBy(xpath = JIRA_PASSWORD_FIELD)
    private WebElement jiraPasswordField;

    public WebElement getJiraPasswordField() {
        return jiraPasswordField;
    }

    @FindBy(xpath = JIRA_LOGIN_BTN)
    private WebElement jiraLoginBtn;

    public WebElement getJiraLoginBtn() {
        return jiraLoginBtn;
    }

    @FindBy(xpath = NEXT_BTN)
    private WebElement nextBtn;

    public WebElement getNextBtn() {
        return nextBtn;
    }

    @FindBy(xpath = SIGN_UP_WITH_EMAIL)
    private WebElement signUpWithEmail;

    public WebElement getSignUpWithEmail() {
        return signUpWithEmail;
    }

    @FindBy(xpath = WORK_EMAIL_FIELD)
    private WebElement workEmailField;

    public WebElement getWorkEmailField() {
        return workEmailField;
    }

    @FindBy(xpath = PASSOWRD)
    private WebElement password;

    public WebElement getPassword() {
        return password;
    }

    @FindBy(xpath = FULL_NAME_PASSWORD)
    private WebElement fullNamePassword;

    public WebElement getFullNamePassword() {
        return fullNamePassword;
    }

    @FindBy(xpath = AGREE_BTN)
    private WebElement agreeBtn;

    public WebElement getAgreeBtn() {
        return agreeBtn;
    }

    @FindBy(xpath = YOPMAIL_INBOX)
    private WebElement yopmailInbox;

    public WebElement getYopmailInbox() {
        return yopmailInbox;
    }

    @FindBy(xpath = FORWARD_ARROW)
    private WebElement forwardArrow;

    public WebElement getForwardArrow() {
        return forwardArrow;
    }

    @FindBy(xpath = VERIFY_EMAIL_LINK)
    private WebElement verifyEmailLink;

    public WebElement getVerifyEmailLink() {
        return verifyEmailLink;
    }

    @FindBy(xpath = ENTER_FULL_NAME)
    private WebElement enterFullName;

    public WebElement getEnterFullName() {
        return enterFullName;
    }

    @FindBy(xpath = CREATE_PASSWORD)
    private WebElement createPassword;

    public WebElement getCreatePassword() {
        return createPassword;
    }

    @FindBy(xpath = SIGN_UP)
    private WebElement signUp;

    public WebElement getSignUp() {
        return signUp;
    }

    @FindBy(xpath = WEBSITE)
    private WebElement website;

    public WebElement getWebsite() {
        return website;
    }

    @FindBy(xpath = SKIP_QUESTION_FIRST)
    private WebElement skipQuesFirst;

    public WebElement getSkipQuesFirst() {
        return skipQuesFirst;
    }

    @FindBy(xpath = TRY_CONFLUENCE)
    private WebElement tryConfluence;

    public WebElement getTryConfluence() {
        return tryConfluence;
    }

    @FindBy(xpath = SPINNER)
    private WebElement spinner;

    public WebElement getSpinner() {
        return spinner;
    }

    @FindBy(xpath = TRY_IT_NOW_JIRA_SOFTWARE)
    private WebElement tryItNowJiraSoftware;

    public WebElement getTryItNowJiraSoftware() {
        return tryItNowJiraSoftware;
    }

    @FindBy(xpath = CREATE_A_NEW_SITE)
    private WebElement createANewSite;

    public WebElement getCreateANewSite() {
        return createANewSite;
    }

    @FindBy(xpath = NEW_URL_TEXT_FIELD)
    private WebElement newUrl;

    public WebElement getNewUrl() {
        return newUrl;
    }

    @FindBy(xpath = CONTINUE_BTN_NEW_SITE)
    private WebElement continueBtnNewSite;

    public WebElement getContinueBtnNewSite() {
        return continueBtnNewSite;
    }

    @FindBy(xpath = GET_STARTED_BTN)
    private WebElement getStartedBtn;

    public WebElement getGetStartedBtn() {
        return getStartedBtn;
    }

    @FindBy(xpath = JIRA_NEW_SITE_LOADER)
    private WebElement jiraNewSiteLoader;

    public WebElement getJiraNewSiteLoader() {
        return jiraNewSiteLoader;
    }

    @FindBy(xpath = SEARCH_FOR_APPS_FIELD)
    private WebElement searchForAppsField;

    public WebElement getSearchForAppsField() {
        return searchForAppsField;
    }

    @FindBy(xpath = EVM_APP_LINK)
    private WebElement evnAppLink;

    public WebElement getEvnAppLink() {
        return evnAppLink;
    }

    @FindBy(xpath = TRY_IT_FREE)
    private WebElement tryItFree;

    public WebElement getTryItFree() {
        return tryItFree;
    }

    @FindBy(xpath = CONFIRM_INSTALL_BTN)
    private WebElement confirmInstallBtn;

    public WebElement getConfirmInstallBtn() {
        return confirmInstallBtn;
    }

    @FindBy(xpath = APP_ADDED_BTN)
    private WebElement appAddedBtn;

    public WebElement getAppAddedBtn() {
        return appAddedBtn;
    }

    @FindBy(xpath = TRY_IT_LOADER)
    private WebElement tryItLoader;

    public WebElement getTryItLoader() {
        return tryItLoader;
    }

    public void userJiraSgnIn(String username) {

        JavascriptExecutor js = (JavascriptExecutor) base.getdriver();
        long randomNum = generateTestData.generateRandomNumber();
        String randomString = generateTestData.generateAlphaNumericString(5);

        base.waitForElementToBeClickable(10, getJiraUsernameField());
        getJiraUsernameField().sendKeys(username);
        base.waitForElementToBeClickable(10, getContinueBtn());
        getContinueBtn().click();
        base.waitForElementVisible(10, getJiraPasswordField());
        getJiraPasswordField().clear();
        getJiraPasswordField().sendKeys(propertyManager.getResourceBundle.getProperty("JIRA_LOGIN_PASSWORD"));
        getJiraLoginBtn().click();
        base.implicitWait(10);
        base.waitForElementToBeClickable(10, getTryConfluence());
        getTryConfluence().click();
        base.waitForElementDisappear(10, getSpinner());
        base.getdriver().switchTo().frame("__iframe_plugin_");
        getTryItNowJiraSoftware().click();
        base.getdriver().switchTo().defaultContent();
        base.getdriver().switchTo().frame("__iframe_plugin_");
        js.executeScript("arguments[0].click();", getCreateANewSite());
        getNewUrl().clear();
        getNewUrl().sendKeys(propertyManager.getResourceBundle.getProperty("SITE_URL_PREFIX") + randomString + randomNum);
        System.out.print(propertyManager.getResourceBundle.getProperty("SITE_URL_PREFIX") + randomString + randomNum);
        base.waitForElementToBeClickable(10, getContinueBtnNewSite());
        js.executeScript("arguments[0].click();", getContinueBtnNewSite());
        base.getdriver().switchTo().defaultContent();
        base.getdriver().switchTo().frame("__iframe_plugin_");
        base.waitForElementVisible(10, getGetStartedBtn());
        base.waitForElementToBeClickable(10, getGetStartedBtn());
        js.executeScript("arguments[0].click();", getGetStartedBtn());
        base.waitForElementDisappear(90, getJiraNewSiteLoader());
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        base.getdriver().switchTo().window(tabs.get(1));
        base.getdriver().get("https://" + propertyManager.getResourceBundle.getProperty("SITE_URL_PREFIX") + randomString + randomNum + ".atlassian.net/jira/marketplace");
        base.waitForElementVisible(10, getSearchForAppsField());
        getSearchForAppsField().clear();
        getSearchForAppsField().sendKeys(propertyManager.getResourceBundle.getProperty("APP_FIRST") + Keys.ENTER);
        base.waitForElementVisible(10, getEvnAppLink());
        base.waitForElementToBeClickable(10, getEvnAppLink());
        getEvnAppLink().click();
        base.waitForElementVisible(10, getTryItFree());
        base.waitForElementToBeClickable(10, getTryItFree());
        getTryItFree().click();
        base.waitForElementVisible(10, getConfirmInstallBtn());
        base.waitForElementToBeClickable(10, getConfirmInstallBtn());
        getConfirmInstallBtn().click();
        base.waitForElementDisappear(30, getTryItLoader());
        base.waitForElementVisible(10, getAppAddedBtn());
        base.getdriver().get("https://" + propertyManager.getResourceBundle.getProperty("SITE_URL_PREFIX") + randomString + randomNum + ".atlassian.net/jira/marketplace");
        base.waitForElementVisible(10, getSearchForAppsField());
        getSearchForAppsField().clear();
        getSearchForAppsField().sendKeys(propertyManager.getResourceBundle.getProperty("APP_SECOND") + Keys.ENTER);
        base.waitForElementVisible(10, getEvnAppLink());
        base.waitForElementToBeClickable(10, getEvnAppLink());
        getEvnAppLink().click();
        base.waitForElementVisible(10, getTryItFree());
        base.waitForElementToBeClickable(10, getTryItFree());
        getTryItFree().click();
        base.waitForElementVisible(10, getConfirmInstallBtn());
        base.waitForElementToBeClickable(10, getConfirmInstallBtn());
        getConfirmInstallBtn().click();
        base.waitForElementDisappear(30, getTryItLoader());
        base.waitForElementVisible(10, getAppAddedBtn());
        base.getdriver().get("https://" + propertyManager.getResourceBundle.getProperty("SITE_URL_PREFIX") + randomString + randomNum + ".atlassian.net/jira/marketplace");
        base.waitForElementVisible(10, getSearchForAppsField());
        getSearchForAppsField().clear();
        getSearchForAppsField().sendKeys(propertyManager.getResourceBundle.getProperty("APP_THIRD") + Keys.ENTER);
        base.waitForElementVisible(10, getEvnAppLink());
        base.waitForElementToBeClickable(10, getEvnAppLink());
        getEvnAppLink().click();
        base.waitForElementVisible(10, getTryItFree());
        base.waitForElementToBeClickable(10, getTryItFree());
        getTryItFree().click();
        base.waitForElementVisible(10, getConfirmInstallBtn());
        base.waitForElementToBeClickable(10, getConfirmInstallBtn());
        getConfirmInstallBtn().click();
        base.waitForElementDisappear(30, getTryItLoader());
        base.waitForElementVisible(10, getAppAddedBtn());
    }

    public void validateAppInstall() {

    }
}
