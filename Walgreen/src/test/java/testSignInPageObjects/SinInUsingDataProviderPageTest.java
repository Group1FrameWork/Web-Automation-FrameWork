package testSignInPageObjects;

import HomePageObjects.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import reporting.TestLogger;
import signInPageObjects.SignInPage;
import utility.XlsDataReaderUtil;

import java.util.ArrayList;
import java.util.Iterator;

public class SinInUsingDataProviderPageTest extends SignInPage {
    HomePage homePage;
    SignInPage signInPage;

    @BeforeMethod
    public void initializationOfElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        signInPage = PageFactory.initElements(driver, SignInPage.class);
    }
    @Test(priority = 1)
    public void testyourAccount(){
        YourAccount.click();
    }
    @DataProvider
    public Iterator<Object[]> supplyData() {
        ArrayList<Object[]> testData =
                XlsDataReaderUtil.getDataFromExcel();
        return testData.iterator();
    }
    @Test(dataProvider = "supplyData")
    public void signIn(String email, String passCode, String message) throws InterruptedException {
        TestLogger.log("email: " + email);
        TestLogger.log("password: " + passCode);
        TestLogger.log("message: " + message);

        homePage.clikSignIn();
        signInPage.switchToSignInForm();
        TestLogger.log("In Sign In Page");
        signInPage.signInUsingDataProvider(email, passCode, message);
        TestLogger.log("Test Passed");

    }
}

