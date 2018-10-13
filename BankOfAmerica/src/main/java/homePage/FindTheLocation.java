package homePage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class FindTheLocation extends CommonAPI {
    @FindBy(css = "#finCenterLocator")
    public static WebElement clickInClosestCenter;
    @FindBy(id ="rioSearchFilterLabel")
    public static WebElement clickInFindLocation;
    @FindBy(id ="label3087013")
    public static WebElement clickInAdvancedCenter;
    @FindBy(id = "rioFilterDoneButton")
    public static WebElement clickInDoneButten;
    @FindBy(css= "#rioSearchInput")
    public  static  WebElement inputeZipCode;
    @FindBy( id = "rioSearchButton")
    public static WebElement zipcodeSearch;

    public void closestFinancialCenter(){
        clickInClosestCenter.click();
        clickInFindLocation.click();
        clickInAdvancedCenter.click();
        clickInDoneButten.click();
    }
    public void clickInZipCode(){
        clickInClosestCenter.click();
        inputeZipCode.sendKeys("11427",Keys.ENTER);
        zipcodeSearch.click();
    }
    public void navigateto(){
        driver.navigate().to("https://www.bankofamerica.com/");
    }

}
