package Search;

import Main.SignUpPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SignUpPageTest extends SignUpPage {

    // TC#1  => User can Sign up
    @Test
    public void signUpForeBay() {
        createAnAccount();
    }
}
