package search;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Checking;
import reporting.TestLogger;

public class TestChecking extends Checking {
    Checking objOfChecking;
    @BeforeMethod
    public void clickChecking(){
        objOfChecking = PageFactory.initElements(driver,Checking.class);
        }
     @Test
    public void CompareAccout(){
         TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
         clickInCecking();}
}
