package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "username")
    WebElement usernameField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(xpath = "//i[text()=' Login']")
    WebElement loginButton;

    @FindBy(xpath = "//div[@class='flash error']")
    WebElement invalidUserName;

    @FindBy(xpath = "//div[@class='flash error']")
    WebElement invalidUserPassword;

    @FindBy(xpath = "//div[@class='flash success']")
    WebElement loginSuccessful;

    @FindBy(xpath = "//i[@class='icon-lock']")
    WebElement SecureArea;

    @FindBy(xpath = "//h4[text()='Welcome to the Secure Area. When you are done click logout below.']")
    WebElement SecureAreaLoggedInSucessfull;

    @FindBy(xpath = "//i[text()=' Logout']")
    WebElement logoutButton;

    @FindBy(xpath = "//div[@class='flash success']")
    WebElement logoutMsg;

    //Business logic

    public void loginSuccessful(String uname, String pwd) throws InterruptedException {
        invalidUserName.sendKeys(uname);
        invalidUserPassword.sendKeys(pwd);
        loginButton.click();
        loginSuccessful.getText();

        assertTitleIsDisplayed(loginSuccessful);
        assertTitleIsDisplayed(SecureAreaLoggedInSucessfull);
        Thread.sleep(3000);
        logoutButton.click();
        String logoutSuccessMsg = logoutMsg.getText();
        System.out.println(logoutSuccessMsg);
    }

    public void verifyInvalidLogin(String uname, String pwd) throws InterruptedException {

        System.out.println("Page Title" + driver.getTitle());
        System.out.println("usernameField===" + uname);
        System.out.println("passwordField===" + pwd);
        usernameField.clear();
        usernameField.sendKeys(uname);
        passwordField.clear();
        passwordField.sendKeys(pwd);
        loginButton.click();
        assertTitleIsDisplayed(invalidUserPassword);
        System.out.println("Page Title" + driver.getTitle());


    }
}

