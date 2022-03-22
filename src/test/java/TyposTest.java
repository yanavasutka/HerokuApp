import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TyposTest extends BaseTest {

    @Test
    public void typos() {
        driver.get("http://the-internet.herokuapp.com/typos");
        // for (int a = 0; a < 10; a++) {
        String mistakeChecking = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p[2]")).getText();
        assertEquals (mistakeChecking, "Sometimes you'll see a typo, other times you won't.", "The mistake is found (won,t)");
        driver.navigate().refresh();
        assertEquals (mistakeChecking, "Sometimes you'll see a typo, other times you won't.", "The mistake is found (won,t)");
        }
    }

