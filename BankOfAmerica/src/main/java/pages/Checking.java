package pages;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class Checking extends CommonAPI {
    @FindBy(css = "#navChecking > span.title")
    public static WebElement SerchChecking;
    @FindBy(css = "#offer-learn-more-large")
    public  static WebElement clickInCompare;
    @FindBy(css = "#zipCodeModalInputField")
    public static WebElement zipCodeInpute;

    public void clickInCecking(){
        SerchChecking.click();
        zipCodeInpute.sendKeys("11427",Keys.ENTER);
    }
}


