package testHomepage;

import homePage.FindTheLocation;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Checking;
import reporting.TestLogger;

public class TestFindLocation extends FindTheLocation {
    FindTheLocation objofFindTheLocation;
    @BeforeMethod
    public void clickInATM(){
        objofFindTheLocation = PageFactory.initElements(driver,FindTheLocation.class);
    }
    @Test

    public void financialCenter(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        closestFinancialCenter();}
    @Test
    public void inputZipcodeSearch(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickInZipCode();}
    @Test
    public void navigation(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        navigateto();}
}
