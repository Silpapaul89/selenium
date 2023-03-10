package javaScripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_NESTEDFRAME_013 extends BaseTest{

    @Test

    public void Test()throws InterruptedException{

        driver.get("https://the-internet.herokuapp.com/frames");
        driver.findElement(By.linkText("Nested Frames")).click();
        Thread.sleep(3000);
        driver.switchTo().frame("frame-top");
        System.out.println("Its a top frame");
        driver.switchTo().frame("frame-left");
        String text=driver.findElement(By.xpath("//*[contains(text(),'LEFT')]")).getText();
        System.out.println("LEFT");
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        driver.switchTo().frame("frame-bottom");
        System.out.println("Its bottom frame");
        String btntext=driver.findElement(By.xpath("//*[contains(text(),'BOTTOM')]")).getText();
        System.out.println(btntext);

    }
    @Test

    public void Iframes()throws InterruptedException{

        driver.get("https://the-internet.herokuapp.com/frames");
        driver.findElement(By.linkText("iFrame")).click();
        Thread.sleep(3000);
        driver.switchTo().frame("mce_0_ifr");
        //driver.switchTo().frame(“id of the element”);
        System.out.println("Its a border frame");
        //String text =driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")).getText();
        driver.findElement(By.cssSelector("p")).clear();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("p")).sendKeys("Hello Everyone");
        System.out.println("Hello Everyone");
        driver.switchTo().defaultContent();
        //Thread.sleep(3000);

    }
}
