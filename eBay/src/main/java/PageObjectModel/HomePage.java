package PageObjectModel;


import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HomePage extends CommonAPI {
    @FindBy(how = How.CSS, using = "#gh-ac")
    public static WebElement searchInputWebElement;

    @FindBy(how = How.CSS, using = "#gh-btn")
    public  static WebElement submitButtonWebElement;

    public WebElement getSearchInputWebElement(){
     // TestLogger.log(getClass().getSimpleName()+":"+ CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    return searchInputWebElement;
    }
    public WebElement getSubmitButtonWebElement(){
        //TestLogger.log(getClass().getSimpleName()+":" + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    return submitButtonWebElement;
    }
    public void serachFor(String value){
        //TestLogger.log(getClass().getSimpleName()+":" + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    getSearchInputWebElement().sendKeys(value);
    }
    public void submitSearchButton(){
      // TestLogger.log(getClass().getSimpleName()+":" + ommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    getSubmitButtonWebElement().click();
    }
    public void viewMultipleByCSS() {
        List<WebElement> menu = getListOfWebElementsByCss("[aria-label='Select a category for search']");
        for (WebElement search : menu) {
            System.out.println(search.getText());
        }
    }
    public void clearInput(){
       // TestLogger.log(getClass().getSimpleName()+":" + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    getSearchInputWebElement().clear();
    }
    public List<String> getMenuData(){
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
    public void searchItemsAndSubmitButton() throws IOException{
        //TestLogger.log(getClass().getSimpleName()+":" + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> list = getItemValue();
        for (int i =0; i<list.size(); i++){
            serachFor(list.get(i));
            submitSearchButton();
            clearInput();
        }

    }
    public void clickSignIn() {
        try {
            clickOnCss("#gh-ug > a");
        }catch (Exception e){
            clickByXpath("//*[@id=\"gh-ug\"]/a");
            System.out.println(e);
        }
    }
    public WebElement getSearchInputField() {
        //TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return searchInputWebElement;
    }
    public void setSearchInputField(WebElement searchInputField) {
       // TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        this.searchInputWebElement = searchInputField;
    }
    public void searchItems() throws InterruptedException, IOException {
        List<String> itemList = getItemValue();
        for(String st: itemList) {
            getSearchInputField().sendKeys(st, Keys.ENTER);
            getSearchInputField().clear();
        }
    }

    public List<String> getItemValue(){
       //TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Java Book");
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
        clickOnCss("#gh-cat");
        WebElement menu = driver.findElement(By.xpath("//*[@id=\"gh-cat\"]/option[34]"));
        System.out.println(menu.getText());
    }
}
