package testGoogleSheet;

import googleAPI.GoogleSheetReader;
import googleSheetSignIn.GoogleSheetSignIn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SignInOrRegister;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class TestSignInWithGoogleSheet extends GoogleSheetSignIn {
    GoogleSheetSignIn googleSheetSignIn;
    SignInOrRegister signInOrRegister;
    @BeforeMethod
    public void initializationOfElement(){
        googleSheetSignIn=PageFactory.initElements(driver, GoogleSheetSignIn.class);
        signInOrRegister=PageFactory.initElements(driver, SignInOrRegister.class);
    }



    @Test
    public void testLogInByInvalidIdPassUsingGoogleSheet() throws IOException, InterruptedException {
        googleSheetSignIn.SignIn.click();
        sleepFor(3);

        sleepFor(3);
        int i = 0;
        String spreadsheetId = "1QYj8-C4CwZbUtpqkcTE3zCB8nyvuG8RXGwnobMn_qYM";
        String range = "Sheet1!B2:D";
        List<String> actualErrorMessage = googleSheetSignIn.signInByInvalidIdPass(spreadsheetId, range);
        List<List<Object>> expectedErrorMessage = googleSheetSignIn.getSpreadSheetRecords(spreadsheetId, range);
        for (List row : expectedErrorMessage) {
            Assert.assertTrue(actualErrorMessage.get(i).contains(row.get(2).toString()));
            System.out.println("expected" + row.get(2).toString());
            System.out.println(expectedErrorMessage.get(i) + ": Search - Passed");
            i++;
        }
        System.out.println("testLogInByInvalidIdPassUsingGoogleSheet Passed");
    }
    @Test
    public void SearchItemsFromSearchBox() throws IOException, InterruptedException, Exception {
        googleSheetSignIn.searchItemsByName();
    }


}
