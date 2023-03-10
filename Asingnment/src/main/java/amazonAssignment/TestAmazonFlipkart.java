package amazonAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.w3c.dom.html.HTMLInputElement;

public class TestAmazonFlipkart extends BaseClass{

    @Test
    public void id() throws InterruptedException {

        driver.get("http://www.amazon.in");

            driver.findElement(By.id("twotabsearchtextbox")).sendKeys("apple iphone xr 64gb - product red", Keys.ENTER);

        System.out.println(driver.getTitle());
        Thread.sleep(3000);

        String value = driver.findElement(By.xpath("//span[@class='a-price-whole'][1]")).getText();

        String replaceSpecialCharAmazon = value.replaceAll("[^a-zA-Z0-9]", "");
        int amazonPrice = Integer.parseInt(replaceSpecialCharAmazon);
        System.out.println("price on amazon.in" + amazonPrice);

        driver.get("http://www.flipkart.com/");
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
                driver.findElement(By.id("container")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("q")).sendKeys("apple iphone xr 64gb - product red",Keys.ENTER);

        String value1 = driver.findElement(By.xpath("(//div[@class='_30jeq3 _1_WHN1'])")).getText();
        String replaceSpecialCharFlipkart = value1.replaceAll("[^a-zA-Z0-9]", "");
        int flipkartPrice = Integer.parseInt(replaceSpecialCharFlipkart);
        System.out.println("Price on Flipkart.com"+flipkartPrice);

        if(amazonPrice<flipkartPrice){
            System.out.println("Amazon Price is lesser"+amazonPrice);
        }else if (flipkartPrice<amazonPrice) {
            System.out.println("Flipkart price is lesser" + flipkartPrice);
        }else{
            System.out.println("Amazon price is equal to flipkart price"+ flipkartPrice);
        }


    }
}