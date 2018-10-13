package testDataBase;

import database.DbSearchItem;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestDbSearchItem extends DbSearchItem {
    @Test
    public void testSearchByDB() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchByDB();
    }
}
