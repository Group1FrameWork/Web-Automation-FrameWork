package testSavingPage;

import homePage.FindTheLocation;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import savingPage.RewordSaving;

public class TestRewordSaving extends RewordSaving {
    RewordSaving objofRewordSaving;
    @BeforeMethod
    public void clickInSaving(){ objofRewordSaving = PageFactory.initElements(driver,RewordSaving.class);}
    @Test
    public void clickInRewordSaving(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        rewordSaving();}
}
