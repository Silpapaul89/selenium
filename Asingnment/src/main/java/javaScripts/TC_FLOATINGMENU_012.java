package javaScripts;

import Pages.FloatingMenu;
import org.testng.annotations.Test;

public class TC_FLOATINGMENU_012 extends BaseTest{

    @Test

    public void test()throws InterruptedException{

        driver.get("https://the-internet.herokuapp.com/floating_menu");
        FloatingMenu fm= new FloatingMenu(driver);
        fm.scrolling();
    }
}
