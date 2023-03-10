package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavaScriptAlert extends BaseClass{
    public JavaScriptAlert(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[text()='Click for JS Alert']")
    WebElement JsAlertClicked;

    @FindBy(xpath = "//button[text()='Click for JS Confirm']")
    WebElement JsConfirmClicked;

    @FindBy(xpath = "//button[text()='Click for JS Prompt']")
    WebElement JsPromptClicked;

    @FindBy(xpath = "//p[text()='You successfully clicked an alert']")
    WebElement SucessfullyClickedOnalert;

    @FindBy(xpath = "//p[text()='You clicked: Cancel']")
    WebElement ClickedCancel;

    public void Alerts()throws InterruptedException{
        JsAlertClicked.click();
        acceptAlert(driver);
        assertTitleIsDisplayed(SucessfullyClickedOnalert);
        Thread.sleep(2000);
        driver.navigate().refresh();
        JsConfirmClicked.click();
        dissmissAlert(driver);

        try {
            assertTitleIsDisplayed(ClickedCancel);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(3000);
        JsPromptClicked.click();
        sendKeysAlert(driver, "welcome");



    }




}


