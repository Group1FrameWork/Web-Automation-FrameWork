package DataDrivenTest;

import DataReader.XlsDataReaderUtil;
import DataDriven.InputFromExcel;
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
    HomePage objOfHomePage;
    SignInPage objOfSignInPage;
    InputFromExcel objByInput;
    @BeforeMethod
    public void initialization(){
        objOfHomePage = PageFactory.initElements(driver, HomePage.class);
        objByInput = PageFactory.initElements(driver, InputFromExcel.class);
        objOfSignInPage = PageFactory.initElements(driver, SignInPage.class);
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

        objByInput.ClickOnSignIn();
        Thread.sleep(50000);

        //objOfSignInPage.switchToSignInForm();
        TestLogger.log("In Sign In Page");
        objByInput.signInUsingDataProvider(email,passCode,message);
        TestLogger.log("Test Passed");

    }

    @Test
   public void signInWithExcelData()throws IOException, InterruptedException ,Exception{
       //TestLogger.log(getClass().getSimpleName()+":"+ convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
   sleepFor(3);
    objOfHomePage.clickSignIn();
    sleepFor(3);
       String[] expectedItems = objByInput.getAssertData("DataFile2.xls");
       String[] actualItems = objByInput.getVerificationValue("DataFile2.xls");
       for (int i = 0; i < actualItems.length; i++) {
           Assert.assertTrue(actualItems[i].contains(expectedItems[i]));
           System.out.println(expectedItems[i] + ": Test - Passed");
       }
       System.out.println("signInWithInvalidIdAndPassword");
   }
}
