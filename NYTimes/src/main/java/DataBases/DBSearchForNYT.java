package DataBases;

import base.CommonAPI;
import databases.ConnectToSqlDB;
import java.util.ArrayList;
import java.util.List;

public class DBSearchForNYT extends CommonAPI {
    //insert data to db
    public static List<String> getItemValue()  {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("World");
        itemsList.add("US");
        itemsList.add("Politics");
        itemsList.add("NY");
        itemsList.add("Business");
        itemsList.add("Tech");
        itemsList.add("Science");
        itemsList.add("Sports");
        itemsList.add("Art");
        itemsList.add("Books");
        itemsList.add("Style");
        itemsList.add("Food");
        itemsList.add("Travel");
        itemsList.add("Magazine");
        itemsList.add("TMagazine");
        itemsList.add("Real Estate");
        itemsList.add("Video");
        return itemsList;
        }
        //put Data to DB-Mysql
       public static void main (String[]args) throws Exception {
           ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
           connectToSqlDB.insertDataFromArrayListToMySql(getItemValue(),"NYTIMES","items");
        }
        public static List<String> tabs () {
            List<String> tabs = new ArrayList<String>();
            tabs.add("tabs1");
            tabs.add("tabs2");
            tabs.add("tabs3");
            tabs.add("tabs4");
            tabs.add("tabs5");
            tabs.add("tabs6");
            tabs.add("tabs7");
            tabs.add("tabs8");
            tabs.add("tabs9");
            tabs.add("tabs10");
            tabs.add("tabs11");
            tabs.add("tabs12");
            tabs.add("tabs13");
            tabs.add("tabs14");
            tabs.add("tabs15");
            tabs.add("tabs16");
            tabs.add("tabs17");
            tabs.add("tabs18");
            tabs.add("tabs19");
            return tabs;
         }
        //bring data from db and search using them
        public void searchByDB () throws Exception {
            ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
           // connectToSqlDB.insertDataFromArrayListToMySql(tabs(), "NYTimes", "tabs");
            List<String> items = connectToSqlDB.readDataBase("TestNYT", "tab");
            for (int i = 1; i<items.size();i++){
                System.out.println(items.get(i));
            }
        }
    }




