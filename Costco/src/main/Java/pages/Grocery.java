package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Grocery extends CommonAPI {
    @FindBy(css = "#Home_Ancillary_0")
    public  static WebElement GroceryBarCSS;

    public void clickGrocery(){
        GroceryBarCSS.click();

    }



}
