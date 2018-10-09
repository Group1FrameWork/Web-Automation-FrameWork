package TestDatabases;

import Front.FrontPage;
import Front.NextPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

    public class LogInUsingDataProvider extends CommonAPI {
        FrontPage frontPage;
        NextPage nextPage;

        @BeforeMethod
        public void initializationOfElements() {
            frontPage = PageFactory.initElements(driver, FrontPage.class);
            nextPage = PageFactory.initElements(driver, NextPage.class);
        }
    /*
    @DataProvider
    public Iterator<Object[]> supplyData(){

        ArrayList<Object[]> testData =
                XlsDataReaderUtil.getDataFromExcel();

        return testData.iterator();

    }*/
    /*@Test(dataProvider = "supplyData")
    public void signIn(String email, String passCode, String message) throws InterruptedException {
        TestLogger.log("email: " + email);
        TestLogger.log("password: " + passCode);
        TestLogger.log("message: " + message);

        objOfHomePage.clikSignIn();
        objOfSignInPage.switchToSignInForm();
        TestLogger.log("In Sign In Page");
        objOfSignInPage.signInUsingDataProvider(email, passCode, message);
        TestLogger.log("Test Passed");

    }
    }
    */

}
