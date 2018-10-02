package testSearchBar;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.searchBar.ElementSearch;

import static java.googleSheetSignIn.GoogleSheetSignIn.searchBar;

public class TestElementSearch extends ElementSearch {
    ElementSearch elementSearch;
    @BeforeMethod
    public void initializationOfElement(){
        elementSearch=PageFactory.initElements(driver, ElementSearch.class);
    }
    @Test
    public void testSearchByItems() throws Exception {
        elementSearch.searchByItems();
    }

    @Test
    public void testMultipleByDB() throws Exception {
        searchByDBmultiple();
    }
}
