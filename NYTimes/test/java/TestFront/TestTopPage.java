package TestFront;
import Front.FrontPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestTopPage extends CommonAPI {

    FrontPage frontPage;
    @BeforeMethod
    public void init(){frontPage = PageFactory.initElements(driver, FrontPage.class);
    }
    @Test
    public void homeUrl() {
    }
    @Test
    public void goSearchBar(){
        frontPage.searchBar1();
    }
    @Test
    public void goToday(){
        frontPage.setTopToday();
    }
    @Test
    public void goNyWeather(){
        frontPage.setTopNyWeather();
    }
    @Test
    public void goEnglish(){
        frontPage.setTopEnglish();
    }
    @Test
    public void goSpanish(){
        frontPage.setTopSpanish();
    }
    @Test
    public void goChinese(){
        frontPage.setTopChinese();
    }
}
