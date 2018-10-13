package Search;
import base.CommonAPI;
import utility.DataReader;

import java.io.IOException;
import java.util.logging.Logger;

public class ItemsToBeSearched extends CommonAPI {
    DataReader dr = new DataReader();

    public String[] getDataFromExcelFile() throws IOException {
        Logger.getLogger(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        String path = System.getProperty("user.dir") + "/Users/ismayatikiran/Documents/Web-Automation-FrameWork_group1/Web-Automation-FrameWork/Amazon/data/file1.xls";
        String[] st = dr.fileReader(path);
        return st;
    }
}

