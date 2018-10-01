package testDataReader;

import dataReader.XlsDataReaderUtil;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.CountrySelection;
import pages.SignInOrRegister;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.Iterator;

public class TestSignInWithExcelFile extends SignInOrRegister {
    SignInOrRegister signInOrRegister;
    @BeforeMethod
    public void initializationOfElement(){
        //TestLogger.log(getClass().getSimpleName()+": "+converToString((new Object(){}.getClass().getEnclosingMethod().getName())));
        signInOrRegister=PageFactory.initElements(driver, SignInOrRegister.class);
    }
    @Test(dataProvider = "supplyData")
    public void testsignInWithExcel(String email, String password, String message) throws InterruptedException {
        TestLogger.log("email: " + email);
        TestLogger.log("password: " + password);
        TestLogger.log("message: " + message);
        signInOrRegister.SignIn.click();
        Thread.sleep(900);
        TestLogger.log("In Sign In Page");
        signInOrRegister.EmailId.sendKeys(email);
        Thread.sleep(900);
        signInOrRegister.PasswordBar.sendKeys(password);
        Thread.sleep(900);
        signInOrRegister.SignInButton.click();
        TestLogger.log("Test Passed");
    }
}
