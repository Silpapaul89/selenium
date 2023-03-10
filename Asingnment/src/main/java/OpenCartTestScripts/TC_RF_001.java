package OpenCartTestScripts;

import OpenCartPages.BasePage;
import OpenCartPages.HomePage;
import OpenCartPages.RegisterAccoutPage;
import org.testng.annotations.Test;

public class TC_RF_001 extends BaseTest{

    /**
     *author silpa
     *
     *TC_RF_001 Validate Registering an Account by providing only the Mandatory fields
     */
    @Test

    public void TC_RF_001(){

        //String fn= BasePage.firstName(),ln=BasePage.lastName(),email=BasePage.emailId(),mob=BasePage.mobileNumber(),pwd=BasePage.password();
        HomePage hp = new HomePage(driver);
        hp.navigateToRegisterPage();
        RegisterAccoutPage rap = new RegisterAccoutPage(driver);
        rap.enterMandatoryFields("TC_RF_001");
        rap.validateSucessfulReg();
    }







}



