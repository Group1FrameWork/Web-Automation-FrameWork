package AuthenticationPage;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import static org.openqa.selenium.support.How.XPATH;

public class LogInPage extends CommonAPI {
    @FindBy(how = XPATH, using = "//*[@id=\"username\"]")
    public static WebElement userName;
    @FindBy(how = XPATH, using = "//*[@id=\"password\"]" )
    public static WebElement passWord;
    @FindBy(how = XPATH, using = "//*[@id='submitButton']")
    public static WebElement signInSubmit;
    @FindBy(how =XPATH, using = "//*[@id=\"js-facebook-oauth-login\"]")
    public static WebElement facebook;
    @FindBy(how =XPATH, using = "//*[@id=\"js-google-oauth-login\"]")
    public static WebElement googleAccount;
    @FindBy(how = XPATH, using = "//*[@id=\"app\"]/div[2]/div/header/section[1]/div[4]/button")
    public static WebElement clickLogIn;
    @FindBy(how = XPATH, using = "//*[@id=\"formBox\"]/div/div/div/div/div[4]/div[2]/span")
    public static WebElement readError;

    public void logInPage() throws InterruptedException {
       userName.sendKeys("bigm3152@aol.com");
       passWord.sendKeys("264451154");
       signInSubmit.click();
   }
    public void clickSignIn() {
        clickByXpath("//*[@id=\"gh-ug\"]/a");
    }
    // verifying the we are in sign in page
    public void verifySignIn() {
        boolean expected = true;
        boolean actual = driver.findElement(By.cssSelector("#GREET-HELLO")).isDisplayed();
        Assert.assertEquals(actual, expected);
        System.out.println("WE are in right page");
    }
    public void readError(){
        readError.getText();
   }
   // Click on Log in Link
    public void clickLogIn() {
        clickLogIn.click();
    }
    public void passWord() {
        passWord.sendKeys();
    }
    public void userName(){
        userName.sendKeys();
    }
    public static void setUserName(WebElement userName) {
        LogInPage.userName = userName;
    }
    // verifying the we are in sign in page
    public void verifyLogIn() {
        boolean expected = true;
        boolean actual = driver.findElement(By.cssSelector("#GREET-HELLO")).isDisplayed();
        Assert.assertEquals(actual, expected);
        System.out.println("WE are in right page");
    }
}




