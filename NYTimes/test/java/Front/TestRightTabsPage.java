package Front;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestRightTabsPage extends FrontPage {
    FrontPage ObjOfFrontPage;
    @BeforeMethod
    public void init(){ObjOfFrontPage = PageFactory.initElements(driver, FrontPage.class);
    }
    @Test
    public void clickOnVideo() {
        setTabVideo();
    }
    @Test
    public void clickOnRealEstate(){
        setTabRealEstate();
    }
    @Test
    public void clickOnTMagazine(){
        setTabTMagazine();
    }
    @Test
    public void clickOnMagazine(){
        setTabMagazine();
    }
    @Test
    public void clickOnTravel(){
        setTabTravel();
    }
    @Test
    public void clickOnFood(){
        setTabFood();
    }
    @Test
    public void clickOnStyle(){
        setTabStyle();
    }
    @Test
    public void clickOnBooks(){
        setTabBooks();
    }
    @Test
    public void clickOnArt(){
        setTabArt();
    }
}
