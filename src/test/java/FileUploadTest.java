import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTest {

    @Test
    public void fileUpload () {
        driver.get("http://the-internet.herokuapp.com/upload");
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:/Users/Aleksandr/IdeaProjects/HerokuApp/src/test/resources/sea.jpg");
        driver.findElement(By.id ("file-submit")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h3")));
        assertEquals (driver.findElement(By.id("uploaded-files")).getText(), "sea.jpg", "The filenames are different");
    }
}
