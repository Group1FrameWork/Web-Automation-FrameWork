package search;

import pageObjectModel.GiftCards;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class GiftCardsTest extends GiftCards {
    GiftCards giftCards = PageFactory.initElements(CommonAPI.driver, GiftCards.class);

    //TC#1 Click on coupons and find out how many coupons are there
    @Test
    public void coupons() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " : " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        giftCards.coupons();
    }
    //TC#2 Click on Digital Gifts & Coupons and find out how many coupons are there
    @Test
    public void digitalGiftsCoupons() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " : " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        giftCards.digitalGiftsCoupons();
    }
    //TC#3 Click on coupons and find out how many coupons are there
    @Test
    public void giftCards() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " : " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        giftCards.giftCards();
    }
    //TC#4 Click on coupons and find out how many coupons are there
    @Test
    public void eBayGiftCards() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " : " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        giftCards.eBayGiftCards();
    }
    //TC#5 Click on coupons and find out how many coupons are there
    @Test
    public void giftCertificates() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " : " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        giftCards.giftCertificates();
    }
}
