import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CheckBoxesTest extends BaseTest {

    @Test
    public void checkBoxes () {
        driver.get ("http://the-internet.herokuapp.com/checkboxes");
        List <WebElement> checkBoxes = driver.findElements(By.cssSelector("[type=checkbox]"));
        assertFalse (checkBoxes.get(0).isSelected(), "An error has occurred. CheckBox 1 is selected");
        checkBoxes.get(0).click();
        assertTrue (checkBoxes.get(0).isSelected(), "An error has occurred. CheckBox 1 is not selected");

        assertTrue (checkBoxes.get(1).isSelected(), "An error has occurred. CheckBox 2 is not selected");
        checkBoxes.get(1).click();
        assertFalse (checkBoxes.get(1).isSelected(), "An error has occurred. CheckBox 1 is selected");

    }
}
