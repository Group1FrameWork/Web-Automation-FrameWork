package Front;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLeftTabsPage extends FrontPage {
    FrontPage ObjOfFrontPage;
    @BeforeMethod
    public void init(){ObjOfFrontPage = PageFactory.initElements(driver, FrontPage.class);
    }
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
