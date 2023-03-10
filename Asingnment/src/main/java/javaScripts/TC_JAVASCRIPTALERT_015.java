package javaScripts;

import Pages.JavaScriptAlert;
import org.testng.annotations.Test;

public class TC_JAVASCRIPTALERT_015 extends BaseTest {

    @Test
    public void alerts() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        JavaScriptAlert js = new JavaScriptAlert(driver);
        js.Alerts();

    }
}
