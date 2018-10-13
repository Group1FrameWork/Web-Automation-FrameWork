package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class ContuctUs extends CommonAPI {
    @FindBy(css ="#NAV_CONTACT_US")
    public static WebElement clickInContactUs;
    @FindBy(css ="#stateListId")
    public static  WebElement inputeInSelectState;
    @FindBy(xpath = "//*[@id=\"submitState\"]/fieldset/div/a")
    public static WebElement clickInGoButton;
    public void ContactUs(){
         clickInContactUs.click();
         inputeInSelectState.click();
    }
}
