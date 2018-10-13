package pages;

import base.CommonAPI;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static googleAPI.GoogleApiReader.getSheetsService;

public class SignInGoogleSheet extends CommonAPI {
    @FindBy(css = "#signIn")
    public static WebElement SingnInButton;
    @FindBy(css = "#onlineId1")
    public static WebElement OnlineIdbox;
    @FindBy(css = "#passcode1")
    public static WebElement Passcode;
    public List<List<Object>> getSpreadSheetRecords(String spreadsheetId, String range) throws IOException {
        // Build a new authorized API client service.
        Sheets service = getSheetsService();
        ValueRange response = service.spreadsheets().values()
                .get(spreadsheetId, range)
                .execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.size() == 0) {
            return null;
        } else {
            return values;
        }
    }
    // // LogIn by using Google Sheet sheet data
    public List<String> signInByInvalidIdPass(String spreadsheetId, String range) throws IOException, InterruptedException {
        List<List<Object>> col2Value = getSpreadSheetRecords(spreadsheetId, range);
        List<String> actual = new ArrayList<>();
        for (List row : col2Value) {
            //SingnInButton.click();
            inputValueInTextBoxByWebElement(OnlineIdbox, row.get(0).toString());
            inputValueInTextBoxByWebElement(Passcode, row.get(1).toString());
            clearInputBox(OnlineIdbox);
            clearInputBox(Passcode);
        }
        return actual;
    }
}
