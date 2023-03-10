package javaScripts;

import Pages.NotificationMsg;
import org.testng.annotations.Test;

public class TC_NOTIFICATIONMSG_018 extends BaseTest {

    @Test

    public void NotificationMessage() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/notification_message_rendered");
        NotificationMsg nm = new NotificationMsg(driver);
        nm.NotificationMsgtest();
    }
}