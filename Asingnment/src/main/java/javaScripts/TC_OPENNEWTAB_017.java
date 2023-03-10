package javaScripts;

import Pages.NewTab;
import org.testng.annotations.Test;

public class TC_OPENNEWTAB_017 extends BaseTest{

    @Test

    public void Newtabwindow()throws InterruptedException{

        driver.get("https://the-internet.herokuapp.com/windows");
        NewTab nt= new NewTab(driver);
        nt.NewWindow();
    }
}
