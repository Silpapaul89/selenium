package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class NewTab extends BaseClass{

    public NewTab(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h3[text()='Opening a new window']")
    WebElement OpenNewTab;

    @FindBy(linkText= "Click Here")
    WebElement clickherelink;

    @FindBy(xpath = "//h3[text()='New Window']")
    WebElement newWindowMsgDisp;

    public void NewWindow()throws InterruptedException{
        clickherelink.click();
        Thread.sleep(3000);
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(1));
        assertTitleIsDisplayed(newWindowMsgDisp);
    }






}


