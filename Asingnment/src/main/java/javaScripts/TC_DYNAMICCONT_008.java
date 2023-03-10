package javaScripts;

import Pages.DyanamicControl;
import org.testng.annotations.Test;

public class TC_DYNAMICCONT_008 extends BaseTest{

    @Test

    public void addRemoveButton()throws InterruptedException{

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        DyanamicControl dc= new DyanamicControl(driver);
        dc.ClickOnAddRemoveButton();
        dc.enableDisbaleBtn();
    }

}
