package testOpenNewAccount;

import openNewAccount.NewAccount;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import savingPage.Saving;

public class testNewAccount extends NewAccount {
   NewAccount objofNewAccount;
    @BeforeMethod
    public void clickNewAccount(){
        objofNewAccount= PageFactory.initElements(driver,NewAccount.class);
    }
    @Test
    public void openAccount(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        newAccount();}
}
