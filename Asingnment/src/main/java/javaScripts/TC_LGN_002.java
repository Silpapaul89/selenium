package javaScripts;

import Pages.LoginPage;
import org.testng.annotations.Test;

public class TC_LGN_002 extends BaseTest{

    @Test
    public void invalidUserPassword() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/login");
        LoginPage lp= new LoginPage(driver);
        lp.verifyInvalidLogin("tomsmith","silpa1989");
    }
}
