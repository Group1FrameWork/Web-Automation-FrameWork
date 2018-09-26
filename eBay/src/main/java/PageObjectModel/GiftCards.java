package PageObjectModel;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class GiftCards extends CommonAPI {

    @FindBy(how = How.CSS, using = "#gh-p-4 > a")
    public static WebElement giftCards;

    @FindBy(how = How.CSS, using = "#w1-w0 > ul > li:nth-child(1) > a")
    public static WebElement coupons;

    @FindBy(how = How.CSS, using = "#w1-w0 > ul > li:nth-child(2) > a")
    public static WebElement digitalGiftsAndCoupons;


    @FindBy(how = How.CSS, using = "#w1-w0 > ul > li:nth-child(3) > a")
    public static WebElement eBayGiftsCards;

    @FindBy(how = How.CSS, using = "#w1-w0 > ul > li:nth-child(4) > a")
    public static WebElement gCards;

    @FindBy(how = How.CSS, using = "#w1-w0 > ul > li:nth-child(5) > a")
    public static WebElement giftCertificates;

    public static WebElement getGiftCards() {
        return giftCards;
    }

    public static WebElement getCoupons() {
        return coupons;
    }

    public static WebElement getDigitalGiftsAndCoupons() {
        return digitalGiftsAndCoupons;
    }

    public static WebElement geteBayGiftsCards() {
        return eBayGiftsCards;
    }

    public static WebElement getgCards() {
        return gCards;
    }

    public static WebElement getGiftCertificates() {
        return giftCertificates;
    }

    //Move the cursor in the the element
    public void moveCursor(String locator) {
        mouseHoverByLinkText(locator);
    }

    public void clickOnGiftCards() {
        try {
            getGiftCards().click();
        } catch (Exception e) {
            clickOnCss("#gh-p-4 > a");
        }

    }

    public void clickOnCoupons() {
        try {
            getCoupons().click();
        } catch (Exception e) {
            clickOnCss("#w1-w0 > ul > li:nth-child(1) > a");
        }


    }

    public void clickOnDigitalGiftsAndCoupons() {
        try {
            getDigitalGiftsAndCoupons().click();
        } catch (Exception e) {
            clickOnCss("#w1-w0 > ul > li:nth-child(2) > a");
        }

    }

    public void clickOneBayGiftsCards() {
        try {
            geteBayGiftsCards().click();
        } catch (Exception e) {
            clickOnCss("#w1-w0 > ul > li:nth-child(3) > a");
        }

    }

    public void clickOngCards() {
        try {
            getgCards().click();
        } catch (Exception e) {
            clickOnCss("#w1-w0 > ul > li:nth-child(4) > a");
        }

    }

    public void clickOngiftCertificates() {
        try {
            getGiftCertificates().click();
        } catch (Exception e) {
            clickOnCss("#w1-w0 > ul > li:nth-child(5) > a");
        }
    }

    public void viewSort(String locator) {

        //moveCursor("Best Match");
        List<WebElement> sort = getListOfWebElementsByCss(locator);
        for (WebElement search : sort) {
            System.out.println(search.getSize());
            System.out.println(search.getText());
        }

    }

    public void results(String locator) {
        getTextByCss(locator);

    }
}
