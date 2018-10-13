package testSavingPage;

import base.CommonAPI;
import homePage.FindTheLocation;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import savingPage.Saving;

import java.awt.image.SampleModel;

public class TestSaving extends Saving {
    Saving objofSaving;
    @BeforeMethod
    public void clickSavingPage(){
        objofSaving = PageFactory.initElements(driver,Saving.class);
    }
    @Test
    public void savingPageTest()throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickInSavingsPage();}
}
