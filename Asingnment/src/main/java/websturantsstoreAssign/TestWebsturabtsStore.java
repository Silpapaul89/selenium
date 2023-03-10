package websturantsstoreAssign;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import javax.lang.model.element.Element;
import java.util.List;

public class TestWebsturabtsStore extends WebBaseClass {

    @Test
    public void id() throws InterruptedException {

        driver.get("https://www.webstaurantstore.com/");

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("stainless work table", Keys.ENTER);
        System.out.println(driver.getTitle());
        Thread.sleep(3000);

        driver.manage().window().maximize();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//li[@class='rc-pagination-item rc-pagination-item-9']")).click();
        Thread.sleep(3000);

        List<WebElement>  products = driver.findElements(By.xpath("//a[@class='block font-semibold text-sm-1/2 leading-none mb-3 first:mt-8 max-h-10 hover:max-h-full min-h-10 overflow-hidden hover:overflow-visible md:mb-3 mt-0 md:mt-1-1/2']"));
        System.out.println("Count of Table is:"+products.size());

        WebElement lastElement = products.get(0);
        for (WebElement element : products) {
            lastElement = element;
            System.out.println(lastElement.getText());
        }

        lastElement.click();
        driver.findElement(By.xpath("//input[@value='Add to Cart']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()=' View Cart']")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='standardCheckoutButton btn btn-checkout btn-block btn-large clears']")).click();
       // driver.findElement(By.xpath("//span[@class='hidden xsl:inline']")).click();
    }


}
