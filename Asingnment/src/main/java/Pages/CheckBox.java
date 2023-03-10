package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class CheckBox extends BaseClass {

    public CheckBox(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//input[@type='checkbox'])[1]")
    WebElement Checkbox1;
    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    WebElement Checkbox2;

    public void checkboxes() throws InterruptedException {

        //List<WebElement> cb = driver.findElements(By.xpath("//form[@id='checkboxes']"));
        Checkbox1.click();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Checkbox2.click();
        Thread.sleep(3000);

        //for (WebElement ele : cb) {
            //System.out.println("ele"+ele);
            //if (!ele.isSelected()) {
               // ele.click();
            //}
        //}
        //Thread.sleep(3000);
        //for (WebElement ele : cb) {
            //if (ele.isSelected()) {
                //ele.click();
            //}
        //}
        Assert.assertTrue(Checkbox1.isSelected(), "checkbox1 is selected");
        Assert.assertTrue(Checkbox2.isSelected(), "checkbox2 is selected");

    }
}



