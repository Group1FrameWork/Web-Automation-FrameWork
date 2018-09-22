package pages;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPages extends CommonAPI{
    @FindBy(css = "#nav-search-query")
    public static WebElement SearchPages;

    public  WebElement getSearchPages() {
        return SearchPages;
    }
    public void setSearchPages(){
       getSearchPages().sendKeys("mobile banking",Keys.ENTER);
    }


    
}
