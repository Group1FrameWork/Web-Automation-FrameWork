package Search;

import PageObjectModel.GiftCards;
import org.testng.annotations.Test;

public class GiftCardsTest extends GiftCards {

    //TC#1 Click on coupons and find out how many coupons are there
    @Test
    public void coupons() throws InterruptedException {
        clickOnGiftCards();
        clickOnCoupons();
        results("#w7-w0 > div:nth-child(2) > div:nth-child(1) > div > h2");
    }
    //TC#2 Click on Digital Gifts & Coupons and find out how many coupons are there
    @Test
    public void DigitalGiftsCoupons() throws InterruptedException {
        clickOnGiftCards();
        clickOnDigitalGiftsAndCoupons();
        results("#w7-w0 > div:nth-child(2) > div:nth-child(1) > div > h2");
    }
    //TC#3 Click on coupons and find out how many coupons are there
    @Test
    public void GiftCards() throws InterruptedException {
        clickOnGiftCards();
        clickOngCards();
        results("#w9-w0 > div:nth-child(2) > div:nth-child(1) > div > h2");
    }
    //TC#4 Click on coupons and find out how many coupons are there
    @Test
    public void eBayGiftCards() throws InterruptedException {
        clickOnGiftCards();
        clickOneBayGiftsCards();
        results("#w5-w0 > div:nth-child(2) > div:nth-child(1) > div > h2");
    }
    //TC#5 Click on coupons and find out how many coupons are there
    @Test
    public void GiftCertificates() throws InterruptedException {
        clickOnGiftCards();
        clickOngiftCertificates();
        results("#w8-w0 > div:nth-child(2) > div:nth-child(1) > div > h2");
    }

}
