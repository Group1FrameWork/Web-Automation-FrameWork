package testSignInPageObjects;

import HomePageObjects.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import signInPageObjects.ByInputFromExls;
import signInPageObjects.SignInPage;

import java.io.IOException;

public class TestByInputFromExls extends ByInputFromExls {
    HomePage homePage;
    SignInPage signInPage;
    ByInputFromExls byInput;

    @BeforeMethod
    public void initialization(){
        homePage = PageFactory.initElements(driver, HomePage.class);
        byInput = PageFactory.initElements(driver, ByInputFromExls.class);
        signInPage = PageFactory.initElements(driver, SignInPage.class);
    }
    //TWAL-4_LogIn by using excel sheet data
    @Test
    public void signInWithInvalidIdAndPassword() throws IOException, InterruptedException {
        // TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sleepFor(3);
        homePage.clikSignIn();
        sleepFor(3);
        signInPage.switchToSignInForm();
         sleepFor(3);
        String[] expectedItems = byInput.getAssertData("DataFile2.xls");
        String[] actualItems = byInput.getVerificationValue("DataFile2.xls");
        for (int i = 0; i < actualItems.length; i++) {
           Assert.assertTrue(actualItems[i].contains(expectedItems[i]));
            System.out.println(expectedItems[i] + ": Test - Passed");
        }
        System.out.println("signInWithInvalidIdAndPassword");
        //implicitWait(driver, 20);
    }
}


