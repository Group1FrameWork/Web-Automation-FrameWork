package TestFront;

import Front.FrontPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestLeftTabsPage extends CommonAPI {
    FrontPage frontPage;

    @BeforeMethod
    public void init() {
        frontPage = PageFactory.initElements(driver, FrontPage.class);
    }
    @Test
    public void clickOnWorld(){
        frontPage.setTabWorld();
    }
    @Test
    public void clickOnUS(){
        frontPage.setTabUS();
    }
    @Test
    public void clickOnPolitics(){
        frontPage.setTabPolitics();
    }
    @Test
    public void clickOnNY(){
        frontPage.setTabNY();
    }
    @Test
    public void clickOnBusiness(){
        frontPage.setTabBusiness();
    }
    @Test
    public void clickOnTech(){
        frontPage.setTabTech();
    }
    @Test
    public void clickOnScience(){
        frontPage.setTabScience();
    }
    @Test
    public void clickOnHealth(){
        frontPage.setTabHealth();
    }
    @Test
    public void clickOnSports(){
        frontPage.setTabSports();
    }
}
