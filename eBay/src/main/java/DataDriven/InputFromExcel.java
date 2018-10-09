package DataDriven;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.DataReader;

import java.io.IOException;

public class InputFromExcel extends CommonAPI {
    @FindBy(how = How.CSS, using = "#userid")
    public static WebElement UserName;

    @FindBy(how = How.CSS, using = "#pass")
    public static WebElement Password;

    @FindBy(how = How.CSS, using = "#errf")
    public static WebElement ErrorMessage;

    @FindBy(how = How.CSS, using = "#sgnBt")
    public static WebElement SignInbtn;

    @FindBy(how = How.CSS, using = "#gh-ug > a")
    public static WebElement SignInLink;

    DataReader dtr = new DataReader();

    //
    public String[] getDataCol2(String fileName) throws IOException {
        String path = "../eBay/Data/" + fileName;
        String[] output = dtr.colReader(path, 2); //col 2 = email
        return output;
    }

    //
    public String[] getDataCol3(String fileName) throws IOException {
        String path = "../eBay/Data/" + fileName;
        String[] output = dtr.colReader(path, 3); //col 3 = password
        return output;
    }

    //
    public String[] getAssertData(String fileName) throws IOException {
        String path = "../eBay/Data/" + fileName;
        String[] output = dtr.colReader(path, 4);
        return output;
    }
    public void signInUsingDataProvider(String email, String passCode, String message) throws InterruptedException {

        UserName.sendKeys(email);
        SendKeys(UserName, email, "account");
        Password.sendKeys(passCode);
        Thread.sleep(3000);
        SignInbtn.click();
        String errorMessage = ErrorMessage.getText();
        //TestLogger.log("Error Message: " + errorMessage);
    }

    // LogIn by using excel sheet data
    public String[] getVerificationValue(String fileName) throws IOException, InterruptedException {
        String[] col2Value = getDataCol2(fileName);
        String[] col3Value = getDataCol3(fileName);
        String[] actual = new String[col2Value.length];
        for (int i = 0; i < col2Value.length; i++) {
            inputValueInTextBoxByWebElement(UserName, col2Value[i]);
            sleepFor(5);
            inputValueInTextBoxByWebElement(Password, col3Value[i]);
            sleepFor(5);
            // actual[i] = getCurrentPageTitle();
            actual[i] = getTextByWebElement(ErrorMessage);
            sleepFor(5);
            System.out.println(actual[i]);
            clearInputBox(UserName);
            clearInputBox(Password);
        }
        return actual;
    }

    public String[] getDataFromSignInKeyword(String fileName) throws IOException {
        String path = "../eBay/Data/" + fileName;
        String[] output = dtr.colReader(path, 2); //col 2 = email
        return output;
    }

    public void ClickOnSignIn(){
        SignInLink.click();
    }
}