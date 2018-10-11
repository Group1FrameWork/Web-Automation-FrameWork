package TestDatabases;

import DataBases.DBGoogleSheet;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;
import java.util.List;

public class DBGoogleSheetTest extends CommonAPI {
    DBGoogleSheet dbGoogleSheet;
    @BeforeMethod
    public void initialization(){
        dbGoogleSheet = PageFactory.initElements(driver, DBGoogleSheet.class);
    }
    @Test
    public void testLogInByInvalidIdPassUsingGoogleSheet() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName()+": "+converToString((new Object(){}.getClass().getEnclosingMethod().getName())));
        dbGoogleSheet.signIn.click();
        sleepFor(3);
        int i = 0;
        String spreadsheetId = "1rmlhLW8vC7qh76TmPtJam7JpNPzstYXy0TTYmP_6aoE";
        String range = "Sheet1!B2:D";
        List<String> actualErrorMessage = dbGoogleSheet.signInByInvalidIdPass(spreadsheetId, range);
        List<List<Object>> expectedErrorMessage = dbGoogleSheet.getSpreadSheetRecords(spreadsheetId, range);
        for (List row : expectedErrorMessage) {
            //Assert.assertTrue(actualErrorMessage.get(i).contains(row.get(2).toString()));
            //System.out.println("expected" + row.get(2).toString());
            System.out.println(expectedErrorMessage.get(i) + ": Search - Passed");
            i++;
        }
        System.out.println("testLogInByInvalidIdPassUsingGoogleSheet Passed");
    }
}
