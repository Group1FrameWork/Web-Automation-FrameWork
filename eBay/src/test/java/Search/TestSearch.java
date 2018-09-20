package Search;

import HomePage.SearchPage;
import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;

public class TestSearch extends CommonAPI {
    @Test
    public void searchData()throws IOException{
        TestLogger.log(getClass().getSimpleName()+":"+ CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchPage  searchPage = PageFactory.initElements(driver, SearchPage.class);
    searchPage.searchItemsAndSubmitButton();
    }
}
