package OpenCartPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='My Account']")
    WebElement myAccountMenu;

    @FindBy(xpath = "//a[text()='Login']")
    WebElement loginButton;

    @FindBy(xpath = "//a[text()='Register']")
    WebElement registerButton;


    public void navigateToRegisterPage() {
        BasePage.assertTitle(driver,"Your Store");
        myAccountMenu.click();
        registerButton.click();
        BasePage.assertTitle(driver,"Register Account");
    }
        public void navigateTologinPage() {
            BasePage.assertTitle(driver,"Your Store");
            myAccountMenu.click();
            loginButton.click();
            BasePage.assertTitle(driver,"Account Login");
        }
    }

