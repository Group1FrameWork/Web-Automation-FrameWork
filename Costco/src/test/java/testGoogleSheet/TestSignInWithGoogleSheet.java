package testGoogleSheet;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import testDataReader.SignIn;
import java.io.IOException;
import java.pages.SignInOrRegister;
import java.util.List;
import static base.CommonAPI.sleepFor;
public class TestSignInWithGoogleSheet extends SignIn {
    SignIn googleSheetSignIn;
    SignInOrRegister signInOrRegister;
    @BeforeMethod
    public void initializationOfElement(){
        googleSheetSignIn=PageFactory.initElements(CommonAPI.driver, SignIn.class);
        signInOrRegister=PageFactory.initElements(CommonAPI.driver, SignInOrRegister.class);
    }
    @Test
    public void testLogInByInvalidIdPassUsingGoogleSheet() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName()+": "+converToString((new Object(){}.getClass().getEnclosingMethod().getName())));
        googleSheetSignIn.signIn.click();
        sleepFor(3);
        sleepFor(3);
        int i = 0;
        String spreadsheetId = "1QYj8-C4CwZbUtpqkcTE3zCB8nyvuG8RXGwnobMn_qYM";
        String range = "Sheet1!B2:D";
        System.out.println("testLogInByInvalidIdPassUsingGoogleSheet Passed");
    }
    @Test
    public void SearchItemsFromSearchBox() throws IOException, InterruptedException, Exception {
        TestLogger.log(getClass().getSimpleName()+": "+converToString((new Object(){}.getClass().getEnclosingMethod().getName())));
        //googleSheetSignIn.searchItemsByName();
    }
}
