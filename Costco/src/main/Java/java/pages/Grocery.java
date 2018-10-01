package java.pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Grocery extends CommonAPI {
    @FindBy(css = "#Home_Ancillary_0")
    public  static WebElement GroceryBarCSS;
    @FindBy(css = "#postal-code-input")
    public  static WebElement ZipCodeCSS;
    @FindBy(xpath = "//div[@id='delivery-postal-popup-body']/span")
    public  static WebElement ZipCodeText;



    public void clickGrocery(){
        GroceryBarCSS.click();
    }
    public void valueZipCodeCSS(){
        GroceryBarCSS.click();
    }
    public void clearZipCodeField() {
        GroceryBarCSS.click();
    }
    public void getGroceryText() { getText("#Home_Ancillary_0");
    }
    public void photoHover(){
        GroceryBarCSS.click();
    }

    public void defaultChecking(){
        navigateHardCoded();
        goBackToHomeWindow();
    }
}
