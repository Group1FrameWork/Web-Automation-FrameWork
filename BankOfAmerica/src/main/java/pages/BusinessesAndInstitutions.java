package pages;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusinessesAndInstitutions extends CommonAPI {
    @FindBy(css = "#NAV_BUSINESS_INSTITUTIONS")
    public static WebElement navberButtonclick;
    @FindBy(css = "#skip_topnav > div > div.right.menuLinks.nmenulinks > a.menu.right.t_track_menulinks")
    public static WebElement clickInHamgburger;
    @FindBy(css ="#hmenulink > ul:nth-child(1) > li:nth-child(1) > a")
    public static WebElement clickinFeatured;
    @FindBy(css = "#searchText")
    public  static WebElement inportinfInSearch;

    public void clickinBusinesses(){
        navberButtonclick.click();
        clickInHamgburger.click();
        clickinFeatured.click();
        navigateBack();
        inportinfInSearch.sendKeys("Account", Keys.ENTER);
    }

}
