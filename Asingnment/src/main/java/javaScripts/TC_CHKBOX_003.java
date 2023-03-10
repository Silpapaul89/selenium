package javaScripts;

import Pages.CheckBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TC_CHKBOX_003 extends BaseTest {

    @Test
    public void checkboxes() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/checkboxes");
        CheckBox ch = new CheckBox(driver);
        ch.checkboxes();
    }
}

        /*List<WebElement> cb= driver.findElements(By.xpath("//form[@id='checkboxes']"));
        Thread.sleep(3000);
        for (WebElement ele : cb) {
            if (!ele.isSelected()) {
                ele.click();
            }
        }
        Thread.sleep(3000);
        for (WebElement ele : cb) {
            if (ele.isSelected()) {
                ele.click();
            }
        }
        WebElement cb1=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement cb2=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));

        Assert.assertTrue(cb1.isSelected(),"Check box is not selected");
        Assert.assertFalse(cb1.isSelected(),"Check box is selected");


        //Assert.assertEquals(cb2.isSelected(),false);
    }
}
*/



