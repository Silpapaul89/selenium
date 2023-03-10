package javaScripts;

import Pages.FileUpload;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_FILEUPLOAD_011 extends BaseTest {

    @Test

    public void fileUpload() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/upload");

        FileUpload fileup= new FileUpload(driver);
        fileup.fileUploaded();
    }
}
