package testSearchBar;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;


import java.searchBar.ElementSearch;

public class TestElementSearch extends ElementSearch {
    ElementSearch elementSearch;
    @BeforeMethod
    public void initializationOfElement(){
        elementSearch=PageFactory.initElements(CommonAPI.driver, ElementSearch.class);
    }
    @Test
    public void testSearchByItems() throws Exception {
        TestLogger.log(getClass().getSimpleName()+": "+converToString((new Object(){}.getClass().getEnclosingMethod().getName())));
        elementSearch.searchByItems();
    }
    @Test
    public void testMultipleByDB() throws Exception {
        TestLogger.log(getClass().getSimpleName()+": "+converToString((new Object(){}.getClass().getEnclosingMethod().getName())));
        signInInput();
    }
}
