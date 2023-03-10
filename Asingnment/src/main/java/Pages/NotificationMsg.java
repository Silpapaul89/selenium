package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotificationMsg extends BaseClass{
    public NotificationMsg(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h3[text()='Notification Message']")
    WebElement NotifMsg;

    @FindBy(xpath = "//a[text()='Click here']")
    WebElement ClickHere;

    @FindBy(xpath = "//div[@class='flash notice']")
    WebElement ActionSucessfull;

    @FindBy(xpath = "//div[@id='flash']")
    WebElement ActionUnsucessfull;

    public void NotificationMsgtest() throws InterruptedException{

        ClickHere.click();
        assertTitleIsDisplayed(ActionSucessfull);
        Thread.sleep(3000);
        driver.navigate().refresh();
        ClickHere.click();
        assertTitleIsDisplayed(ActionUnsucessfull);
        ClickHere.click();
        assertTitleIsDisplayed(ActionUnsucessfull);
    }








}
