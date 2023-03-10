package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUpload extends BaseClass{
    public FileUpload(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

        @FindBy(id="file-upload")
        WebElement fileupload;

        @FindBy(id="file-submit")
        WebElement filesubmit;

        @FindBy(xpath = "//h3[text()='File Uploaded!']")
        WebElement fileUploadedMsg;

        public void fileUploaded()throws InterruptedException{

            fileupload.sendKeys("/Users/abhijitmallik/IdeaProjects/JavaSeleniumSilpa/PDataFile/data.xlsx");
            Thread.sleep(3000);
            filesubmit.click();
            Thread.sleep(3000);
            assertTitleIsDisplayed(fileUploadedMsg);

    }
}
