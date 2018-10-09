package pageObjectModel;


import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import reporting.TestLogger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HomePage extends CommonAPI {
    CommonAPI commonAPI = PageFactory.initElements(CommonAPI.driver, CommonAPI.class);

    @FindBy(how = How.CSS, using = "#gh-ac")
    public static WebElement searchInputWebElement;

    @FindBy(how = How.CSS, using = "#gh-btn")
    public static WebElement submitButtonWebElement;

    @FindBy(how = How.CSS, using = "#gh-logo")
    public static WebElement eBayLogo;

    @FindBy(how = How.CSS, using = "#gh-cat")
    public static WebElement categories;

    @FindBy(how = How.CSS, using = "#gh-cat > option:nth-child(2)")
    public static WebElement antiques;




    public WebElement getSearchInputWebElement() {
        TestLogger.log(getClass().getSimpleName()+":"+ CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return searchInputWebElement;
    }

    public WebElement getSubmitButtonWebElement() {
        TestLogger.log(getClass().getSimpleName()+":" + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return submitButtonWebElement;
    }

    public void serachFor(String value) {
        TestLogger.log(getClass().getSimpleName()+":" + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSearchInputWebElement().sendKeys(value);
    }

    public void submitSearchButton() {
        TestLogger.log(getClass().getSimpleName()+":" + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSubmitButtonWebElement().click();
    }

    public void viewMultipleByCSS() {
        System.out.println(driver);
        List<String> list = new ArrayList<>();
        List<WebElement> menu = getListOfWebElementsByCss("#gh-cat");
        for (WebElement search : menu) {
            System.out.println(search.getText());
            list.add(search.getText());
        }
    }

    public void clearInput() {
        TestLogger.log(getClass().getSimpleName()+":" + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSearchInputWebElement().clear();
    }
    public void verifyEbay() {
        boolean expected = true;
        boolean actual = eBayLogo.isDisplayed();
        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }

    public List<String> getMenuData() {
        List<String> data = new ArrayList<>();
        data.add("Note 8");
        data.add("Pen");
        data.add("Watch");
        return data;
    }

    //handeling new tab
    public void newTab() {
        String newTabTest = Keys.chord(Keys.COMMAND, Keys.RETURN);
        driver.findElement(By.cssSelector("#mainContent > div.hl-cat-nav > ul > li:nth-child(9) > a")).sendKeys(newTabTest);
        switchTabs(0, 1);
    }

    public void searchItemsAndSubmitButton() throws IOException {
        TestLogger.log(getClass().getSimpleName()+":" + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> list = getItemValue();
        for (int i = 0; i < list.size(); i++) {
            serachFor(list.get(i));
            submitSearchButton();
            clearInput();
        }
    }
    public void clickSignIn() throws Exception {
        try {
            clickOnCss("#gh-ug > a");
        } catch (Exception e) {
            clickByXpath("//*[@id=\"gh-ug\"]/a");
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public WebElement getSearchInputField() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return searchInputWebElement;
    }

    public void setSearchInputField(WebElement searchInputField) {
         TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        this.searchInputWebElement = searchInputField;
    }

    public void searchItems() throws InterruptedException, IOException {
        List<String> itemList = getItemValue();
        for (String st : itemList) {
            getSearchInputField().sendKeys(st, Keys.ENTER);
            getSearchInputField().clear();
        }
    }

    public List<String> getItemValue() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Pen");
        itemsList.add("Selenium Book");
        itemsList.add("Laptop");
        itemsList.add("Honey");
        itemsList.add("Toothpaste");
        itemsList.add("ear-ring");
        itemsList.add("ps4games");
        itemsList.add("macAir");
        return itemsList;
    }
    public void getCategories() throws InterruptedException {
        categories.click();
        WebElement menu = driver.findElement(By.xpath("//*[@id=\"gh-cat\"]/option[34]"));
        System.out.println(menu.getText());
    }
    public void mouseHoverByCss(){
        mouseHoverByCSS("#gh-ac");
    }
    public void goToAntiquesPage() throws InterruptedException {
        click(categories);
        click(antiques);
        click(submitButtonWebElement);
        String Expected = "Antiques";
        String Actual = driver.findElement(By.cssSelector("#w5 > div.title-banner__layer > div.title-banner__layer__info > h1")).getText();
        System.out.println(Actual);
        Assert.assertEquals(Actual,Expected);
    }
    public void goToCameraPhotoPage() throws InterruptedException {
       click(categories);
       clickOnCss("#gh-cat > option:nth-child(7)");
       click(submitButtonWebElement);
       String Expected = "Cameras & Photo";
       String Actual = driver.findElement(By.xpath("/html/body/div[3]/div[2]/h1/span")).getText();
        System.out.println(Actual);
        Assert.assertEquals(Actual, Expected);
    }
    public void goToCellPhonePage() throws InterruptedException {
        click(categories);
        clickOnCss("#gh-cat > option:nth-child(8)");
        click(submitButtonWebElement);
        String Expected = "Cell Phones, Smart Watches & Accessories";
        String Actual = driver.findElement(By.xpath("//*[@id=\"w5\"]/div[1]/div[2]/h1")).getText();
        System.out.println(Actual);
        Assert.assertEquals(Actual,Expected);
    }
    public void goToClothingShoesAccessoriesPage() throws InterruptedException {
        click(categories);
        clickOnCss("#gh-cat > option:nth-child(9)");
        click(submitButtonWebElement);
        String Expected = "Clothing, Shoes & Accessories";
        String Actual = driver.findElement(By.xpath("/html/body/div[3]/div[2]/h1/span")).getText();
        System.out.println(Actual);
        Assert.assertEquals(Actual,Expected);
    }
    public void goToCoinsPaperMoneyPage() throws InterruptedException {
        click(categories);
        clickOnCss("#gh-cat > option:nth-child(10)");
        click(submitButtonWebElement);
        String Expected = "Coins & Paper Money";
        String Actual = driver.findElement(By.xpath("/html/body/div[3]/div[2]/h1/span")).getText();
        System.out.println(Actual);
        Assert.assertEquals(Actual,Expected);
    }
    public void goToCollectiblesPage() throws InterruptedException {
        click(categories);
        clickOnCss("#gh-cat > option:nth-child(11)");
        click(submitButtonWebElement);
        String Expected = "Collectibles";
        String Actual = driver.findElement(By.xpath("//*[@id=\"w5\"]/div[1]/div[2]/h1")).getText();
        System.out.println(Actual);
        Assert.assertEquals(Actual, Expected);
    }
    public void goToComputersTabletsMorePage() throws InterruptedException {
        click(categories);
        clickOnCss("#gh-cat > option:nth-child(12)");
        click(submitButtonWebElement);
        String Expected = "Computers, Tablets & More";
        String Actual = driver.findElement(By.xpath("/html/body/div[3]/div[2]/h1/span")).getText();
        Assert.assertEquals(Actual, Expected);
    }
    public void goToElectronicsPage() throws InterruptedException {
        click(categories);
        clickOnCss("#gh-cat > option:nth-child(13)");
        click(submitButtonWebElement);
        String Expected = "Electronics";
        String Actual = driver.findElement(By.xpath("/html/body/div[3]/div[2]/h1/span")).getText();
        System.out.println(Actual);
        Assert.assertEquals(Actual, Expected);
    }
    public void goToArtCraftSuppliesPage() throws InterruptedException {
        click(categories);
        clickOnCss("#gh-cat > option:nth-child(14)");
        click(submitButtonWebElement);
        String Expected = "Art & Craft Supplies";
        String Actual = driver.findElement(By.xpath("/html/body/div[3]/div[2]/h1/span")).getText();
        System.out.println(Actual);
        Assert.assertEquals(Actual, Expected);
    }
    public void goToAGiftCardsCouponsPage() throws InterruptedException {
        click(categories);
        clickOnCss("#gh-cat > option:nth-child(19)");
        click(submitButtonWebElement);
        String Expected = "Gift Cards & Coupons";
        String Actual = driver.findElement(By.xpath("/html/body/div[3]/div[2]/h1/span")).getText();
        System.out.println(Actual);
        Assert.assertEquals(Actual, Expected);
    }
    public void goToHealthBeautyPage() throws InterruptedException {
        click(categories);
        clickOnCss("#gh-cat > option:nth-child(20)");
        click(submitButtonWebElement);
        String Expected = "Health & Beauty";
        String Actual = driver.findElement(By.xpath("/html/body/div[3]/div[2]/h1/span")).getText();
        System.out.println(Actual);
        Assert.assertEquals(Actual, Expected);
    }
    public void goToHomeGardenPage() throws InterruptedException {
        click(categories);
        clickOnCss("#gh-cat > option:nth-child(21)");
        click(submitButtonWebElement);
        String Expected = "Home & Garden";
        String Actual = driver.findElement(By.xpath("/html/body/div[3]/div[2]/h1/span")).getText();
        System.out.println(Actual);
        Assert.assertEquals(Actual, Expected);
    }
    public void goToJewelryWatchesPage() throws InterruptedException {
        click(categories);
        clickOnCss("#gh-cat > option:nth-child(22)");
        click(submitButtonWebElement);
        String Expected = "Jewelry & Watches";
        String Actual = driver.findElement(By.xpath("/html/body/div[3]/div[2]/h1/span")).getText();
        System.out.println(Actual);
        Assert.assertEquals(Actual, Expected);
    }
    public void goToRecordedMusicPage() throws InterruptedException {
        click(categories);
        clickOnCss("#gh-cat > option:nth-child(23)");
        click(submitButtonWebElement);
        String Expected = "Recorded Music";
        String Actual = driver.findElement(By.xpath("//*[@id=\"w5\"]/div[1]/div[2]/h1")).getText();
        System.out.println(Actual);
        Assert.assertEquals(Actual, Expected);
    }
    public void goToRealEstatePage() throws InterruptedException {
        click(categories);
        clickOnCss("#gh-cat > option:nth-child(27)");
        click(submitButtonWebElement);
        String Expected = "Real Estate";
        String Actual = driver.findElement(By.xpath("/html/body/div[3]/div[2]/h1/span")).getText();
        System.out.println(Actual);
        Assert.assertEquals(Actual, Expected);
    }
    public void goToSportingGoodsPage() throws InterruptedException {
        click(categories);
        clickOnCss("#gh-cat > option:nth-child(29)");
        click(submitButtonWebElement);
        String Expected = "Sporting Goods";
        String Actual = driver.findElement(By.xpath("/html/body/div[3]/div[2]/h1/span")).getText();
        System.out.println(Actual);
        Assert.assertEquals(Actual, Expected);
    }
    public void goToTravelPage() throws InterruptedException {
        click(categories);
        clickOnCss("#gh-cat > option:nth-child(34)");
        click(submitButtonWebElement);
        String Expected = "Travel";
        String Actual = driver.findElement(By.xpath("/html/body/div[3]/div[2]/h1/span")).getText();
        System.out.println(Actual);
        Assert.assertEquals(Actual, Expected);
    }
}

