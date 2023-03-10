package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MouseHover extends BaseClass{
    public MouseHover(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h3[text()='Hovers']")
    WebElement hovers;

    @FindBy(xpath = "(//*[@alt='User Avatar'])[1]")
    WebElement user1;

    @FindBy(xpath = "(//*[@alt='User Avatar'])[2]")
    WebElement user2;

    @FindBy(xpath = "(//*[@alt='User Avatar'])[3]")
    WebElement user3;

    @FindBy(xpath = "//h5[text()='name: user1']")
    WebElement username1;

    @FindBy(linkText = "View profile")
    WebElement user1ProfileView;

    public void MouseHoverfunct()throws InterruptedException{

        MouseHover(driver,user1);
        Thread.sleep(3000);
        user1ProfileView.click();
        driver.navigate().back();
        MouseHover(driver,user2);
        Thread.sleep(3000);
        MouseHover(driver,user3);
        Thread.sleep(3000);
    }






}
