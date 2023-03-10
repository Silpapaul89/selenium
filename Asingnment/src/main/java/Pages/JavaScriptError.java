package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavaScriptError extends BaseClass{
    public JavaScriptError(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "p")
    WebElement text;

    public void jserror()throws InterruptedException{

        //assertTitleIsDisplayed(text);
        try {
            assertTitleIsDisplayed(text);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("error");

    }






}
