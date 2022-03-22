import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NotificationMessagesTest extends BaseTest {

    @Test
    public void notificationMessages() {
        driver.get ("http://the-internet.herokuapp.com/notification_message_rendered");
        driver.findElement(By.xpath("//a[contains(text(),'Click here')]")).click();
        String notificationMessage = driver.findElement(By.id("flash")).getText();
        assertEquals(notificationMessage, "Action successful\n" +
                "×", "The notification message is not correct");
    }
}
