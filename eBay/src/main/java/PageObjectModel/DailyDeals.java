package PageObjectModel;

import base.CommonAPI;

public class DailyDeals extends CommonAPI {

    //Move the cursor in the the element
    public void moveCursor(String locator) {
        mouseHoverByLinkText(locator);
    }
    //Click on Daily Deals Link
    public void clickDailyDeals() throws InterruptedException {
        clickOnCss(".gh-p");
    }
    // Click on the link inside feature
    public void clickLink(String locator) {
        try {
            clickOnCss(locator);
        } catch (Exception e) {
            clickOnLinkText(locator);
        }
    }
}

