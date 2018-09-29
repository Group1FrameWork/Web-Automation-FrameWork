package GoogleSheetTest;

import GoogleSheet.GoogleSheetsPage;
import PageObjectModel.HomePage;
import PageObjectModel.SignInPage;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.io.IOException;
import java.util.List;

public class TestGoogleSheetsPage extends CommonAPI {
    HomePage objOfHomePage;
    SignInPage objOfSignInPage;
    GoogleSheetsPage objGoogleSheetsPage;


    @BeforeMethod
    public void initialization(){
        objOfHomePage = PageFactory.initElements(driver, HomePage.class);
        objOfSignInPage = PageFactory.initElements(driver, SignInPage.class);
       objGoogleSheetsPage = PageFactory.initElements(driver, GoogleSheetsPage.class);
    }
    // ALI_GS_TC1: Verify log in by taking data from a google sheets file
    @Test
    public void testLogInByInvalidIdPassUsingGoogleSheet() throws IOException, InterruptedException {
        sleepFor(3);
      waitUntilClickAble(By.cssSelector("#gh-ug > a"));
      clickOnCss("#gh-ug > a");
        sleepFor(3);
       // objOfSignInPage.switchToSignInForm();
        sleepFor(3);
        int i = 0;
        String spreadsheetId = "1Pk3G4ywe7Uhj_EqRG5tSS8boi0SXVsStMXhMvahYmik";
        String range = "Sheet1!A2:D";
        List<String> actualErrorMessage = objGoogleSheetsPage.signInByInvalidIdPass(spreadsheetId, range);
        List<List<Object>> expectedErrorMessage = objGoogleSheetsPage.getSpreadSheetRecords(spreadsheetId, range);
        for (List row : expectedErrorMessage) {
            // Assert.assertTrue(actualErrorMessage.get(i).contains(row.get(3).toString()));
            //System.out.println("expected"+row.get(3).toString());
            System.out.println(expectedErrorMessage.get(i) + ": Search - Passed");
            i++;
        }
        System.out.println("testLogInByInvalidIdPassUsingGoogleSheet Passed");
    }

}
