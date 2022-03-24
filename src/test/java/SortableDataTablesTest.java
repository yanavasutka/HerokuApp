import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SortableDataTablesTest extends BaseTest {

    @Test
    public void sortableDataTables () {
        driver.get ("http://the-internet.herokuapp.com/tables");
        assertEquals (driver.findElement (By.xpath("//table//tr[1]//td[1]")).getText(), "Smith");
        assertEquals (driver.findElement (By.xpath("//table//tr[2]//td[2]")).getText(), "Frank");
        assertEquals (driver.findElement (By.xpath("//table//tr[3]//td[4]")).getText(), "$100.00");
        assertEquals (driver.findElement (By.xpath("//table//tr[3]//td[5]")).getText(), "http://www.jdoe.com");
    }

}
