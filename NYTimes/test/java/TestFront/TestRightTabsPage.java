package TestFront;

import Front.FrontPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestRightTabsPage extends CommonAPI {
    FrontPage frontPage;
    @BeforeMethod
    public void init(){frontPage = PageFactory.initElements(driver, FrontPage.class); }
    @Test
    public void clickOnVideo() {
    }
    @Test
    public void clickOnRealEstate(){
    };
    @Test
    public void clickOnTMagazine(){
    }
    @Test
    public void clickOnMagazine(){
    }
    @Test
    public void clickOnTravel(){
    }
    @Test
    public void clickOnFood(){
    }
    @Test
    public void clickOnStyle(){
    }
    @Test
    public void clickOnBooks(){;
    }
    @Test
    public void clickOnArt(){
    }
}
