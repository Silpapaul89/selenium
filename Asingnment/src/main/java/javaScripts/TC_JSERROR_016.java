package javaScripts;

import Pages.JavaScriptError;
import org.testng.annotations.Test;

public class TC_JSERROR_016 extends BaseTest{

    @Test

    public void jsError()throws InterruptedException{

        driver.get("https://the-internet.herokuapp.com/javascript_error");
        JavaScriptError je = new JavaScriptError(driver);
        je.jserror();
    }
}
