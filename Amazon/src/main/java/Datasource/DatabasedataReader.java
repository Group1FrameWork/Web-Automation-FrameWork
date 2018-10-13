
package Datasource;

import Search.Searchpage;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;
import utility.ConnectDB;
import java.util.List;
import java.util.logging.Logger;

import static base.CommonAPI.convertToString;
import static base.CommonAPI.driver;
import static base.CommonAPI.sleepFor;

public class DatabasedataReader extends TestLogger {
    public void dataFromDatabase()throws Exception,InterruptedException{
        Logger.getLogger(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Searchpage searchPage = PageFactory.initElements(driver, Searchpage.class);
        ConnectDB connectDB = new ConnectDB();
        List<String> list = connectDB.readDataBase();
        for(String data:list){
            searchPage.searchFor(data);
            sleepFor(2);
            searchPage.clearSearchInput();
        }
    }
}





