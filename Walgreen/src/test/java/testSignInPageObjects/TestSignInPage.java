package testSignInPageObjects;
import HomePageObjects.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import productsPageObjects.ProductsPage;
import reporting.TestLogger;
import signInPageObjects.SignInPage;


public class TestSignInPage extends SignInPage {
    HomePage homePage;
    SignInPage signInPage;
    ProductsPage productsPage;

    @BeforeMethod
    public void initializationOfElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        signInPage = PageFactory.initElements(driver, SignInPage.class);
        productsPage = PageFactory.initElements(driver, ProductsPage.class);
    }
    // WAL_Sign in with invalid id and invalid password
    @Test(priority = 1, enabled = true)
    public void signInWithInvalidIdTest() throws InterruptedException {
        homePage.clikSignIn();
        signInPage.switchToSignInForm();
        String actual = signInPage.signIn();
        System.out.println("Actual  Message: " + actual);
        String expected = "Your account name or password is incorrect.";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(actual.contains(expected));
        System.out.println("Test Case signInWithInvalidIdTest Passed");
        // TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    }

}

