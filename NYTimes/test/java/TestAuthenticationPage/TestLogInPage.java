package TestAuthenticationPage;

import AuthenticationPage.LogInPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLogInPage extends CommonAPI {

    LogInPage logInPage;


    @BeforeMethod
    public void initializationOfElements() {
        logInPage = PageFactory.initElements(driver,LogInPage.class);
    }

    @Test
    public void clickOnLogInIn() {
        clickByXpath("//*[@id=\"app\"]/div[2]/div/header/section[1]/div[4]/button");
    }
    @Test
    public void signIn(String username, String password) {
        clickOnElement("userName");
        typeByXpath("userName", username);
        typeByXpath("passWord", password);
        clickByXpath("logInSubmit");
    }
    @Test(priority = 1, enabled = true)
    public void ClickOnLogIn() {
        logInPage.clickLogIn();
        logInPage.verifyLogIn();
    }
    //TC#2 Sign In to Ebay with valid credentials
    @Test(priority = 2, enabled = true)
    public void SignIn() throws InterruptedException {
        logInPage.clickLogIn();
        signIn("bigm3152@aol.com", "2644561154");
    }
}