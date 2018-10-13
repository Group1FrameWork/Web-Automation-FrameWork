package page;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AmazonSearch extends CommonAPI {
    @FindBy(how = How.CSS, using = "#searchDropdownBox")
    public static WebElement searchDropdownBox;
    @FindBy(how = How.CSS, using = "#twotabsearchtextbox")
    public static WebElement searchInput;
    @FindBy(how = How.CSS, using = ".nav-input")
    public static WebElement searchBtn;
    public static void clickOnsearchDropdownBox() {
        searchDropdownBox.click();
    }
    public void selectOnSearchDropdownBox(){
        Select sel = new Select(searchDropdownBox);
        List<WebElement> list = sel.getOptions();
        for(int i=0; i < list.size(); i++){
            list.get(i).click();
        }
    }
    public void printSearchDropdownOptions(){
        Select sel = new Select(searchDropdownBox);
        List<WebElement> list = sel.getOptions();
        for(int i=0; i < list.size(); i++){
            String optionName = list.get(i).getText();
            System.out.println(optionName);
        }
    }
    public static void searchFor(String query) {
        searchInput.sendKeys(query);
        searchBtn.click();
    }


}




