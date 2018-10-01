package java.googleSheetSignIn;

import base.CommonAPI;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static googleAPIs.GoogleSheetReader.getSheetsService;

public class GoogleSheetSignIn extends CommonAPI {
    @FindBy(css = "#header_sign_in")
    public static WebElement SignIn;
    @FindBy(css = "#logonId")
    public static WebElement EmailId;
    @FindBy(css = "#LogonForm > fieldset > div:nth-child(5) > input")
    public static WebElement SignInButton;
    @FindBy(css = "#logonPassword")
    public static WebElement PasswordBar;
    @FindBy(css = "#LogonForm > fieldset > div:nth-child(2) > label.error")
    public static WebElement EmailError;
    @FindBy(css = "#LogonForm > fieldset > div:nth-child(3) > label.error")
    public static WebElement BlankPasswordError;
    @FindBy(css = "#logon > div > div > div.critical-notification.form-group")
    public static WebElement SignInError;
    @FindBy(css = "#search-field")
    public static WebElement searchBar;


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
            inputValueInTextBoxByWebElement(EmailId, row.get(0).toString());
            inputValueInTextBoxByWebElement(PasswordBar, row.get(1).toString());
            sleepFor(1);
            SignInButton.click();
            //actual.add(getCurrentPageTitle());
            actual.add(getTextByWebElement(SignInError));
            System.out.println(getTextByWebElement(SignInError));
            clearInputBox(EmailId);
            clearInputBox(PasswordBar);
            sleepFor(1);
        }
        return actual;
    }
    public List<String> searchItemsByName() throws IOException, InterruptedException, Exception {
        List<List<Object>> values = getSpreadSheetRecords("1vyXCpuy3an7XOPL69fJH0p5YsHoSFwta1_GK2BQ7Ys4", "Sheet1!A1:A");
        List<String> actual = new ArrayList<>();

        for (List row : values) {
            int i = 0;
            sleepFor(2);
            if (i <= row.size()) {
                inputValueInTextBoxByWebElement(searchBar, row.get(i).toString());
                sleepFor(2);
                //actual.add(getCurrentPageUrl());
                clearInputBox(searchBar);
                sleepFor(2);
                i++;
            }
        }
        return actual;
    }

}
