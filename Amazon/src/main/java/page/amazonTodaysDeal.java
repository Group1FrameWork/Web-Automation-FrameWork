package page;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class amazonTodaysDeal extends CommonAPI {
    @FindBy(how = How.XPATH, using = ".//*[@id='nav-xshop']/a[2]")
    WebElement TodaysDeal;

    public void clickOnTodaysDeal(){
        TodaysDeal.click();
    }
}

