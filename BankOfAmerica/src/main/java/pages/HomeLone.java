package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeLone extends CommonAPI {
    @FindBy(xpath = "//a[@id='homeLoansAssistance']")
    public static WebElement clickInHomeLone;

    public void HomeLone(){
        clickInHomeLone.click();
    }
}
