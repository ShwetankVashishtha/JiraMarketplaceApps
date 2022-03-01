package locators;

public interface installJiraApp {

    String SELECT_BTN = "//span[contains(text(),'Next')]";
    String NEXT_BTN = "//button[@type='button']";
    String JIRA_USERNAME_FIELD = "//input[@id='username' and @placeholder='Enter email']";
    String CONTINUE_BTN = "//button[@id='login-submit']//span[@class='css-19r5em7']";
    String JIRA_PASSWORD_FIELD = "//input[@id='password' and @placeholder='Enter password']";
    String JIRA_LOGIN_BTN = "//button[@id='login-submit']//span[contains(text(),'Log in')]";
    String SIGN_UP_WITH_EMAIL = "//div[@class='social-signup-button email sc-jzJRlG fchABJ']";
    String WORK_EMAIL_FIELD = "//input[@class='email-field input css-1rmy9fa']";
    String PASSOWRD = "//input[@type='password']";
    String FULL_NAME_PASSWORD = "//input[@class='full-name-field first-name input css-1rmy9fa']";
    String AGREE_BTN = "//span[contains(text(),'Agree')]";
    String YOPMAIL_INBOX = "//input[@id='login']";
    String FORWARD_ARROW = "//i[@class='material-icons-outlined f36']";
    String VERIFY_EMAIL_LINK = "//a[normalize-space()='Verify your email']";
    String ENTER_FULL_NAME = "//input[@id='displayName']";
    String CREATE_PASSWORD = "//input[@id='password']";
    String SIGN_UP = "//span[contains(text(),'Sign up')]";
    String WEBSITE = "//input[@class='site-name-field input css-1rmy9fa']";
    String SKIP_QUESTION_FIRST = "//div[@lass='sc-cSHVUG iABUfs sc-jzJRlG blbHKo']/button/span/span";
    String TRY_CONFLUENCE = "//span[@class='css-1wsum1f']//span[contains(text(),'Try')]";
    String SPINNER = "//span[@id='__spinner_wrapper']";
    String TRY_IT_NOW_JIRA_SOFTWARE = "//div[@class='css-edv954']/div[@class='css-1s1oqgl']/div[@class='css-15lti23']/button/span/span";
    String CREATE_A_NEW_SITE = "//button[@class='css-10vwq9f' and @type='button']";
    String NEW_URL_TEXT_FIELD = "//input[@name='newUrl']";
    String CONTINUE_BTN_NEW_SITE = "//button[@class='css-ypvsuv' and @type='submit']";
    String GET_STARTED_BTN = "//button[@data-test-id='confirm-button-action']";
    String JIRA_NEW_SITE_LOADER = "//div[@class='css-o6a5aa']/button[@class='css-si4rnk']";
    String SEARCH_FOR_APPS_FIELD = "//input[@placeholder='Search for apps']";
    String EVM_APP_LINK = "//div[@class='css-17impu7-Logo e1fhg9wy0']";
    String TRY_IT_FREE = "//button[@class='css-1xyle4y']";
    String CONFIRM_INSTALL_BTN = "//button[@id='install-app-dialog__install-confirm-btn']";
    String APP_ADDED_BTN = "//div[@data-testid='app-installed']";
    String TRY_IT_LOADER = "//button[@data-testid='app-listing__install-app-btn'] ";
}
