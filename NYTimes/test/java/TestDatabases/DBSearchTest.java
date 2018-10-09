package TestDatabases;

import DataBases.DBSearchForNYT;
import org.testng.annotations.Test;

public class DBSearchTest extends DBSearchForNYT {
    @Test
    public void testSearchByDB() throws Exception {
        searchByDB();
    }
}
