package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynmLoad extends BaseClass{
    public DynmLoad(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    //@FindBy(linkText = "Example 1: Element on page that is hidden")
    //WebElement example1;

    @FindBy(linkText = "Example 1: Element rendered after the fact")
    WebElement example1;

    @FindBy(xpath = "//button[text()='Start']")
    WebElement StartButtonClick1;

    @FindBy(xpath = "//h4[text()='Hello World!']")
    WebElement displayHelloWorld;

    @FindBy(xpath="//h3[text()='Dynamically Loaded Page Elements']")
    WebElement dynamicallyLoadedPage;

    //@FindBy(xpath="//h4[text()='Example 1: Element on page that is hidden']")
    //WebElement EleOnPageIsHidden;

    @FindBy(xpath="//h4[text()='Example 2: Element rendered after the fact']")
    WebElement EleRenderedAfterthefact;

    //@FindBy(xpath = "//button[text()='Start']")
    //WebElement StartButtonClick2;

    public void dynamicLoadingEx1()throws InterruptedException{

        StartButtonClick1.click();
        assertTitleIsDisplayed(dynamicallyLoadedPage);
        assertTitleIsDisplayed(EleRenderedAfterthefact);
        WebDriverWait addbtn= new WebDriverWait(driver,30);
       // StartButtonClick1.click();
        assertTitleIsDisplayed(displayHelloWorld);
        Thread.sleep(2000);
        driver.navigate().back();
    }
    //public void dynamicLoadingEx2()throws InterruptedException{

        /*example2.click();
        assertTitleIsDisplayed(dynamicallyLoadedPage);
        assertTitleIsDisplayed(EleRenderedAfterthefact);
        StartButtonClick2.click();
        Thread.sleep(3000);
        driver.navigate().back();
        WebDriverWait addBtn = new WebDriverWait(driver,500);

         */
}




