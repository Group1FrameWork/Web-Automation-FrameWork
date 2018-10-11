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
    }
    @Test
    public void goToday(){
    }
    @Test
    public void goNyWeather(){
    }
    @Test
    public void goEnglish(){
    }
    @Test
    public void goSpanish(){
    }
    @Test
    public void goChinese(){
    }
}
