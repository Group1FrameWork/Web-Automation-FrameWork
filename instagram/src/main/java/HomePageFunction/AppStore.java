package HomePageFunction;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class AppStore extends CommonAPI {
    public void appstorebutton(String locator){
        driver.findElement(By.cssSelector("#react-root > section > main > div > article > div > div.APQi1 > div > a:nth-child(1) > img")).sendKeys(Keys.ENTER);
    }
}
