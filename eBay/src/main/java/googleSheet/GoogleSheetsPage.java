package googleSheet;

import base.CommonAPI;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static googleAPIs.GoogleSheetReader.getSheetsService;
import static org.openqa.selenium.support.How.XPATH;

public class GoogleSheetsPage extends CommonAPI {
    @FindBy(how = XPATH, using = "//*[@id=\"userid\"]")
    public static WebElement account;
    @FindBy(how = XPATH, using = "//*[@id=\"pass\"]")
    public static WebElement password;
    @FindBy(how = XPATH, using = "//*[@id=\"errf\"]")
    public static WebElement signInErrorMesage;
    @FindBy(how = XPATH, using = "//*[@id=\"gh-ac\"]")
    public static WebElement searchBox;
    @FindBy(how = XPATH, using = "//*[@id=\"gh-btn\"]")
    public static WebElement searchButton;

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
    // LogIn by using Google Sheet sheet data
    public List<String> signInByInvalidIdPass(String spreadsheetId, String range) throws IOException, InterruptedException {
        List<List<Object>> col2Value = getSpreadSheetRecords(spreadsheetId, range);
        List<String> actual = new ArrayList<>();
        for (List row : col2Value) {
            sleepFor(1);
            inputValueInTextBoxByWebElement(account, row.get(0).toString());
            inputValueInTextBoxByWebElement(password, row.get(1).toString());
            sleepFor(1);
            //actual.add(getCurrentPageTitle());
            actual.add(getTextByWebElement(signInErrorMesage));
            System.out.println(getTextByWebElement(signInErrorMesage));
            clearInputBox(account);
            clearInputBox(password);
            sleepFor(1);
        }
        return actual;
    }
    public List<String> searchItemsByName() throws IOException, InterruptedException, Exception {
        List<List<Object>> values = getSpreadSheetRecords("1HUSUQqCG0SZrXz3BmdOaf7g4ramQfoGiPpZtNW8-k4g", "Sheet1!A2:B");
        List<String> actual = new ArrayList<>();

        for (List row : values) {
            int i = 0;
            sleepFor(2);
            if (i <= row.size()) {
                inputValueInTextBoxByWebElement(searchBox, row.get(i).toString());
                sleepFor(2);
                //actual.add(getCurrentPageUrl());
                clearInputBox(searchBox);
                sleepFor(2);
                i++;
            }
        }
        return actual;
    }
}