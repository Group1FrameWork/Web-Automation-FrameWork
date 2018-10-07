package signInPageObjects;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;

import static org.openqa.selenium.support.How.ID;
import static org.openqa.selenium.support.How.XPATH;

public class SignInPage extends CommonAPI {

    @FindBy(xpath = "/html//input[@id='userName-phoneNo']")
    public static WebElement account;
    @FindBy(xpath = "")
    public static WebElement password;
    @FindBy(xpath = "/html//button[@id='continueBtn']")
    public static WebElement loginSubmit;
    @FindBy(css = "#advisory > a:nth-child(2)")
    public static WebElement getcode;
    @FindBy(className = "notice-descript")
    public static WebElement signInMesage;

    //Switch to Sign In form
   @BeforeMethod
    public void switchToSignInForm() {
        driver.switchTo().frame("www.walgreens.com/login.jsp?clearIntent=true");
    }

    // Sign in with valid id and email
    public String signIn() throws InterruptedException {

        account.sendKeys("kiranrazu@gmail.com");
        loginSubmit.click();
        sleepFor(2);
        password.sendKeys("Kiranrazu96");
        loginSubmit.click();
        String Message = signInMesage.getText();
        System.out.println("Sign In Message" + Message);
        return Message;
    }
    // Get Help Here option verification
    public void getCodehere() {
        getcode.click();
    }


}






