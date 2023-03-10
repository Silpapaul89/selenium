package javaScripts;

import Pages.DynmLoad;
import org.testng.annotations.Test;

public class TC_DYNMLOAD_009 extends BaseTest {

    @Test
    public void DynmLoad() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
        DynmLoad dl = new DynmLoad(driver);
        dl.dynamicLoadingEx1();
        //dl.dynamicLoadingEx2();
    }
}

