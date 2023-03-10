package amazonAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class TestTripAdvisor extends BaseClass {

    @Test
//dfuux u j z _F ddFHE bVTsJ dQDUG bsyQH
    //dfuux u j z _F ddFHE bVTsJ dQDUG bsyQH
    public void Test() throws InterruptedException {

        driver.get("https://www.tripadvisor.in");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@class='fhEMT _G B- z _J Cj R0' and @placeholder='Where to?']")).sendKeys("Club Mahindra", Keys.ENTER);
        System.out.println(driver.getTitle());
        Thread.sleep(5000);
        driver.findElement(By.className("result-title")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("bsyQH")).click();


        Thread.sleep(3000);
        String parent = driver.getWindowHandle();
        driver.findElement(By.linkText("Write a review")).click();
        Thread.sleep(2000);
        Set<String> wins = driver.getWindowHandles();
        for(String str : wins){
            driver.switchTo().window(str);
        }
        driver.close();
        driver.switchTo().window(parent);

        driver.findElement(By.className("ratingText")).click();
        //ReviewTitle
        driver.findElement(By.name("ReviewTitle")).click();
        Thread.sleep(3000);
        //ReviewTitle
        driver.findElement(By.xpath("//input[@name='ReviewTitle']")).sendKeys("Pleasant Stay");

        driver.findElement(By.cssSelector(".ui_bubble_rating.rate.bubble_00")).click();
        //driver.findElement(By.id("text-bx")).sendKeys("Pleasant Stay");
    }
}
