package DatabaseTest;

import Database.DBsearch;
import org.testng.annotations.Test;

public class DBsearchTest extends DBsearch {
    @Test
    public void testSearchByDB() throws Exception {
        searchByDB();
    }

    @Test
    public void testMultipleByDB() throws Exception {
        searchByDBmultiple();
    }
}
