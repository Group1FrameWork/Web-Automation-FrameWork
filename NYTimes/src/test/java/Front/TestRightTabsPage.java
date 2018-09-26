package Front;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestRightTabsPage extends FrontPage {
    FrontPage ObjOfFrontPage;
    @BeforeMethod
    public void init(){ObjOfFrontPage = PageFactory.initElements(driver, FrontPage.class);
    }

}
