package javaScripts;

import Pages.DropDown;
import org.testng.annotations.Test;

public class TC_DROPDOWN_006 extends BaseTest{

 @Test
    public void DropDown()throws InterruptedException{

     driver.get("https://the-internet.herokuapp.com/dropdown");
     DropDown dropDown=new DropDown(driver);
     dropDown.dropDownOption();
 }
}
