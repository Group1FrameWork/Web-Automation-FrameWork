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
    }
    @Test
    public void clickOnUS(){
    }
    @Test
    public void clickOnPolitics(){
    }
    @Test
    public void clickOnNY(){
    }
    @Test
    public void clickOnBusiness(){
    }
    @Test
    public void clickOnTech(){
    }
    @Test
    public void clickOnScience(){
    }
    @Test
    public void clickOnHealth(){
    }
    @Test
    public void clickOnSports(){
    }
}
