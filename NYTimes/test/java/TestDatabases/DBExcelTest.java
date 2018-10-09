package TestDatabases;

import AuthenticationPage.LogInPage;
import DataBases.DBExcel;
import DataReader.XlsDataReaderUtil;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
public class DBExcelTest extends CommonAPI {

    LogInPage logInPage;
    DBExcel dBExcel;
    @BeforeMethod
    public void initialization(){
        logInPage = PageFactory.initElements(driver, LogInPage.class);
        dBExcel = PageFactory.initElements(driver, DBExcel.class);
    }
    @DataProvider
    public Iterator<Object[]> supplyData(){
        ArrayList<Object[]> testData =
                XlsDataReaderUtil.getDataFromExcel();
        return testData.iterator();

    }
    //@Test(dataProvider = "supplyData")
    public void signIn(String email, String passCode, String message) throws InterruptedException {
        TestLogger.log("email: " + email);
        TestLogger.log("password: " + passCode);
        TestLogger.log("message: " + message);
        //logInPage.clickLogIn();
        sleepFor(5);
        //objOfSignInPage.switchToSignInForm();
        TestLogger.log("In Sign In Page");
        dBExcel.signInUsingDataProvider(email,passCode,message);
        TestLogger.log("Test Passed");
    }
    @Test
    public void signInWithExcelData()throws IOException, InterruptedException ,Exception{
        //TestLogger.log(getClass().getSimpleName()+":"+ convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sleepFor(3);
        logInPage.clickLogIn();
        sleepFor(3);
        String[] expectedItems = dBExcel.getAssertData("ExcelData.xls");
        String[] actualItems = dBExcel.getVerificationValue("ExcelData.xls");
        for (int i = 0; i < actualItems.length; i++) {
            Assert.assertTrue(actualItems[i].contains(expectedItems[i]));
            System.out.println(expectedItems[i] + ": Test - Passed");
        }
        System.out.println("signInWithInvalidIdAndPassword");
    }
    @Test
    public void testing(){
        dBExcel.test();
    }
    @Test(dataProvider = "supplyData")
    public void testsignInWithExcel(String email, String passCode, String message) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName()+": "+converToString((new Object(){}.getClass().getEnclosingMethod().getName())));
        TestLogger.log("email: " + email);
        TestLogger.log("password: " + passCode);
        TestLogger.log("message: " + message);
        dBExcel.signIn.click();
        sleepFor(1);
        TestLogger.log("In Sign In Page");
        dBExcel.userName.sendKeys(email);
        sleepFor(1);
        dBExcel.passWord.sendKeys(passCode);
        sleepFor(1);
        dBExcel.signInSubmit.click();
        TestLogger.log("Test Passed");
    }
    @Test(dataProvider = "supplyData")
    public void testsignIn(String email, String passCode, String message) throws InterruptedException {
        dBExcel.signInUsingDataProvider(email,passCode,message);
    }
}

