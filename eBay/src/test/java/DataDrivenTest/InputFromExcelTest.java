package DataDrivenTest;

import DataDriven.InputFromExcel;
import DataReader.XlsDataReaderUtil;
import PageObjectModel.HomePage;
import PageObjectModel.SignInPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class InputFromExcelTest extends InputFromExcel {
    HomePage homePage;
    SignInPage signInPage;
    InputFromExcel byInput;
    @BeforeMethod
    public void initialization(){
        homePage = PageFactory.initElements(driver, HomePage.class);
        byInput = PageFactory.initElements(driver, InputFromExcel.class);
        signInPage = PageFactory.initElements(driver, SignInPage.class);
    }
    @DataProvider
    public Iterator<Object[]> supplyData(){

        ArrayList<Object[]> testData =
                XlsDataReaderUtil.getDataFromExcel();

        return testData.iterator();

    }
    @Test(dataProvider = "supplyData")
    public void signIn(String email, String passCode, String message) throws InterruptedException {
        TestLogger.log("email: " + email);
        TestLogger.log("password: " + passCode);
        TestLogger.log("message: " + message);

        byInput.ClickOnSignIn();
        Thread.sleep(50000);

        //objOfSignInPage.switchToSignInForm();
        TestLogger.log("In Sign In Page");
        byInput.signInUsingDataProvider(email,passCode,message);
        TestLogger.log("Test Passed");

    }

    @Test
   public void signInWithExcelData()throws IOException, InterruptedException ,Exception{
       //TestLogger.log(getClass().getSimpleName()+":"+ convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
   sleepFor(3);
    homePage.clickSignIn();
    sleepFor(3);
       String[] expectedItems = byInput.getAssertData("DataFile2.xls");
       String[] actualItems = byInput.getVerificationValue("DataFile2.xls");
       for (int i = 0; i < actualItems.length; i++) {
           Assert.assertTrue(actualItems[i].contains(expectedItems[i]));
           System.out.println(expectedItems[i] + ": Test - Passed");
       }
       System.out.println("signInWithInvalidIdAndPassword");
   }
}
