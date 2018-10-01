package java.pages;

import base.CommonAPI;
import DataReader.XlsDataReaderUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SignInOrRegister extends CommonAPI {
    @FindBy(css = "#header_sign_in")
    public static WebElement SignIn;
    @FindBy(css = "#logonId")
    public static WebElement EmailId;
    @FindBy(css = "#LogonForm > fieldset > div:nth-child(5) > input")
    public static WebElement SignInButton;
    @FindBy(css = "#logonPassword")
    public static WebElement PasswordBar;
    @FindBy(css = "#LogonForm > fieldset > div:nth-child(4) > div > label")
    public static WebElement CheckBox;
    @FindBy(css = "#LogonForm > fieldset")
    public static WebElement RegistrationFrame;
    @FindBy(css = "#LogonForm > fieldset > div:nth-child(2) > label.error")
    public static WebElement EmailError;
    @FindBy(css = "#LogonForm > fieldset > div:nth-child(3) > label.error")
    public static WebElement BlankPasswordError;
    @FindBy(css = "#logon > div > div > div.critical-notification.form-group")
    public static WebElement InvalidPassError;

    public List<String> openingSignInPage() {
        SignIn.click();
        EmailId.click();
        EmailId.sendKeys("abcd");
        SignInButton.click();
        String actual1=(EmailError.getText());
        String actual2=(BlankPasswordError.getText());
        List<String> actualList=new ArrayList<String>();
        actualList.add(actual1);
        actualList.add(actual2);
        System.out.println(actualList);
        return actualList;
    }

    public void signInButtonEnableStatus() {
        SignIn.click();
        boolean tx = SignInButton.isEnabled();
        System.out.println(tx);

    }

    public void checkBoxSelectStatus() {
        SignIn.click();
    }

    public void sizeOfSignIn() {
        getSizeOfElement(SignIn);
    }

    /*public List<String> signUpHardCoded(String email, String password) throws InterruptedException {
        SignIn.click();
        Thread.sleep(900);
        EmailId.sendKeys(email);
        Thread.sleep(900);
        PasswordBar.sendKeys(password);
        Thread.sleep(900);
        SignInButton.click();
        Thread.sleep(900);
        System.out.println(EmailError.getText());
        System.out.println(PasswordError.getText());


        return ;
    }*/
    //String email;
    //String password;

    public List<String> signUpHardCoded(String email, String password) throws InterruptedException {
        SignIn.click();
        Thread.sleep(900);
        EmailId.sendKeys(email);
        Thread.sleep(900);
        PasswordBar.sendKeys(password);
        Thread.sleep(900);
        SignInButton.click();
        Thread.sleep(900);
        String actual1=(EmailError.getText());
        String actual2=(BlankPasswordError.getText());
        List<String> actualList=new ArrayList<String>();
        actualList.add(actual1);
        actualList.add(actual2);
        System.out.println(actualList);
        return actualList;
    }
    public String invalidPass(String email, String password) throws InterruptedException {
        SignIn.click();
        Thread.sleep(900);
        EmailId.sendKeys(email);
        Thread.sleep(900);
        PasswordBar.sendKeys(password);
        Thread.sleep(900);
        SignInButton.click();
        //String actual=InvalidPassError.getText();
        String actual=(InvalidPassError.getText());
        return actual;
    }

    @DataProvider
    public Iterator<Object[]> supplyData(){

        ArrayList<Object[]> testData =
                XlsDataReaderUtil.getDataFromExcel();
        return testData.iterator();
    }
    public void clickSignIn(){
        SignIn.click();
    }
    public void clickEmailId(String email){
        EmailId.sendKeys(email);
    }
    public void clickPassword(){
        PasswordBar.click();
    }
    public void clickSignInButton(){
        SignInButton.click();
    }
    public String testSignInWithExcel(String email, String password, String message) throws InterruptedException {
        SignIn.click();
        Thread.sleep(900);
        EmailId.sendKeys(email);
        Thread.sleep(900);
        PasswordBar.sendKeys(password);
        Thread.sleep(900);
        SignInButton.click();
        //String actual=InvalidPassError.getText();
        String actual=(InvalidPassError.getText());
        return actual;
    }
}
