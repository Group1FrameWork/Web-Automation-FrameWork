package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Checking extends CommonAPI {


    @FindBy(css = "#navChecking > span.title")
    public static WebElement SerchChecking;

    public  WebElement getSerchChecking() {
        return SerchChecking;
    }
    public void getclicInChecking(){
        getSerchChecking().click();
    }


}


