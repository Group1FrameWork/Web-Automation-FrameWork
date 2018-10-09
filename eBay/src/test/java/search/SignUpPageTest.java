package search;

import pageObjectModel.SignUpPage;
import org.testng.annotations.Test;

public class SignUpPageTest extends SignUpPage {

    // TC#1  => User can Sign up
    @Test
    public void signUpForeBay() throws InterruptedException {
        createAnAccount();
    }
}
