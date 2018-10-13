package search;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SignInGoogleSheet;
import pages.SignIn;
import reporting.TestLogger;

import java.io.IOException;
import java.util.List;

public class TestSignInGoogleSheet extends SignInGoogleSheet {
    SignIn objOfSignIn;
    SignInGoogleSheet objOfGoogleSheetApi;

    @BeforeMethod
    public void initialization(){
        objOfSignIn = PageFactory.initElements(driver, SignIn.class);
        objOfGoogleSheetApi = PageFactory.initElements(driver, SignInGoogleSheet.class);
    }
    @Test
    public void testLogInByInvalidIdPassUsingGoogleSheet() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName()+": "+converToString((new Object(){}.getClass().getEnclosingMethod().getName())));
        objOfGoogleSheetApi.SingnInButton.click();
        sleepFor(3);
        int i = 0;
        String spreadsheetId = "1Z-NqaNwEdkbqUMJ_Uta97lO32U6QuqMrWVUifm-KILY";
        String range = "Sheet1!B2:D";
        List<String> actualErrorMessage = objOfGoogleSheetApi.signInByInvalidIdPass(spreadsheetId, range);
        List<List<Object>> expectedErrorMessage = objOfGoogleSheetApi.getSpreadSheetRecords(spreadsheetId, range);
        for (List row : expectedErrorMessage) {
            Assert.assertTrue(actualErrorMessage.get(i).contains(row.get(2).toString()));
            System.out.println("expected" + row.get(2).toString());
            System.out.println(expectedErrorMessage.get(i) + ": Search - Passed");
            i++;
        }
        System.out.println("testLogInByInvalidIdPassUsingGoogleSheet Passed");
    }
}

