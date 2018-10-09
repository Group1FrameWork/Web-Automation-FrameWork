package databaseTest;

import dataBase.DBSearch;
import org.testng.annotations.Test;

public class DBSearchTest extends DBSearch {
    @Test
    public void testSearchByDB() throws Exception {
        searchByDB();
    }
    @Test
    public void testMultipleByDB() throws Exception {
        searchByDBmultiple();
    }
}
