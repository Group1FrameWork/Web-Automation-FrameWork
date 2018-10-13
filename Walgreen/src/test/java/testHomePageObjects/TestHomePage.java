package testHomePageObjects;

import HomePageObjects.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import productsPageObjects.ProductsPage;
import signInPageObjects.SignInPage;

public class TestHomePage extends HomePage {

    HomePage homePage;
    SignInPage signInPage;
    ProductsPage productsPage;

    @BeforeMethod
    public void initializationOfElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        signInPage = PageFactory.initElements(driver, SignInPage.class);
        productsPage = PageFactory.initElements(driver, ProductsPage.class);

    }
    // T1-WAL Home Page
    @Test(priority = 1, enabled = true)
        public void testgetPage() {
            homePage.getPage();
        }

    //T2-WAL Search Options
    @Test(priority = 2, enabled = true)
    public void testsearchplaces() {
        homePage.searchplaces();
    }
    //T3-WAL Seach A Product
    @Test(priority = 3,enabled = true)
    public void testsearchproduct(){
        homePage.searchproduct();
    }
    //T4-WAL
    @Test(priority = 4,enabled = true)
    public void testmousehover() throws InterruptedException {
        homePage.mouesehover();
    }
}