package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDown extends BaseClass{

    public DropDown(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(id= "dropdown")
    WebElement dropDownOption;

    @FindBy(xpath = "//option[text()='Option 1']")
    WebElement option1;

    @FindBy(xpath = "//option[text()='Option 2']")
    WebElement option2;

    public void dropDownOption()throws InterruptedException{

        selectByValue(dropDownOption,"1");
        Thread.sleep(3000);
        selectByValue(dropDownOption,"2");
        assertTitleIsDisplayed(option1);
        assertTitleIsDisplayed(option2);

    }
}