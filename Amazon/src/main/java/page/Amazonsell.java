package page;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Amazonsell extends CommonAPI {
    @FindBy(how = How.XPATH, using = ".//*[@id='nav-link-prime']/span[2]")
    public static WebElement sell;

    public void clickOnAmazonSell(){
        sell.click();
    }
}
