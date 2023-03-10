package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DyanamicControl extends BaseClass {
    public DyanamicControl(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement ACheckBox;

    @FindBy(xpath = "(//button[@type='button'])[1]")
    WebElement RemoveButton;

    @FindBy(xpath="//*[@id='message']")
    WebElement ItsGoneMsgDisplayed;

    @FindBy(xpath = "//button[text()='Add']")
    WebElement AddButtonClick;

    @FindBy(xpath = "//*[@id='message']")
    WebElement ItsBackMsgDisplayed;

    @FindBy(xpath = "//*[@id='loading']")
    WebElement displayingWaitingMsgtoload;

    @FindBy(xpath = "//button[text()='Enable']")
    WebElement clickOnEnableButtn;

    @FindBy(xpath = "//*[@id='message']")
    WebElement itsDisabledMsg;

    @FindBy(xpath = "//button[text()='Disable']")
    WebElement clickOnDisableBtn;

    @FindBy(xpath = "//*[@id='message']")
    WebElement itsEnabledMsg;

    //@FindBy(id = "input-example")
    //WebElement inputMsg;

    public void ClickOnAddRemoveButton() throws InterruptedException {

        ACheckBox.click();
        Thread.sleep(2000);
        RemoveButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        assertTitleIsDisplayed(displayingWaitingMsgtoload);
        Thread.sleep(3000);
        assertTitleIsDisplayed(ItsGoneMsgDisplayed);
        Thread.sleep(3000);
        AddButtonClick.click();
        WebDriverWait addBtn = new WebDriverWait(driver, 100);
        assertTitleIsDisplayed(displayingWaitingMsgtoload);
        Thread.sleep(3000);
        assertTitleIsDisplayed(ItsBackMsgDisplayed);

    }

    public void enableDisbaleBtn() throws InterruptedException {

        clickOnEnableButtn.click();
        WebDriverWait btn1 = new WebDriverWait(driver, 100);
        assertTitleIsDisplayed(itsEnabledMsg);
        Thread.sleep(3000);

        clickOnDisableBtn.click();
        WebDriverWait btn2 = new WebDriverWait(driver, 100);
        assertTitleIsDisplayed(itsDisabledMsg);
        Thread.sleep(3000);
    }
}
