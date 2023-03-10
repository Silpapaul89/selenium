package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.jvm.hotspot.debugger.Page;

public class FileDownload extends BaseClass{
    public FileDownload(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "webdriverIO.png")
    WebElement filedowmloader;

    public void filedownload(){
        filedowmloader.click();

        }
    }

