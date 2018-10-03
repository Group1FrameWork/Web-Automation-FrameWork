package PageObjectModel;


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
    CommonAPI commonAPI = PageFactory.initElements(driver, CommonAPI.class);

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
        List<WebElement> menu = getListOfWebElementsByCss("#gh-cat");

        List<String> list = new ArrayList<>();
        for (WebElement search : menu) {
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
        String Actual = getText("#w5 > div.title-banner__layer > div.title-banner__layer__info > h1");
        System.out.println(Actual);
        Assert.assertEquals(Actual,Expected);
    }
    public void goToCameraPhotoPage() throws InterruptedException {
        clickOnCss("#gh-cat");
        clickOnCss("#gh-cat > option:nth-child(7)");
        clickOnElement("#gh-btn");
        String Expected = "Cameras & Photo";
        String Actual = driver.findElement(By.cssSelector("body > div.pagecontainer.srp-main--isLarge > div.pagecontainer__top > h1 > span")).getText();
        System.out.println(Actual);
        Assert.assertEquals(Actual, Expected);
    }
    public void goToCellPhonePage() throws InterruptedException {
        clickOnCss("#gh-cat");
        clickOnCss("#gh-cat > option:nth-child(8)");
        clickOnCss("#gh-btn");
        String Expected = "Cell Phones, Smart Watches & Accessories";
        String Actual = driver.findElement(By.cssSelector("#w5 > div.title-banner__layer > div.title-banner__layer__info > h1")).getText();
        System.out.println(Actual);
        Assert.assertEquals(Actual,Expected);
    }
    public void goToClothingShoesAccessoriesPage() throws InterruptedException {
        clickOnCss("#gh-cat");
        clickOnCss("#gh-cat > option:nth-child(9)");
        clickOnCss("#gh-btn");
        String Expected = "Clothing, Shoes & Accessories";
        String Actual = driver.findElement(By.cssSelector("body > div.pagecontainer.srp-main--isLarge > div.pagecontainer__top > h1 > span")).getText();
        System.out.println(Actual);
        Assert.assertEquals(Actual,Expected);
    }
    public void goToCoinsPaperMoneyPage() throws InterruptedException {
        clickOnCss("#gh-cat");
        clickOnCss("#gh-cat > option:nth-child(10)");
        clickOnCss("#gh-btn");
        String Expected = "Coins & Paper Money";
        String Actual = driver.findElement(By.cssSelector("body > div.pagecontainer.srp-main--isLarge > div.pagecontainer__top > h1 > span")).getText();
        System.out.println(Actual);
        Assert.assertEquals(Actual,Expected);
    }

}

