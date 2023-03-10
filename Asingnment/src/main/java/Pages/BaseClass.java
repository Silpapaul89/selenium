package Pages;

import com.github.javafaker.Faker;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.util.Locale;
import java.util.Properties;

public class BaseClass {

    protected WebDriver driver;

    public BaseClass(WebDriver driver) {
        this.driver = driver;
    }

    public static void scrollToElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)", element);
    }

    public static void acceptAlert(WebDriver driver){
        Alert alt= driver.switchTo().alert();
        alt.accept();

    }

    public static void dissmissAlert(WebDriver driver){
        Alert alt= driver.switchTo().alert();
        alt.dismiss();

    }

    public static void sendKeysAlert(WebDriver driver,String str){

        Alert alt= driver.switchTo().alert();
        alt.sendKeys(str);
        alt.accept();
    }

    public static void click(WebDriver driver,WebElement element){

        Actions act=new Actions(driver);
        act.click(element);
    }

    public static void MouseHover(WebDriver driver,WebElement element){

        Actions act=new Actions(driver);
        act.moveToElement(element).build().perform();
    }

    public static void rightClick(WebDriver driver,WebElement element){

        Actions act=new Actions(driver);
        act.contextClick(element).build().perform();
    }

    public static void dragAndDrop(WebDriver driver,WebElement element1,WebElement element2){
        Actions act=new Actions(driver);
        act.dragAndDrop(element1,element2).build().perform();

    }

    public static String emailID(){
        Faker fake = new Faker(new Locale("en-IND"));
        String email = fake.name().fullName();
        return email.replace(" ", "") + "@testmail.com";
    }

    public static String fullName(){
        Faker fake = new Faker(new Locale("en-IND"));
        String name = fake.name().fullName();
        return name;
    }

    public static String lastName(){
        Faker fake = new Faker(new Locale("en-IND"));
        String lname = fake.name().lastName();
        return lname;
    }

    public static String  mobileNo(){
        Faker fake = new Faker(new Locale("en-IND"));
        String phno = fake.number().digits(10);
        return phno;
    }

    public static void selectByidex(WebElement ele,int ind){
        Select sel=new Select(ele);
        sel.selectByIndex(ind);
    }

    public static void selectByValue(WebElement ele,String val){
        Select sel=new Select(ele);
        sel.selectByValue(val);
    }

    public static void selectByVisibleText(WebElement ele,String val){
        Select sel=new Select(ele);
        sel.selectByVisibleText(val);
    }

    public static void deselectByVisibleText(WebElement ele,String val){
        Select sel=new Select(ele);
        sel.deselectByVisibleText(val);
    }

    public  static void takeScreenshots(WebDriver driver,String path) {
        try {
            TakesScreenshot srcShot = (TakesScreenshot) driver;
            File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
            File destFile = new File(path+".png");
            FileUtils.copyFile(srcFile, destFile);
        }catch(Exception e){
            e.printStackTrace();
        }
    }


    public static void assertTitle(WebElement element, String exceptedText){
        String actual =  element.getText().trim();
        Assert.assertEquals(actual,exceptedText.trim(),"Actual is not a match!");
        System.out.println("Execution msg Msg:"+ actual);
    }

    public static void assertTitleIsDisplayed(WebElement element){

        Assert.assertTrue(element.isDisplayed(),"Dynamically Loaded Page Elements");
        System.out.println("Execution msg: "+ element.getText());
    }

    public static void assertEquals(WebElement element){

        Assert.assertTrue(element.isSelected(),"Actual is not a displayed!");
        System.out.println("Execution msg: "+ element.getText());

    }


    public static String getValue(String key){

        String path = System.getProperty("user.dir")+File.separator+"config.properties";
        String value = null;
        try {
            FileInputStream fis = new FileInputStream(path);
            Properties prop = new Properties();
            prop.load(fis);
            value = prop.getProperty(key);
        }catch (Exception e){
            e.printStackTrace();
        }
        return value;
    }

}


