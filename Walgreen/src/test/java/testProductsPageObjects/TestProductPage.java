
package testProductsPageObjects;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import productsPageObjects.ProductsPage;
import HomePageObjects.HomePage;

public class TestProductPage extends ProductsPage {
    HomePage homePage;
    ProductsPage productsPage;
    @BeforeTest
    @Test(priority = 1,enabled = true)
    public void initializationOfElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        productsPage = PageFactory.initElements(driver, ProductsPage.class);
    }
     //filter search
    @Test(priority = 2, enabled =false)
    public void testCategories() throws InterruptedException {
        homePage.rxrefills();
        ProductsPage productsPage = PageFactory.initElements(driver, ProductsPage.class);
        productsPage.Medinesearch();
    }
}



