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
        frontPage.setTabVideo();
    }
    @Test
    public void clickOnRealEstate(){
        frontPage.setTabRealEstate();
    };
    @Test
    public void clickOnTMagazine(){
        frontPage.setTabTMagazine();
    }
    @Test
    public void clickOnMagazine(){
        frontPage.setTabMagazine();
    }
    @Test
    public void clickOnTravel(){
        frontPage.setTabTravel();
    }
    @Test
    public void clickOnFood(){
        frontPage.setTabFood();
    }
    @Test
    public void clickOnStyle(){
        frontPage.setTabStyle();
    }
    @Test
    public void clickOnBooks(){
        frontPage.setTabBooks();
    }
    @Test
    public void clickOnArt(){
        frontPage.setTabArt();
    }
}
