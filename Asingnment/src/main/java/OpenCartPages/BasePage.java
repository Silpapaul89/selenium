package OpenCartPages;

import com.github.javafaker.Faker;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Properties;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public static void scrollToElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)", element);
    }

    public static void acceptAlert(WebDriver driver) {

        Alert alt = driver.switchTo().alert();
        alt.accept();

    }

    public static void dismissAlert(WebDriver driver) {

        Alert alt = driver.switchTo().alert();
        alt.dismiss();

    }

    public static void acceptAlertWithSendValue(WebDriver driver, String value) {

        Alert alt = driver.switchTo().alert();
        alt.sendKeys(value);
        alt.accept();

    }

    public static void click(WebDriver driver, WebElement element) {
        Actions act = new Actions(driver);
        act.click(element).build().perform();
    }


    public static void mouseHover(WebDriver driver, WebElement element) {
        Actions act = new Actions(driver);
        act.moveToElement(element).build().perform();
    }

    public static void rightClick(WebDriver driver, WebElement element) {
        Actions act = new Actions(driver);
        act.contextClick(element).build().perform();
    }


    public static void dragNdrop(WebDriver driver, WebElement element1, WebElement element2) {
        Actions act = new Actions(driver);
        act.dragAndDrop(element1, element2).build().perform();
    }

    //https://github.com/aravindanath/java-faker

    public static void selectBYindex(WebElement element, int index) {
        Select sel = new Select(element);
        sel.selectByIndex(index);
    }

    public static void selectBYValue(WebElement element, String value) {
        Select sel = new Select(element);
        sel.selectByValue(value);
    }

    public static void selectBYVisibleText(WebElement element, String value) {
        Select sel = new Select(element);
        sel.selectByVisibleText(value);
    }


    public static void deselectBYVisibleText(WebElement element, String value) {
        Select sel = new Select(element);
        sel.deselectByVisibleText(value);
    }

    public static void takeScreenshot(WebDriver driver) {
        try {
            TakesScreenshot srcShot = (TakesScreenshot) driver;
            File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
//            Integer ran = (int) (Math.random()*4567);
            File destFile = new File("./screen" + currentDataTime() + ".png");
            FileUtils.copyFile(srcFile, destFile);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static String currentDataTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formateDateTime = now.format(df);
        return formateDateTime.replace("-", "_").replace(":", "_").replace(" ", "_");

    }


    public static String getValue(String Key) {
        String path = System.getProperty("user.dir") + File.separator + "config.properties";

        String value = null;
        try {
            Properties prop = new Properties();
            prop.load(new FileInputStream(path));
            value = prop.getProperty(Key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return value;
    }

    public static void assertTitle(WebElement element, String exceptedText) {
        String actual = element.getText();
        Assert.assertEquals(actual, exceptedText, "Title not matched");
    }

    public static void assertIcon(WebElement element) {
        Assert.assertTrue(element.isDisplayed(), "Icon is not displayed");
    }

    public static void assertCheckboxTrue(WebElement element) {
        Assert.assertTrue(element.isSelected(), "Checkbox is not selected");
    }

    public static void assertCheckboxFalse(WebElement element) {
        Assert.assertFalse(element.isSelected(), "Checkbox is selected");
    }

    public static void assertTitle(WebDriver driver, String exceptedText) {

        Assert.assertEquals(driver.getTitle(), exceptedText, "User is on wrong page");
    }

    public static String firstName() {

        Faker faker = new Faker(new Locale("en-IND"));
        String fn = faker.name().firstName();
        System.out.println("First Name " + fn);
        return fn;

    }

    public static String lastName() {

        Faker faker = new Faker(new Locale("en-IND"));
        String ln = faker.name().lastName();
        System.out.println("Last Name " + ln);
        return ln;
    }

    public static String emailId() {

        Faker faker = new Faker(new Locale("en-IND"));
        String email = faker.name().firstName().replace(".", "").replace("", "") + "@test.com";
        System.out.println("Email " + email);
        return email;

    }

    public static String mobileNumber() {

        Faker faker = new Faker(new Locale("en-IND"));
        String num = faker.number().digits(10);
        System.out.println("Mobile Number " + num);
        return num;
    }

    public static String password() {
        return "silpa@1989";
    }

}










