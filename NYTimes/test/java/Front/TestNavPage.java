package Front;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class TestNavPage extends FrontPage {

    FrontPage ObjOfFrontPage;
    @BeforeMethod
    public void init(){ObjOfFrontPage = PageFactory.initElements(driver, FrontPage.class);
    }

}



