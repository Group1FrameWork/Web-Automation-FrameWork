package PageObjectModel;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HelpAndContact extends CommonAPI {

    @FindBy(how = How.CSS, using = "#search_input_element")
    public static WebElement SearchInputField;

    public static WebElement getSearchInputField() {
        return SearchInputField;
    }

    public void SearchField(String locator) {
        try {
            getSearchInputField().sendKeys("return policy", Keys.ENTER);
        } catch (Exception e) {
            typeByCssNEnter("#search_input_element", "return policy");
        }
        clearInput("#search_input_element");
    }

    public List<String> getSearchValue() {

        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Paying Tax");
        itemsList.add("Shipping Policy");
        itemsList.add("All about selling");
        itemsList.add("eBay valet");
        itemsList.add("Your Watch List");
        itemsList.add("Best Price Guarantee");
        itemsList.add("Setting a reserve price");
        itemsList.add("Pricing your items");
        return itemsList;
    }

    public void SearchAndSubmit(String value) {
        try {
            getSearchInputField().sendKeys(value);
        } catch (Exception e) {
            typeByCss("#search_input_element", value);
        }
    }

    public void submitSearchButton() {
        takeEnterKeys("#search_input_element");
    }

    public void SearchMultipleField(String locator) throws IOException, InterruptedException {
        List<String> list = getSearchValue();
        for (int i = 0; i < list.size(); i++) {
            SearchAndSubmit(list.get(i));
            Thread.sleep(4000);
            submitSearchButton();
            clearInput(locator);
        }
    }

    public void GetPersonalizedHelp(String locator)  {
        clickOnCss(locator);
    }

    public void clickOnHelp(String locator) {
        clickOnCss(locator);
    }
}
