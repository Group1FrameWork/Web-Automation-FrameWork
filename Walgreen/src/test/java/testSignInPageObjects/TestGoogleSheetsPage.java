/*
package testSignInPageObjects;

import HomePageObjects.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import signInPageObjects.GoogleSheetsPage;
import signInPageObjects.SignInPage;

import java.io.IOException;
import java.util.List;

public class TestGoogleSheetsPage extends GoogleSheetsPage {
    HomePage homePage;
    SignInPage signInPage;
    GoogleSheetsPage googleSheetsPage;


    @BeforeMethod
    public void initialization(){
        homePage = PageFactory.initElements(driver, HomePage.class);
        signInPage = PageFactory.initElements(driver, SignInPage.class);
        googleSheetsPage = PageFactory.initElements(driver, GoogleSheetsPage.class);
    }
    //WAL_read google sheet: Verify log in by taking data from a google sheets file
    @Test
    public void testLogInByInvalidIdPassUsingGoogleSheet() throws IOException, InterruptedException {
        sleepFor(3);
        homePage.clikSignIn();
        sleepFor(3);
        signInPage.switchToSignInForm();
        sleepFor(3);
        int i = 0;
        String spreadsheetId = "1A6G3avCchSjTPM1xoGU8YaYo3azwl4uHBsfgwRZB31A";
        String range = "Sheet1!A2:D";
        List<String> actualErrorMessage = googleSheetsPage.signInByInvalidIdPass(spreadsheetId, range);
        List<List<Object>> expectedErrorMessage = googleSheetsPage.getSpreadSheetRecords(spreadsheetId, range);
        for (List row : expectedErrorMessage) {
            Assert.assertTrue(actualErrorMessage.get(i).contains(row.get(3).toString()));
            System.out.println("expected"+row.get(3).toString());
            System.out.println(expectedErrorMessage.get(i) + ": Search - Passed");
            i++;
        }
        System.out.println("testLogInByInvalidIdPassUsingGoogleSheet Passed");
    }
}

*/
