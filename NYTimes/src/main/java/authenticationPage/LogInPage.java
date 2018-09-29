package authenticationPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.How.XPATH;

public class LogInPage extends CommonAPI {
    @FindBy(how = XPATH, using = "//*[@id=\"username\"]")

    public static WebElement username;
    @FindBy(how = XPATH, using = "//*[@id=\"password\"]" )
    public static WebElement password;
    @FindBy(how = XPATH, using = "//*[@id='submitButton']")
                                    //*[@id="submitButton"]
    public static WebElement signInSubmit;
    @FindBy(how =XPATH, using = "//*[@id=\"js-facebook-oauth-login\"]")
    public static WebElement facebook;
    @FindBy(how =XPATH, using = "//*[@id=\"js-google-oauth-login\"]")
    public static WebElement googleAccount;

    public void logInPage() throws InterruptedException {
       username.sendKeys("bigm3152@aol.com");
       password.sendKeys("264451154");
       signInSubmit.click();
   }
}


