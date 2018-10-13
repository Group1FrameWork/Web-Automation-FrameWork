/*
package signInPageObjects;

import base.CommonAPI;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.SheetsScopes;
import com.google.api.services.sheets.v4.model.ValueRange;
import googleAPIs.GoogleSheetReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static googleAPIs.GoogleSheetReader.getSheetsService;
import static org.openqa.selenium.support.How.ID;

public class GoogleSheetsPage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"wag-body-container-wrapper\"]")
    public static WebElement account;
    @FindBy(xpath = "/html//button[@id='wag-regoptions-signupforbasic']")
    public static WebElement signButton;
    @FindBy(xpath = "/html//input[@id='wag-regform-firstname']")
    public static WebElement loginfirstbox;
    @FindBy(xpath = "/html//input[@id='wag-regform-lasttname']")
    public static WebElement loginlastbox;
    @FindBy(xpath = "/html//input[@id='wag-regform-email']")
    public static WebElement loginemailbox;

    @FindBy(how = ID, using = "fm-login-password")
    public static WebElement password;
    @FindBy(className = "notice-descript")
    public static WebElement signInErrorMesage;

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

    // WAL-LogIn by using Google Sheet sheet data
    public List<String> signInByInvalidIdPass(String spreadsheetId, String range) throws IOException, InterruptedException {
        List<List<Object>> col2Value = getSpreadSheetRecords(spreadsheetId, range);
        List<String> actual = new ArrayList<>();
        for (List row : col2Value) {
            sleepFor(1);
            inputValueInTextBoxByWebElement(account, row.get(1).toString());
            inputValueInTextBoxByWebElement(password, row.get(2).toString());
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

}

*/
