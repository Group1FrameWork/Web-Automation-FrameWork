package DataReader;

import java.util.ArrayList;

public class XlsDataReaderUtil {

    static Xls_Reader reader;

    public static ArrayList<Object[]> getDataFromExcel(){

    ArrayList<Object[]> myData = new ArrayList<Object[]>();
    try {
        reader = new Xls_Reader("/Users/subhra/Maven/Group1_Web_automation/Web-Automation-FrameWork/eBay/Data/DataFile2.xls");
    }
    catch (Exception e){
        e.printStackTrace();
    }
     // change only sheet name in line 19
    for (int rowNum =2; rowNum <= reader.getRowCount("Sheet1"); rowNum++){
        String  email = reader.getCellData("Sheet1", "email",rowNum );
        String passCode = reader.getCellData("Sheet1","passCode", rowNum);
        String message = reader.getCellData("Sheet1","message", rowNum);
        Object obj[] = {email,passCode, message};
        myData.add(obj);
       }

    return  myData;
   }
}