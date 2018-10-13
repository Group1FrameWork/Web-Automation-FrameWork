package Home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.*;

import java.io.IOException;

public class TestAmazonhome extends CommonAPI {

    @Test(priority = 1)
    public void testSearchUP() throws InterruptedException {
        amazonhomepage hp = PageFactory.initElements(driver, amazonhomepage.class);
        hp.searchUP("javabooks");
        sleepFor(2);

    }
    @Test (priority = 2)
    public void TestClick() throws InterruptedException {
        amazonTodaysDeal ah = PageFactory.initElements(driver, amazonTodaysDeal.class);
        ah.clickOnTodaysDeal();
        sleepFor(2);
    }
    @Test (priority = 3)
    public void testSearchDropdownBox() throws InterruptedException {
        AmazonSearch homepage = PageFactory.initElements(driver, AmazonSearch.class);
        homepage.clickOnsearchDropdownBox();
    }
    @Test (priority = 4)
    public void testprintSearchDropdownOptions() {
        AmazonSearch homePage = PageFactory.initElements(driver, AmazonSearch.class);
        homePage.printSearchDropdownOptions();
    }

    @Test(priority = 5)
    public void testSearchDropdownBoxWithSelect() throws IOException {
        AmazonSearch homePage = PageFactory.initElements(driver, AmazonSearch.class);
        homePage.selectOnSearchDropdownBox();

    }
    @Test (priority = 6)
    public void testSearchFor() {
        AmazonSearch homepage = PageFactory.initElements(driver, AmazonSearch.class);
        homepage.searchFor("Apps and Games");
    }
    @Test (priority = 7)
    public void testClickOnGiftcard() {
        amazonhomepage homepage = PageFactory.initElements(driver, amazonhomepage.class);
        homepage.ClickonGiftcard();
    }

        @Test(priority = 8)
        public void testClickOnShoppingCart() {
            amazonhomepage amazonHome = PageFactory.initElements(driver, amazonhomepage.class);
            amazonHome.clickOnShoppingCart();
        }
    @Test(priority = 9)
    public void testclickOnAmazonSell(){
        Amazonsell hp = PageFactory.initElements(driver, Amazonsell.class);
        hp.clickOnAmazonSell();
    }

    @Test(priority = 10)
    public void testclickOnorder(){
        AmazonOrder homepage = PageFactory.initElements(driver, AmazonOrder.class);
        homepage.clickOnorder();
    }
    @Test(priority = 11)
    public void testSignInAmazon(){
        AmazonOrder homepage = PageFactory.initElements(driver, AmazonOrder.class);
        homepage.SignInAmazon("ismayati420@gmail.com","kirankitzy");
    }
}
