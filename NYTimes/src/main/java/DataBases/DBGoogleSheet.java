package DataBases;

import base.CommonAPI;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static googleAPIs.GoogleSheetReader.getSheetsService;
import static org.openqa.selenium.support.How.CSS;

public class DBGoogleSheet extends CommonAPI {
    @FindBy(how = CSS, using = "#app > div:nth-child(2) > div > header > section.css-1waixk9.eid77k2 > div.css-pbg2l9.e1uwo0ec1 > button" )
    public static WebElement signIn;
    @FindBy(how = CSS, using = "#username")
    public static WebElement userName;
    @FindBy(how = CSS, using = "#password" )
    public static WebElement passWord;
    //ALI_GS_TC1
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
            sleepFor(1);
            inputValueInTextBox(userName, row.get(1).toString());
            inputValueInTextBox(passWord, row.get(2).toString());
            sleepFor(1);
            //actual.add(getCurrentPageTitle());
            //actual.add(getTextByWebElement(signInErrorMesage));
            //System.out.println(getTextByWebElement(signInErrorMesage));
            clearInputBox(userName);
            clearInputBox(passWord);
            sleepFor(1);
        }
        return actual;
    }
}
