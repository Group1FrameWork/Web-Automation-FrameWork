package java.pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CountrySelection extends CommonAPI {
    @FindBy(xpath = "//a[@id='country-select']/span")
    public static WebElement USButtonXpath;
    @FindBy(id = "oo_tab")
    public static WebElement FeedBack;
    @FindBy(css = "//#waypoint_icons > a:nth-child(1)")
    public static WebElement Website;

    public void alertPopUp() {
        FeedBack.click();



    }
}
