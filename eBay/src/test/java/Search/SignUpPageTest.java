package Search;

import MainPage.SignUpPage;
import org.testng.annotations.Test;

public class SignUpPageTest extends SignUpPage {

    // TC => User can Sign up
    @Test
    public void signUpForeBay() {
        createAnAccount();
    }
}
