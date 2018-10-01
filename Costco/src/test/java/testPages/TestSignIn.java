package testPages;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.pages.SignInOrRegister;
import java.util.ArrayList;
import java.util.List;

public class TestSignIn extends SignInOrRegister {
    SignInOrRegister signInOrRegister;
    @BeforeMethod
    public void initializationOfElement() {
        TestLogger.log(getClass().getSimpleName()+": "+converToString((new Object(){}.getClass().getEnclosingMethod().getName())));
        signInOrRegister = PageFactory.initElements(driver, SignInOrRegister.class);
    }
    @Test
    public void openSignInBar(){
        signInOrRegister.openingSignInPage();
    }
    @Test
    public void testStatusOfSignInButton(){
        signInButtonEnableStatus();
    }
    @Test
    public void testStatusOfCheckBox(){
        checkBoxSelectStatus();
        isSelectedStatus(CheckBox);
    }
    @Test
    public void testSizeOfSignIn(){
        signInOrRegister.sizeOfSignIn();
        //screenShotCapture(driver, "1");
    }
    @Test
    public void testSignInHardCoded() throws InterruptedException {
        List<String> ActualList=signInOrRegister.signUpHardCoded("abcd@","");
        List<String>ExpectedList=new ArrayList<String>();
        ExpectedList.add("Enter a valid email address");
        ExpectedList.add("Please enter a password.");
        System.out.println(ExpectedList);
        Assert.assertEquals(ActualList,ExpectedList);
    }
    @Test
    public void testSignInIvalidEmailNPass() throws InterruptedException {
        String actual=signInOrRegister.invalidPass("abcd@gmail.com","abcd");
        String ecpected="Your account is locked. This is either due to a rejected registration request or due to 4 unsuccessful password attempts, you will be unable to Log on. To reset your forgotten password, enter your email address in below Forget Password section. Instructions to create a new password will be sent to the email address on your account.";
        Assert.assertTrue(actual.contains(ecpected));
    }
}
