package javaScripts;

import org.testng.annotations.Test;

public class TC_DYNAMICCONTENT_007 extends BaseTest{

    @Test

    public void DynamicContent()throws InterruptedException{
        driver.get("https://the-internet.herokuapp.com/dynamic_content");
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.navigate().refresh();

    }
}
