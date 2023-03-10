package OpenCartTestScripts;

import OpenCartPages.BasePage;
import OpenCartPages.HomePage;
import OpenCartPages.RegisterAccoutPage;
import org.testng.annotations.Test;

@Test
public class TC_RF_002 extends BaseTest {

    //*Validate 'Thank you for registering' email is sent to the registered email address as a confirmation for registering the account

    public void TC_RF_002() {


        HomePage hp = new HomePage(driver);
        hp.navigateToRegisterPage();
        RegisterAccoutPage rap = new RegisterAccoutPage(driver);
        rap.enterMandatoryFields("TC_RF_002");
        rap.validateFailedReg();
    }
}




