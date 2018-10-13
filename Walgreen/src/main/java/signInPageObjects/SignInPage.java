package signInPageObjects;

import base.CommonAPI;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import static signInPageObjects.ByInputFromExls.signInErrorMesage;

public class SignInPage extends CommonAPI {
    @FindBy(xpath = "/html//input[@id='userName-phoneNo']")
    public  static WebElement account;
    @FindBy(xpath = "/html//input[@id='userName-phoneNo']")
    public static WebElement password;
    @FindBy(xpath = "/html//button[@id='continueBtn']")
    public static WebElement loginSubmit;
    @FindBy(css = "#advisory > a:nth-child(2)")
    public static WebElement getcode;
    @FindBy(className = "notice-descript")
    public static WebElement signInMesage;
    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div[2]/div/div[2]/div/div[1]/div/div/div[2]")
    public static WebElement YourAccount;
    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div[2]/div/div[2]/div/div[1]/div/div/div[2]/div[1]/p/a[1]/span")
    public static WebElement Signinbutton;
    @FindBy(xpath = "/html/body/div")
    public static WebElement SignedAccount;


    public void switchToSignInForm() {
        driver.switchTo().frame("https://www.walgreens.com/topic/promotion/pharmacy/text-opt-in.jsp?ban=RXSMS_hprxtext_sept18");
    }
    public Point yourAccount() throws InterruptedException {
        //hover over Categories. Hover in multiple windows.
        Actions act = new Actions(driver);
        act.moveToElement(YourAccount).click().moveToElement(Signinbutton).build().perform();
        sleepFor(1);
        Signinbutton.click();
        switchToSignInForm();
        Point SignedinMessage  = SignedAccount.getLocation();
        System.out.println("Signed in " + SignedinMessage);
        return SignedinMessage;

    }
    public void signInUsingDataProvider(String email, String passCode, String message) throws InterruptedException {
        // account.sendKeys(email);
        SendKeys(account,email, "account");
        password.sendKeys(passCode);
        sleepFor(2);
        loginSubmit.click();
        String errorMessage = signInErrorMesage.getText();
        TestLogger.log("Error Message: "+errorMessage);
        // Assert.assertEquals(errorMessage.contains(message), true);
    }
    // Sign in with valid id and email
    public String signIn() throws InterruptedException {
        account.sendKeys("kiranrazu@gmail.com");
        loginSubmit.click();
        sleepFor(1);
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






