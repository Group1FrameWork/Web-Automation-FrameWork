package Main;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class SignInPage extends CommonAPI {


    //public static String userName = "";
    //public static String passWord = "";
// Click on Sign in Link
    public  void clickSignIn(){
        clickByXpath("//*[@id=\"gh-ug\"]/a");
    }

    // verifying the we are in sign in page
    public  void verifySignIn(){
        boolean expected = true;
        boolean actual = driver.findElement(By.cssSelector("#GREET-HELLO")).isDisplayed();
       Assert.assertEquals(actual,expected);
        System.out.println("WE are in right page");

    }

    //Positive testing

    //Signin with valid credential
    public void signIn(String userName,String passWord){
        clickOnCss("#userid");
        typeByCss("#userid",userName);
        typeByCss("#pass",passWord);
        clickOnCss("#sgnBt");
    }

    // Negative Testing
    // Sign In with In valid Email and invalid password
    public void invalidEmailUse(String userName,String passWord){
        clickOnCss("#userid");
        typeByCss("#userid",userName);
        typeByCss("#pass",passWord);
        clickOnCss("#sgnBt");
    }

    //Sign In with valid Email and invalid password
    public void validEmailAndInvalidPasswordUse(String userName,String passWord){
        clickOnCss("#userid");
        typeByCss("#userid",userName);
        typeByCss("#pass",passWord);
        clickOnCss("#sgnBt");
    }
    //Sign In with no Email and valid password
    public void noEmailAndValidPasswordUse(String userName,String passWord){
        clickOnCss("#pass");
        typeByCss("#pass",passWord);
        clickOnCss("#sgnBt");
    }

    //Sign in with no email And No password
    public void noEmailNoPasswordUse(String userName,String passWord){
        clickOnCss("#userid");
        clickOnCss("#pass");
        clickOnCss("#sgnBt");
    }

}
