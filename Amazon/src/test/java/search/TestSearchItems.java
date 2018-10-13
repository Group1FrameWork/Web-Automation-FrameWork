package search;

import Search.Searchpage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSearchItems extends Searchpage {

    @Test
    public static void  testSearch() throws Exception, InterruptedException {
        Searchpage page = PageFactory.initElements(driver, Searchpage.class);
        page.getDataFromExcelFileAndSearch();
    }
}
