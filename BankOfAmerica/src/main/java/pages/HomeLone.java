package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeLone extends CommonAPI {
    @FindBy(css = "#navHomeLoans > span.title")
    public static WebElement clickInHomeLone;

    public void HomeLone(){
        clickInHomeLone.click();
    }
}
