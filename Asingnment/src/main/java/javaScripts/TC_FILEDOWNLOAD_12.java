package javaScripts;

import Pages.FileDownload;
import org.testng.annotations.Test;

public class TC_FILEDOWNLOAD_12 extends BaseTest{

    @Test

    public void Test()throws InterruptedException{

        driver.get("https://the-internet.herokuapp.com/download");
        Thread.sleep(3000);
        FileDownload fd =new FileDownload(driver);
        fd.filedownload();

    }

}
