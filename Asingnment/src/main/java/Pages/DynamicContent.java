package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicContent extends BaseClass{
    public DynamicContent(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h3[text()='Dynamic Content']")
    WebElement PageTitle;

    @FindBy(xpath = "//a[text()='click here']")
    WebElement clickhere;

    public void dynamicContent()throws InterruptedException {

       // WebElement clickhere = driver.findElement(dynamicContent);
       // {//The refresh link user clicks
            clickhere.click();
        }
    }

