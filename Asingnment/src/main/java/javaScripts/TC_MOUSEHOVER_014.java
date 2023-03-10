package javaScripts;

import Pages.MouseHover;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC_MOUSEHOVER_014 extends BaseTest {

    @Test

    public void test() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/hovers");
        MouseHover mh= new MouseHover(driver);
        mh.MouseHoverfunct();


    }
}
