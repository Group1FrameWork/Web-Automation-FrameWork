package DataBases;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;
import utility.DataReader;

import java.io.IOException;

import static org.openqa.selenium.support.How.CSS;
import static org.openqa.selenium.support.How.XPATH;

public class DBExcel extends CommonAPI {
    @FindBy(how = CSS, using = "#app > div:nth-child(2) > div > header > section.css-1waixk9.eid77k2 > div.css-pbg2l9.e1uwo0ec1 > button" )
    public static WebElement signIn;
    @FindBy(how = CSS, using = "#username")
    public static WebElement userName;
    @FindBy(how = CSS, using = "#password" )
    public static WebElement passWord;
    @FindBy(how = XPATH, using = "//*[@id='submitButton']")
    public static WebElement signInSubmit;
    @FindBy(how =XPATH, using = "//*[@id=\"js-facebook-oauth-login\"]")
    public static WebElement facebook;
    @FindBy(how =XPATH, using = "//*[@id=\"js-google-oauth-login\"]")
    public static WebElement googleAccount;
    @FindBy(how =XPATH, using = "//*[@id=\"formBox\"]/div/div/div/div/div[4]/div[2]/span/text()")
    public static WebElement ErrorMessage;

    DataReader dtr = new DataReader();
    //
    public String[] getDataCol2(String fileName) throws IOException {
        String path = "../NYTimes/Data/" + fileName;
        String[] output = dtr.colReader(path, 2); //col 2 = email
        return output;
    }
    //
    public String[] getDataCol3(String fileName) throws IOException {
        String path = "../NYTimes/Data/" + fileName;
        String[] output = dtr.colReader(path, 3); //col 3 = password
        return output;
    }
    //
    public String[] getAssertData(String fileName) throws IOException {
        String path = "../NYTimes/Data" + fileName;
        String[] output = dtr.colReader(path, 4);
        return output;
    }
    // LogIn by using excel sheet data
    public String[] getVerificationValue(String fileName) throws IOException, InterruptedException {
        String[] col2Value = getDataCol2(fileName);
        String[] col3Value = getDataCol3(fileName);
        String[] actual = new String[col2Value.length];
        for (int i = 0; i < col2Value.length; i++) {
            inputValueInTextBoxByWebElement(userName, col2Value[i]);
            sleepFor(5);
            inputValueInTextBoxByWebElement(passWord, col3Value[i]);
            sleepFor(5);
            // actual[i] = getCurrentPageTitle();
            actual[i] = getTextByWebElement(ErrorMessage);
            sleepFor(5);
            System.out.println(actual[i]);
            clearInputBox(userName);
            clearInputBox(passWord);
        }
        return actual;
    }
    public String[] getDataFromSignInKeyword(String fileName) throws IOException {
        String path = "../NYTimes/Data/" + fileName;
        String[] output = dtr.colReader(path, 2); //col 2 = email
        return output;
    }
    public void test(){
        signIn.click();
        userName.sendKeys("dsghsj");
        passWord.sendKeys("hsdhjsgdh");
    }
    public void signInUsingDataProvider(String email, String passCode, String message) throws InterruptedException {
        signIn.click();
        TestLogger.log(getClass().getSimpleName()+": "+converToString((new Object(){}.getClass().getEnclosingMethod().getName())));
        TestLogger.log("email: " + email);
        TestLogger.log("password: " + passCode);
        TestLogger.log("message: " + message);
        userName.sendKeys(email);
        passWord.sendKeys(passCode);
    }
}