package search;

import dataProviderUtility.XlsDataReaderUtil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.SignIn;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.Iterator;

public class TestSignIn extends SignIn {
    SignIn elementsOfSignIn;
    @BeforeMethod
    public void ObjOfSignIn(){
        elementsOfSignIn = PageFactory.initElements(driver,SignIn.class);
        }
    @DataProvider
    public Iterator<Object[]> supplyData(){
        ArrayList<Object[]> testData = XlsDataReaderUtil.getDataFromExcel();
        return testData.iterator();
    }
    @Test
    public void signin(){clickInSignIn();}

    @Test(dataProvider = "supplyData")
    public void testsignInWithExcel(String onlineid, String passcode, String message) throws InterruptedException {
        TestLogger.log("onlineid " + onlineid);
        TestLogger.log("passcord: " + passcode);
        TestLogger.log("message: " + message);
        TestLogger.log("In Sign In Page");
        elementsOfSignIn.SingnInButton.click();
        TestLogger.log("Test Passed");
        elementsOfSignIn.OnlineIdbox.sendKeys(onlineid, Keys.ENTER);
        Thread.sleep(2000);
        elementsOfSignIn.Passcode.sendKeys(passcode, Keys.ENTER);
        Thread.sleep(2000);

    }
}
