package Main;

import base.CommonAPI;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DailyDeals extends CommonAPI {


    //Move the cursor in the the element
    public void moveCursor(String locator){
    mouseHoverByLinkText(locator);
}

    //Click on Daily Deals Link
    public void clickDailyDeals() {
        clickOnCss(".gh-p");
    }

    // Click on the link inside feature
        public void clickLink(String locator){
    try{
    clickOnCss(locator);
    }catch (Exception e){
    clickOnLinkText(locator);
    }


        }
}

