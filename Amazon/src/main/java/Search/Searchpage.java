package Search;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;


public class Searchpage extends ItemsToBeSearched{

    @FindBy(how = How.CSS, using = "#twotabsearchtextbox")
    public static WebElement searchinputWebElement;

   @FindBy(how = How.CSS, using = ".nav-input")
    public static WebElement submitbuttonwebelement;

   public static WebElement getSearchinputWebElement(){
       return searchinputWebElement;
   }
   public static WebElement getSubmitbuttonwebelement(){
       return  submitbuttonwebelement;
   }
   public static void searchFor(String value){
       getSearchinputWebElement().sendKeys(value);
   }
   public static void submitsearchbutton(){
       getSubmitbuttonwebelement().click();
   }
   public void clearSearchInput(){
       getSearchinputWebElement().clear();
   }
   public void Searchitems(){
       String value = "java Books";
       searchFor(value);
       submitsearchbutton();
   }
     public void getDataFromExcelFileAndSearch()throws IOException, InterruptedException{

        //Create instance of Excel file reader class
        ItemsToBeSearched itemsToBeSearched = new ItemsToBeSearched();

        //Page Factory class init
        Searchpage search = PageFactory.initElements(driver, Searchpage.class);

        //Read data from Excel File.
        String[] value = itemsToBeSearched.getDataFromExcelFile();
        //Running for each loop
        for (int i = 1; i < value.length; i++) {
            search.searchFor(value[i]);
            sleepFor(2);
            search.clearSearchInput();
        }
    }

}

