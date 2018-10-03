package Search;

import PageObjectModel.HomePage;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;

public class HomePageTest extends HomePage {

    HomePage homePage;


    @BeforeMethod
    public void inIt(){
        TestLogger.log(getClass().getSimpleName()+" : "+ CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage = PageFactory.initElements(driver, HomePage.class);

    }
    //TC#1 => User is verifying that he is on the right page
    @Test
    public void verifyEbay() {
        TestLogger.log(getClass().getSimpleName()+" : "+ CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.verifyEbay();
    }
    //TC#2 User can search any thing on the home page
    @Test
    public void searchItems() throws IOException {
        TestLogger.log(getClass().getSimpleName()+" : "+ CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.searchItemsAndSubmitButton();
    }
    //TC#3 Get all the list from  all categories
    @Test
    public void getCategories() {
        TestLogger.log(getClass().getSimpleName()+" : "+ CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       //homePage.mouseHoverByCss();
        homePage.viewMultipleByCSS();
    }
    //TC#4 Testing a new Tab
    @Test
    public void testNewTab(){
        TestLogger.log(getClass().getSimpleName()+" : "+ CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.newTab();
    }
    //TC#5 User can click on antiques from allcategories and go to the antuqes page
    @Test
    public void goToAntiquesPage() throws InterruptedException {
        homePage.goToAntiquesPage();
    }
    //TC#6 User can click on camera & photo from allcategories and go to the Camera & photo page
    @Test
    public void goToCameraPhotoPage() throws InterruptedException {
        homePage.goToCameraPhotoPage();
    }
    //TC#7 User can click on Cell Phone from allcategories and go to the Cell Phone page
        @Test
       public void goToCellPhonePage() throws InterruptedException {
        homePage.goToCellPhonePage();
        }
    //TC#8 User can click on Clothing, Shoes & Accessories from allcategories and go to the Clothing, Shoes & Accessories page
    @Test
    public void goToClothingShoesAccessoriesPage() throws InterruptedException {
        homePage.goToClothingShoesAccessoriesPage();
    }
    //TC#9 User can click on Clothing, Shoes & Accessories from allcategories and go to the Clothing, Shoes & Accessories page
    @Test
    public void goToCoinsPaperMoneyPage() throws InterruptedException {
       goToCoinsPaperMoneyPage();
    }
    //TC#10 User can click on Collectibles from allcategories and go to the Collectibles page
    @Test
    public void goToCollectiblesPage() throws InterruptedException {
        clickOnCss("#gh-cat");
        clickOnCss("#gh-cat > option:nth-child(11)");
        clickOnCss("#gh-btn");
        String Expected = "Collectibles";
        String Actual = driver.findElement(By.cssSelector("#w5 > div.title-banner__layer > div.title-banner__layer__info > h1")).getText();
        System.out.println(Actual);
        Assert.assertEquals(Actual,Expected);
    }
    //TC#10 User can click on Computers, Tablets & More from allcategories and go to the Computers, Tablets & More page
    @Test
    public void goToComputersTabletsMorePage() throws InterruptedException {
        clickOnCss("#gh-cat");
        clickOnCss("#gh-cat > option:nth-child(12)");
        clickOnCss("#gh-btn");
        String Expected = "Computers, Tablets & More";
        String Actual = driver.findElement(By.cssSelector("body > div.pagecontainer.srp-main--isLarge > div.pagecontainer__top > h1 > span")).getText();
        System.out.println(Actual);
        Assert.assertEquals(Actual,Expected);
    }
    //TC#11 User can click on Electronics from allcategories and go to the Electronics page
    @Test
    public void goToElectronicsPage() throws InterruptedException {
        clickOnCss("#gh-cat");
        clickOnCss("#gh-cat > option:nth-child(13)");
        clickOnCss("#gh-btn");
        String Expected = "Electronics";
        String Actual = driver.findElement(By.cssSelector("body > div.pagecontainer.srp-main--isLarge > div.pagecontainer__top > h1 > span")).getText();
        System.out.println(Actual);
        Assert.assertEquals(Actual,Expected);
    }
    //TC#12 User can click on Crafts from allcategories and go to the Art & Craft Supplies page
    @Test
    public void goToArtCraftSuppliesPage() throws InterruptedException {
        clickOnCss("#gh-cat");
        clickOnCss("#gh-cat > option:nth-child(14)");
        clickOnCss("#gh-btn");
        String Expected = "Art & Craft Supplies";
        String Actual = driver.findElement(By.cssSelector("body > div.pagecontainer.srp-main--isLarge > div.pagecontainer__top > h1 > span")).getText();
        System.out.println(Actual);
        Assert.assertEquals(Actual,Expected);
    }
    //TC#13 User can click on Gift Cards & Coupons from allcategories and go to the Gift Cards & Coupons page
    @Test
    public void goToAGiftCardsCouponsPage() throws InterruptedException {
        clickOnCss("#gh-cat");
        clickOnCss("#gh-cat > option:nth-child(19)");
        clickOnCss("#gh-btn");
        String Expected = "Gift Cards & Coupons";
        String Actual = driver.findElement(By.cssSelector("body > div.pagecontainer.srp-main--isLarge > div.pagecontainer__top > h1 > span")).getText();
        System.out.println(Actual);
        Assert.assertEquals(Actual,Expected);
    }
    //TC#14 User can click on Health & Beauty from allcategories and go to the Health & Beauty page
    @Test
    public void goToHealthBeautyPage() throws InterruptedException {
        clickOnCss("#gh-cat");
        clickOnCss("#gh-cat > option:nth-child(20)");
        clickOnCss("#gh-btn");
        String Expected = "Health & Beauty";
        String Actual = driver.findElement(By.cssSelector("body > div.pagecontainer.srp-main--isLarge > div.pagecontainer__top > h1 > span")).getText();
        System.out.println(Actual);
        Assert.assertEquals(Actual,Expected);
    }
    //TC#15 User can click on Home & Garden from allcategories and go to the Home & Garden page
    @Test
    public void goToHomeGardenPage() throws InterruptedException {
        clickOnCss("#gh-cat");
        clickOnCss("#gh-cat > option:nth-child(21)");
        clickOnCss("#gh-btn");
        String Expected = "Home & Garden";
        String Actual = driver.findElement(By.cssSelector("body > div.pagecontainer.srp-main--isLarge > div.pagecontainer__top > h1 > span")).getText();
        System.out.println(Actual);
        Assert.assertEquals(Actual,Expected);
    }
    //TC#16 User can click on Jewelry & Watches from allcategories and go to the Jewelry & Watches page
    @Test
    public void goToJewelryWatchesPage() throws InterruptedException {
        clickOnCss("#gh-cat");
        clickOnCss("#gh-cat > option:nth-child(22)");
        clickOnCss("#gh-btn");
        String Expected = "Jewelry & Watches";
        String Actual = driver.findElement(By.cssSelector("body > div.pagecontainer.srp-main--isLarge > div.pagecontainer__top > h1 > span")).getText();
        System.out.println(Actual);
        Assert.assertEquals(Actual,Expected);
    }
    //TC#17 User can click on Music from allcategories and go to the Recorded Music page
    @Test
    public void goToRecordedMusicPage() throws InterruptedException {
        clickOnCss("#gh-cat");
        clickOnCss("#gh-cat > option:nth-child(23)");
        clickOnCss("#gh-btn");
        String Expected = "Recorded Music";
        String Actual = driver.findElement(By.cssSelector("#w5 > div.title-banner__layer > div.title-banner__layer__info > h1")).getText();
        System.out.println(Actual);
        Assert.assertEquals(Actual,Expected);
    }
    //TC#18 User can click on Real Estate from allcategories and go to the Real Estate page
    @Test
    public void goToRealEstatePage() throws InterruptedException {
        clickOnCss("#gh-cat");
        clickOnCss("#gh-cat > option:nth-child(27)");
        clickOnCss("#gh-btn");
        String Expected = "Real Estate";
        String Actual = driver.findElement(By.cssSelector("body > div.pagecontainer.srp-main--isLarge > div.pagecontainer__top > h1 > span")).getText();
        System.out.println(Actual);
        Assert.assertEquals(Actual,Expected);
    }
    //TC#19 User can click on Sporting Goods from allcategories and go to the Sporting Goods page
    @Test
    public void goToSportingGoodsPage() throws InterruptedException {
        clickOnCss("#gh-cat");
        clickOnCss("#gh-cat > option:nth-child(29)");
        clickOnCss("#gh-btn");
        String Expected = "Sporting Goods";
        String Actual = driver.findElement(By.cssSelector("body > div.pagecontainer.srp-main--isLarge > div.pagecontainer__top > h1 > span")).getText();
        System.out.println(Actual);
        Assert.assertEquals(Actual,Expected);
    }
    //TC#20 User can click on Travel from allcategories and go to the Travel page
    @Test
    public void goToTravelPage() throws InterruptedException {
        clickOnCss("#gh-cat");
        clickOnCss("#gh-cat > option:nth-child(34)");
        clickOnCss("#gh-btn");
        String Expected = "Travel";
        String Actual = driver.findElement(By.cssSelector("body > div.pagecontainer.srp-main--isLarge > div.pagecontainer__top > h1 > span")).getText();
        System.out.println(Actual);
        Assert.assertEquals(Actual,Expected);
    }
}