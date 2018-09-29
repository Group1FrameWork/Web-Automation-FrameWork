package TestAuthenticationPage;

import authenticationPage.LogInPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLogInPage extends LogInPage {
    LogInPage logInPage;

    @BeforeMethod

    @Test public  void clickSignIn() {
        clickByXpath("//*[@id=\"app\"]/div[2]/div/header/section[1]/div[4]/button");
    }
    @Test public void signIn(String username,String password){
        clickOnElement("username");
        typeByXpath("username",username);
        typeByXpath("password",password);
        clickByXpath("signInSubmit");

    }
}
