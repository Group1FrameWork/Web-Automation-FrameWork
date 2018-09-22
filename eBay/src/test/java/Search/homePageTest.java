package Search;

import Main.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class homePageTest extends HomePage {

    //TC#1 => User is verifying that he is on the right page
    @Test
    public void verifyEbay() {
        boolean expected = true;
        boolean actual = driver.findElement((By.cssSelector("#gh-logo"))).isDisplayed();
        System.out.println(actual);

        Assert.assertEquals(actual, expected);
    }

    //TC#2 User can search any thing on the home page
    @Test
    public void searchItems() throws IOException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.searchItemsAndSubmitButton();

    }

    //TC#3 Get all the list from  all categories
    @Test
    public void getCategories() {
        mouseHoverByCSS("#gh-cat");
        viewMultipleByCSS();
    }

    //TC#4 Testing a new Tab
    @Test
    public void testNewTab(){
        newTab();
    }
    //TC#5 User can click on antiques from allcategories and go to the antuqes page
    @Test
    public void goToAntiquesPage(){
        clickOnCss("#gh-cat");
        mouseHoverByCSS("#gh-cat > option:nth-child(2)");
        clickOnCss("#gh-cat > option:nth-child(2)");
        clickOnElement("#gh-btn");
        String Expected = "Antiques";
        String Actual = driver.findElement(By.cssSelector("#w5 > div.title-banner__layer > div.title-banner__layer__info > h1")).getText();
        System.out.println(Actual);
        Assert.assertEquals(Actual,Expected);
    }
    //TC#6 User can click on camera & photo from allcategories and go to the Camera & photo page
    @Test
    public void goToCameraPhotoPage(){
        clickOnCss("#gh-cat");

        clickOnCss("#gh-cat > option:nth-child(7)");
        clickOnElement("#gh-btn");
        String Expected = "Cameras & Photo";
        String Actual = driver.findElement(By.cssSelector("body > div.pagecontainer.srp-main--isLarge > div.pagecontainer__top > h1 > span")).getText();
        System.out.println(Actual);
        Assert.assertEquals(Actual,Expected);
    }
    //TC#7 User can click on Cell Phone from allcategories and go to the Cell Phone page
        @Test
       public void goToCellPhonePage(){
           clickOnCss("#gh-cat");
           clickOnCss("#gh-cat > option:nth-child(8)");
           clickOnCss("#gh-btn");
           String Expected = "Cell Phones, Smart Watches & Accessories";
            String Actual = driver.findElement(By.cssSelector("#w5 > div.title-banner__layer > div.title-banner__layer__info > h1")).getText();
           System.out.println(Actual);
            Assert.assertEquals(Actual,Expected);
        }
    //TC#8 User can click on Clothing, Shoes & Accessories from allcategories and go to the Clothing, Shoes & Accessories page
    @Test
    public void goToClothingShoesAccessoriesPage(){
        clickOnCss("#gh-cat");
        clickOnCss("#gh-cat > option:nth-child(9)");
        clickOnCss("#gh-btn");
        String Expected = "Clothing, Shoes & Accessories";
        String Actual = driver.findElement(By.cssSelector("body > div.pagecontainer.srp-main--isLarge > div.pagecontainer__top > h1 > span")).getText();
        System.out.println(Actual);
        Assert.assertEquals(Actual,Expected);
    }
    //TC#9 User can click on Clothing, Shoes & Accessories from allcategories and go to the Clothing, Shoes & Accessories page
    @Test
    public void goToCoinsPaperMoneyPage(){
        clickOnCss("#gh-cat");
        clickOnCss("#gh-cat > option:nth-child(10)");
        clickOnCss("#gh-btn");
        String Expected = "Coins & Paper Money";
        String Actual = driver.findElement(By.cssSelector("body > div.pagecontainer.srp-main--isLarge > div.pagecontainer__top > h1 > span")).getText();
        System.out.println(Actual);
        Assert.assertEquals(Actual,Expected);
    }
    //TC#10 User can click on Collectibles from allcategories and go to the Collectibles page
    @Test
    public void goToCollectiblesPage(){
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
    public void goToComputersTabletsMorePage(){
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
    public void goToElectronicsPage(){
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
    public void goToArtCraftSuppliesPage(){
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
    public void goToAGiftCardsCouponsPage(){
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
    public void goToHealthBeautyPage(){
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
    public void goToHomeGardenPage(){
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
    public void goToJewelryWatchesPage(){
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
    public void goToRecordedMusicPage(){
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
    public void goToRealEstatePage(){
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
    public void goToSportingGoodsPage(){
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
    public void goToTravelPage(){
        clickOnCss("#gh-cat");
        clickOnCss("#gh-cat > option:nth-child(34)");
        clickOnCss("#gh-btn");
        String Expected = "Travel";
        String Actual = driver.findElement(By.cssSelector("body > div.pagecontainer.srp-main--isLarge > div.pagecontainer__top > h1 > span")).getText();
        System.out.println(Actual);
        Assert.assertEquals(Actual,Expected);
    }
}