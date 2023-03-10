package javaScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC_DragNDrop_005 extends BaseTest{

    @Test

    public void dragNdrop()throws InterruptedException{

        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        Actions act= new Actions(driver);

        WebElement ele1= driver.findElement(By.id("column-a"));
        WebElement ele2 = driver.findElement(By.id("column-b"));
        Thread.sleep(3000);
        act.dragAndDrop(ele2, ele1).build().perform();

    }
}
