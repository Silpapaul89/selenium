package javaScripts;

import Pages.ContextMenu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TC_CONTMENU_004 extends BaseTest{

    @Test
    public void contextMenuRightClick()throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/context_menu");
        Thread.sleep(3000);
        ContextMenu cm = new ContextMenu(driver);
        cm.Contextmenu();
    }




        }
