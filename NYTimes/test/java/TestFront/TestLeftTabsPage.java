package TestFront;

import Front.FrontPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestLeftTabsPage extends FrontPage {
    FrontPage frontPage;
    @BeforeMethod
    public void init(){frontPage = PageFactory.initElements(driver, FrontPage.class); }
    @Test
    public void clickOnWorld(){
        setTabWorld();
    }
    @Test
    public void clickOnUS(){
        setTabUS();
    }
    @Test
    public void clickOnPolitics(){
        setTabPolitics();
    }
    @Test
    public void clickOnNY(){
        setTabNY();
    }
    @Test
    public void clickOnBusiness(){
        setTabBusiness();
    }
    @Test
    public void clickOnTech(){
        setTabTech();
    }
    @Test
    public void clickOnScience(){
        setTabScience();
    }
    @Test
    public void clickOnHealth(){
        setTabHealth();
    }
    @Test
    public void clickOnSports(){
        setTabSports();
    }
}
