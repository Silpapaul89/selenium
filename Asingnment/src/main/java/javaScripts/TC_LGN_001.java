package javaScripts;

import Pages.LoginPage;
import org.testng.annotations.Test;

public class TC_LGN_001 extends BaseTest{

    @Test
    public void login()throws InterruptedException{

        driver.get("https://the-internet.herokuapp.com/login");
        LoginPage lp= new LoginPage(driver);
        lp.loginSuccessful("tomsmith","SuperSecretPassword!");
    }
}
