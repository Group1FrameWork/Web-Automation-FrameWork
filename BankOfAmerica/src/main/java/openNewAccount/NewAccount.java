package openNewAccount;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class NewAccount extends CommonAPI {
    @FindBy(css ="#findACheckingAccount")
    public static WebElement clickInOpenNow;
    public void newAccount(){
        clickInOpenNow.click();
    }
}
