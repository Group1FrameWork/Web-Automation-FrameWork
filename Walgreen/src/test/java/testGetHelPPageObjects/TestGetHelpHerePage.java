
package testGetHelPPageObjects;

import HomePageObjects.HomePage;
import getHelpPageObjects.GetHelpHerePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import productsPageObjects.ProductsPage;
import signInPageObjects.SignInPage;

public class TestGetHelpHerePage extends GetHelpHerePage {
    HomePage homePage;
    SignInPage signInPage;
    ProductsPage productsPage;
    GetHelpHerePage getHelpHerePage;

    @BeforeMethod
    public void initializationOfElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        signInPage = PageFactory.initElements(driver, SignInPage.class);
        getHelpHerePage = PageFactory.initElements(driver, GetHelpHerePage.class);
    }

    //Verify User able to send message
    @Test(enabled = false)
    public void messageToAnna() {
        try {
            homePage.clikSignIn();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        signInPage.getCodehere();
        switchWindow(driver);
        getHelpHerePage.sendTextToAnna();
    }
}

