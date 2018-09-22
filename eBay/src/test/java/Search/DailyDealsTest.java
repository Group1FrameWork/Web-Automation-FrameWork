package Search;

import Main.DailyDeals;
import org.testng.annotations.Test;

public class DailyDealsTest extends DailyDeals {

    //TC#1 User will be able to see the more featured deals
    @Test
    public void features(){
        clickDailyDeals();
        moveCursor("Featured");
        clickLink("#s2 > nav > ul > li.selected.navigation-desktop-with-flyout > div > div:nth-child(1) > a:nth-child(1)");
        moveCursor("Apple iPhone XS MAX 64GB - All Colors! GSM & CDMA UNLOCKED");
        clickOnLinkText("Apple iPhone XS MAX 64GB - All Colors! GSM & CDMA UNLOCKED");
        getTextByCss("#prcIsum");
    }
    //TC#2 User will be able to see the tech deals
    @Test
    public void tech(){
        clickDailyDeals();
        moveCursor("Tech");
        clickLink("#s2 > nav > ul > li:nth-child(2) > div > div:nth-child(1) > a:nth-child(1)");
        moveCursor("Apple iPhone X 256GB Silver LTE Cellular AT&T MQAN2LL/A");
        clickOnLinkText("Apple iPhone X 256GB Silver LTE Cellular AT&T MQAN2LL/A");
        getTextByCss("#prcIsum");
    }
    //TC#3 User will be able to see the fashion deals
    @Test
    public void fashion(){
        clickDailyDeals();
        moveCursor("Fashion");
        clickLink("#s2 > nav > ul > li:nth-child(3) > div > div:nth-child(1) > a:nth-child(1)");
        moveCursor("Alpine Swiss Stefan Mens Retro Fashion Sneakers Tennis Shoes Casual Athletic New");
        clickOnLinkText("Alpine Swiss Stefan Mens Retro Fashion Sneakers Tennis Shoes Casual Athletic New");
        getTextByCss("#prcIsum");
    }
    //TC#4 User will be able to see the Home & Garden deals
    @Test
    public void homeAndGarden() throws InterruptedException {
        clickDailyDeals();
        Thread.sleep(3000);
        moveCursor("Home & Garden");
        clickLink("#s2 > nav > ul > li.selected.navigation-desktop-with-flyout > div > div:nth-child(2) > a:nth-child(5)");
        moveCursor("White Handmade Baby Quilt For Nursery Toddler Bedding Warm Baby Blanket");
        clickOnLinkText("White Handmade Baby Quilt For Nursery Toddler Bedding Warm Baby Blanket");
        getTextByCss("#prcIsum");
    }
    //TC#5 User will be able to see the Sporting Goods deals
    @Test
    public void sportingGoods() throws InterruptedException {
        clickDailyDeals();
        Thread.sleep(3000);
        moveCursor("Sporting Goods");
        clickLink("#s2 > nav > ul > li:nth-child(5) > div > div:nth-child(1) > a:nth-child(2)");
        moveCursor("KastKing Rover Conventional Reel Round Saltwater Baitcasting Fishing Reel");
        clickOnLinkText("KastKing Rover Conventional Reel Round Saltwater Baitcasting Fishing Reel");
        getTextByCss("#mm-saleDscPrc");
    }
}
