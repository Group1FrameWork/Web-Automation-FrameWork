package TestFront;

import Front.FrontPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class TestNavPage extends FrontPage {

    FrontPage frontPage;
    @BeforeMethod
    public void init(){frontPage = PageFactory.initElements(driver, FrontPage.class);
    }

}



