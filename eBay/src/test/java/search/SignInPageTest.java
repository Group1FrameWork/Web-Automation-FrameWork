package search;

import pageObjectModel.SignInPage;
import org.testng.annotations.Test;

public class SignInPageTest extends SignInPage {
    //TC#1 Clicking on signin link and Verify that we are in sign in page

    @Test(priority = 1,enabled = true)
    public void ClickOnSignIn(){
        clickSignIn();
        verifySignIn();
    }
    //TC#2 Sign In to Ebay with valid credentials
    @Test(priority = 2,enabled = true)
    public void SignIn() throws InterruptedException {
        clickSignIn();
        signIn("roysubhraroy88@gmail.com","Tanu01011988");
    }
    //TC#3 Sign In with In valid Email and invalid password
    @Test(priority = 3,enabled = true)
    public void SignInWithInvalidEmail() throws InterruptedException {
        clickSignIn();
        invalidEmailUse("SFggyfcjgu@yamail.com","Asdvaed234");
    }
    //TC#4 Sign In with valid Email and invalid password
    @Test(priority = 4,enabled = true)
    public void ValidEmailAndInvalidPasswordUse() throws InterruptedException {
        clickSignIn();
        signIn("roysubhraroy88@gmail.com","Tade12345");
    }
    //TC#5 Sign In with no Email and valid password
    @Test(priority = 5,enabled = true)
    public void NoEmailAndValidPasswordUse() throws InterruptedException {
        clickSignIn();
        noEmailAndValidPasswordUse("","abdcer34251");
    }
    //TC#6 Sign in with no email And No password
    @Test(priority = 6,enabled = true)
    public void NoEmailNoPasswordUse() throws InterruptedException {
        clickSignIn();
        noEmailNoPasswordUse("","");
    }
}
