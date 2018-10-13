package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import reporting.TestLogger;

public class SmallBusiness extends CommonAPI {
    @FindBy(css = "#NAV_BUSINESS_ADVANTAGE")
    public static WebElement SmallBusiness;
    @FindBy(css= "#SCU9HU7W")
    public static WebElement OpenAnCheckingAccount;
    @FindBy(id = "stateselectOL")
    public static WebElement OpenAnCheckingAccountSubmitButton;
    public void SearchSmallBusiness()  {
        SmallBusiness.click();
        OpenAnCheckingAccount.click();
        OpenAnCheckingAccountSubmitButton.click();
    }
}

