
package testProductsPageObjects;

import HomePageObjects.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import productsPageObjects.ProductsPage;

public class TestProductPage extends ProductsPage {
    HomePage homePage;
    ProductsPage productsPage;
    @BeforeTest
    @Test(priority = 1,enabled = true)
    public void initializationOfElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        productsPage = PageFactory.initElements(driver, ProductsPage.class);
    }
     //// T3ALI_PP_TC01 Select tols and filter search
    @Test(priority = 2, enabled =false)
    public void testCategories() throws InterruptedException {
        homePage.rxrefills();
        ProductsPage productsPage = PageFactory.initElements(driver, ProductsPage.class);
        productsPage.Medinesearch();
    }
}



