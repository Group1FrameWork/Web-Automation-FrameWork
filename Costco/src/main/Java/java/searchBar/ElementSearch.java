package java.searchBar;

import base.CommonAPI;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.List;

public class ElementSearch extends CommonAPI {
    public static List<String> getItemValue() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Laptop");
        itemsList.add("Books");
        itemsList.add("Cosmetics");
        itemsList.add("Phone");
        itemsList.add("Soap");
        itemsList.add("Bakery");
        itemsList.add("Rice");
        itemsList.add("Gifts");
        return itemsList;
    }

    //put Data to DB-Mysql
    public static void main(String[] args) {
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertDataFromArrayListToMySql(getItemValue(), "TestCostco", "search");
    }

    //-------------
    //insert datas to db
    public static List<String> setUserName() {
        List<String> username = new ArrayList<String>();
        username.add("user1");
        username.add("user2");
        username.add("user3");
        username.add("user4");
        username.add("user5");
        username.add("user6");
        username.add("user7");
        return username;
    }

    public static List<String> setUserPass() {
        List<String> passWord = new ArrayList<String>();
        passWord.add("Pass-user1");
        passWord.add("Pass-user2");
        passWord.add("Pass-user3");
        passWord.add("Pass-user4");
        passWord.add("Pass-user5");
        passWord.add("Pass-user6");
        passWord.add("Pass-user7");
        return passWord;
    }

    //bring data from db and search using them
    public void searchByItems() throws Exception {
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        //connectToSqlDB.insertDataFromArrayListToMySql(getItemValue(),"CostCo","search");
        connectToSqlDB.insertDataFromArrayListToMySql(getItemValue(),"Costco","search");
        List<String> items = connectToSqlDB.readDataBase("Costco", "search");
        for (int i = 0; i < items.size(); i++) {
            typeByXpathNEnter("//*[@id=\"search-field\"]", items.get(i));
            clearInputByXpath("//*[@id=\"search-field\"]");
        }
    }
    //bring data from db and input them
    public void searchByDBmultiple() throws Exception {
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        List<String> items = connectToSqlDB.readDataBase("tableTry", "name");
        List<String> items2 = connectToSqlDB.readDataBase("tableTry", "pass");
        clickOnLinkText("Sign in");
        for (int i = 0; i < items.size(); i++) {
            //typeByXpath("//input[@id='userid']", items.get(i));
            Thread.sleep(2000);
            //typeByXpath("//input[@id='pass']", items2.get(i));
            Thread.sleep(2000);
            //clearInputByXpath("//input[@id='userid']");
            Thread.sleep(2000);
            //clearInputByXpath("//input[@id='pass']");
            Thread.sleep(2000);
        }
    }
}
