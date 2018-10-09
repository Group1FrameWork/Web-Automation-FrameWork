package dataDrivenTest;

import base.CommonAPI;
import dataDriven.InputFromExcel;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjectModel.HomePage;
import pageObjectModel.SignInPage;
import reporting.TestLogger;

import java.io.IOException;

public class InputFromExcelTest extends InputFromExcel {
    HomePage homePage;
    SignInPage signInPage;
    InputFromExcel inputFromExcel;
    @BeforeMethod
    public void initialization(){
        homePage = PageFactory.initElements(CommonAPI.driver, HomePage.class);
        inputFromExcel = PageFactory.initElements(CommonAPI.driver, InputFromExcel.class);
        signInPage = PageFactory.initElements(CommonAPI.driver, SignInPage.class);
    }
    @Test(dataProvider = "supplyData")
    public void signIn(String email, String passCode, String message) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName()+":"+ convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        TestLogger.log("email: " + email);
        TestLogger.log("password: " + passCode);
        TestLogger.log("message: " + message);

        inputFromExcel.ClickOnSignIn();
        sleepFor(4);
        TestLogger.log("In Sign In Page");
        inputFromExcel.signInUsingDataProvider(email,passCode,message);
        TestLogger.log("Test Passed");
    }
    @Test
   public void signInWithExcelData()throws IOException, InterruptedException ,Exception{
        TestLogger.log(getClass().getSimpleName()+":"+ convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sleepFor(3);
        homePage.clickSignIn();
        sleepFor(3);
        String[] expectedItems = inputFromExcel.getAssertData("DataFile2.xls");
        String[] actualItems = inputFromExcel.getVerificationValue("DataFile2.xls");
        for (int i = 0; i < actualItems.length; i++) {
           Assert.assertTrue(actualItems[i].contains(expectedItems[i]));
           System.out.println(expectedItems[i] + ": Test - Passed");
       }
       System.out.println("signInWithInvalidIdAndPassword");
   }
}
