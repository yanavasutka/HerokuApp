import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class DynamicControlsTest extends BaseTest{

    @Test
    public void dynamicControls() {
        driver.get ("http://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(By.id("checkbox"));
        driver.findElement(By.xpath("//*[@type='button']")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("message"))));
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        assertEquals(driver.findElements(By.id("checkbox")).size(), 0, "Element is displayed");
        //Assert.assertTrue(driver.findElement(By.id("message")).isDisplayed());
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        assertFalse (driver.findElement(By.cssSelector("input[type=text]")).isEnabled(), "Input is enabled");
        driver.findElement(By.xpath("//button[@onclick='swapInput()']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
        assertEquals(driver.findElement(By.id("message")).getText(), "It's enabled!");
        assertTrue(driver.findElement(By.id("input-example")).isEnabled(), "Input is disabled");
    }
}
