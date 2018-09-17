package Search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class searchItems extends CommonAPI {

    @Test
    public void search(){
        driver.findElement(By.cssSelector("#gh-ac")).sendKeys("Note 8", Keys.ENTER);
    }
}
