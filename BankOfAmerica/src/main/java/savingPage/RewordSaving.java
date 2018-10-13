package savingPage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class RewordSaving extends CommonAPI {
    @FindBy(css ="#navSavings > span.title")
    public static WebElement clickInSaving;
    @FindBy(css ="#zipCodeModalInputField")
    public static WebElement inputeZipCode;
    @FindBy(css ="#compare-accounts-large")
    public static WebElement openNow;

    public void rewordSaving(){
        clickInSaving.click();
        inputeZipCode.sendKeys("11427",Keys.ENTER);
        openNow.click();
    }
}
