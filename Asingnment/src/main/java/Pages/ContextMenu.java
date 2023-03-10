package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ContextMenu extends BaseClass{
    public ContextMenu(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@id='hot-spot']")
    WebElement contextmenu;

    @FindBy(xpath = "(//p)[1]")
    WebElement title;

    public void Contextmenu()throws InterruptedException{
        MouseHover(driver,contextmenu);
        Thread.sleep(3000);
        rightClick(driver,contextmenu);
        Thread.sleep(2000);
        acceptAlert(driver);
        Assert.assertEquals(title.getText(),"Context menu items are custom additions that appear in the right-click menu.","Title not match");

    }
}
