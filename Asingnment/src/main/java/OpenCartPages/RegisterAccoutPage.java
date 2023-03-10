package OpenCartPages;

import Utilities.JavaUtils;
import com.github.javafaker.Faker;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.util.Locale;
import java.util.Map;

public class RegisterAccoutPage extends BasePage {
    public RegisterAccoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "input-firstname")
    WebElement firstNameTextField;

    @FindBy(id = "input-lastname")
    WebElement lastNameTextField;

    @FindBy(id = "input-email")
    WebElement emailTextField;

    @FindBy(id = "input-telephone")
    WebElement TelephoneTextField;

    @FindBy(id = "input-password")
    WebElement PasswordTextField;

    @FindBy(id = "input-confirm")
    WebElement confirmPasswordTextField;

    @FindBy(xpath = "//input[@name='agree']")
    WebElement agreeCheckbox;

    @FindBy(xpath = "//input[@value='Continue']")
    WebElement continueButton;

    @FindBy(xpath = "//h1[text()='Your Account Has Been Created!']")
    WebElement accountCreatedSucessMsg;

    @FindBy(xpath ="//*[contains(text(),'Warning: E-Mail Address is already registered!')]" )
    WebElement accountCreatedFailMsg;


    //Business logic

    Map<String,String> reg;

    String sheetName = "Register";

    public void enterMandatoryFields(String uniqueId) {

        reg = JavaUtils.readExcelData(sheetName, uniqueId);
        firstNameTextField.sendKeys(reg.get("FIRSTNAME"));
        lastNameTextField.sendKeys(reg.get("LASTNAME"));
        emailTextField.sendKeys(reg.get("EMAIL"));
        TelephoneTextField.sendKeys(reg.get("MOBILE"));
        PasswordTextField.sendKeys(reg.get("PASSWORD"));
        confirmPasswordTextField.sendKeys(reg.get("CONFIRMPASSWORD"));
        agreeCheckbox.click();
        BasePage.takeScreenshot(driver);
        continueButton.click();
    }

    public void validateSucessfulReg(){
        assertTitle(accountCreatedSucessMsg,"Your Account Has Been Created!");
    }

    public void validateFailedReg(){
        BasePage.takeScreenshot(driver);
        assertTitle(accountCreatedFailMsg,"Warning: E-Mail Address is already registered!");

    }

    public void enterFirst(){
        firstNameTextField.sendKeys(BasePage.firstName());
    }

    public void enterLastFirst(){
        firstNameTextField.sendKeys(BasePage.lastName());
    }

    public void verifyElements(){
        System.out.println("Verify elements");
    }


}











