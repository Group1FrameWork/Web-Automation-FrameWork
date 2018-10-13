package search;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AboutUs;
import pages.ContuctUs;
import reporting.TestLogger;

public class TestContuctUs extends ContuctUs {
    ContuctUs ObjOfContuctUs ;
    @BeforeMethod
    public void elementsOfContuctUs(){
        ObjOfContuctUs = PageFactory.initElements(driver,ContuctUs.class);
    }
    @Test
    public void testContustUs() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ContactUs();
        selectOptionByVisibleText(inputeInSelectState, "California");
        ObjOfContuctUs.clickInGoButton.click();
    }
}
