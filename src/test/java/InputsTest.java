import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class InputsTest extends BaseTest {

    @Test
    public void inputs() {
        driver.get("http://the-internet.herokuapp.com/inputs");
        driver.findElement(By.tagName("input")).sendKeys(Keys.ARROW_UP);
        String arrowUp = driver.findElement(By.tagName("input")).getAttribute("value");
        assertEquals (arrowUp, "1", "The error is connected with ARROW_UP");

        driver.findElement(By.tagName("input")).sendKeys(Keys.ARROW_DOWN);
        String arrowDown = driver.findElement(By.tagName("input")).getAttribute("value");
        assertEquals(arrowDown, "0", "The error is connected with ARROW_DOWN");

        driver.navigate().refresh();
        driver.findElement(By.tagName("input")).sendKeys("tms");
        String lettersTest = driver.findElement(By.tagName("input")).getAttribute("value");
        assertEquals(lettersTest, "", "Input doesn't accept non-digital values");

    }
}
