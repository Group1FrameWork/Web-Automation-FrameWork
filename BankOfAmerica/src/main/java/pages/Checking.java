package pages;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Checking extends CommonAPI {
    @FindBy(css = "#navChecking > span.title")
    public static WebElement SerchChecking;
    @FindBy(css = "#coreChecking")
    public  static WebElement clickInCompare;
    @FindBy(css = "#zipCodeModalInputField")
    public static WebElement zipCodeInpute;

    public void clickInCecking(){
        SerchChecking.click();
        clickInCompare.click();
        zipCodeInpute.sendKeys("11427",Keys.ENTER);

    }


}


