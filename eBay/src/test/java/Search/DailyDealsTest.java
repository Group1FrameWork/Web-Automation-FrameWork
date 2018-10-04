package Search;

import PageObjectModel.DailyDeals;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class DailyDealsTest extends DailyDeals {
    DailyDeals dailyDeals = PageFactory.initElements(CommonAPI.driver, DailyDeals.class);

    //TC#1 User will be able to see the more featured deals
    @Test
    public void features() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        dailyDeals.features();
    }
    //TC#2 User will be able to see the tech deals
    @Test
    public void tech() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        dailyDeals.tech();
    }
    //TC#3 User will be able to see the fashion deals
    @Test
    public void fashion() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        dailyDeals.fashion();
    }
    //TC#4 User will be able to see the Home & Garden deals
    @Test
    public void homeAndGarden() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        dailyDeals.homeAndGarden();
    }
    //TC#5 User will be able to see the Sporting Goods deals
    @Test
    public void sportingGoods() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        dailyDeals.sportingGoods();
    }
}
