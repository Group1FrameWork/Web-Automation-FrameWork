package Search;

import Main.SignInPage;
import org.testng.annotations.Test;

public class SignInPageTest extends SignInPage {


    //Clicking on signin link and Verify that we are in sign in page

    @Test(priority = 1,enabled = true)
    public void ClickOnSignIn(){
        clickSignIn();
        verifySignIn();
    }

    //Sign In to Ebay with valid credentials
    @Test(priority = 2,enabled = true)
    public void SignIn(){
        clickSignIn();
        signIn("roysubhraroy88@gmail.com","Tanu01011988");
    }
    //Sign In with In valid Email and invalid password
    @Test(priority = 3,enabled = true)
    public void SignInWithInvalidEmail(){
        clickSignIn();
        invalidEmailUse("SFggyfcjgu@yamail.com","Asdvaed234");
    }
    //Sign In with valid Email and invalid password
    @Test(priority = 4,enabled = true)
    public void ValidEmailAndInvalidPasswordUse(){
        clickSignIn();
        signIn("roysubhraroy88@gmail.com","Tade12345");
    }
    //Sign In with no Email and valid password
    @Test(priority = 5,enabled = true)
    public void NoEmailAndValidPasswordUse(){
        clickSignIn();
        noEmailAndValidPasswordUse("","abdcer34251");
    }
    //Sign in with no email And No password
    @Test(priority = 6,enabled = true)
    public void NoEmailNoPasswordUse(){
        clickSignIn();
        noEmailNoPasswordUse("","");
    }


}
