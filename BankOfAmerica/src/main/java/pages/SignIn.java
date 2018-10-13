package pages;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class SignIn extends CommonAPI {
    @FindBy(css = "#signIn")
    public static WebElement SingnInButton;
    @FindBy(css = "#onlineId1")
    public static WebElement OnlineIdbox;
    @FindBy(css = "#passcode1")
    public static WebElement Passcode;
    public void clickInSignIn() {
        SingnInButton.click();
        OnlineIdbox.sendKeys("abcd", Keys.ENTER);
        Passcode.sendKeys("1234", Keys.ENTER);
    }
    public void clickInOnlineId(){
        OnlineIdbox.sendKeys("aabcd",Keys.ENTER);
    }
    public void clickPasscode(){
        Passcode.sendKeys("1234",Keys.ENTER);
    }
}






