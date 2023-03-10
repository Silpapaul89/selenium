package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FloatingMenu extends BaseClass{
    public FloatingMenu(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h3[text()='Floating Menu']")
    WebElement floatingMenu;

    @FindBy(xpath = "//a[text()='Home']")
    WebElement homeMenu;

    @FindBy(xpath = "//a[text()='News']")
    WebElement newsMenu;

    @FindBy(xpath = "//a[text()='Contact']")
    WebElement contactMenu;

    @FindBy(xpath = "//a[text()='About']")
    WebElement aboutMenu;

    @FindBy(xpath = "//div[text()='Powered by '] ")
    WebElement TargetElement;

    public void scrolling()throws InterruptedException{

        BaseClass.scrollToElement(driver,TargetElement);
        TargetElement.click();
        assertTitleIsDisplayed(floatingMenu);
        assertTitleIsDisplayed(homeMenu);
        assertTitleIsDisplayed(newsMenu);
        assertTitleIsDisplayed(contactMenu);
        assertTitleIsDisplayed(aboutMenu);

    }












}


