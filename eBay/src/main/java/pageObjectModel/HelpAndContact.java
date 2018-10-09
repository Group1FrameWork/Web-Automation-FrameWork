package pageObjectModel;

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
    public static WebElement searchInputField;

    public static WebElement getSearchInputField() {
        return searchInputField;
    }

    public void searchField(String locator) {
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

    public void searchAndSubmit(String value) {
        try {
            getSearchInputField().sendKeys(value);
        } catch (Exception e) {
            typeByCss("#search_input_element", value);
        }
    }

    public void submitSearchButton() {
        takeEnterKeys("#search_input_element");
    }

    public void searchMultipleField(String locator) throws IOException, InterruptedException {
        List<String> list = getSearchValue();
        for (int i = 0; i < list.size(); i++) {
            searchAndSubmit(list.get(i));
            Thread.sleep(4000);
            submitSearchButton();
            clearInput(locator);
        }
    }

    public void getPersonalizedHelp(String locator) throws InterruptedException {
        clickOnCss(locator);
    }

    public void clickOnHelp(String locator) throws InterruptedException {
        clickOnCss(locator);
    }
    //TC#1

    public void searchForHelp() throws InterruptedException {
        clickOnHelp("#gh-p-3 > a");
        searchField("#search_input_element");
    }
    // TC#2

    public void searchForMultipleHelp() throws IOException, InterruptedException {
        clickOnHelp("#gh-p-3 > a");
        searchMultipleField("#search_input_element");
    }
    //TC#3

    public void getHelp1() throws InterruptedException {
        clickOnHelp("#gh-p-3 > a");
        getPersonalizedHelp("#popular_solution_1 > span > span.main_title");
    }

    //TC#4
    public void getHelp2() throws InterruptedException {
        clickOnHelp("#gh-p-3 > a");
        getPersonalizedHelp("#popular_solution_2 > span > span.main_title");
    }
    //TC#5
    public void getHelp3() throws InterruptedException {
        clickOnHelp("#gh-p-3 > a");
        getPersonalizedHelp("#popular_solution_3 > span > span.main_title");
    }
    //TC#6
    public void getHelp4() throws InterruptedException {
        clickOnHelp("#gh-p-3 > a");
        getPersonalizedHelp("#popular_solution_4 > span > span.main_title");
    }
    //TC#7
    public void getHelp5() throws InterruptedException {
        clickOnHelp("#gh-p-3 > a");
        getPersonalizedHelp("#popular_solution_5 > span > span.main_title");
    }
    //TC#8
    public void getHelp6() throws InterruptedException {
        clickOnHelp("#gh-p-3 > a");
        getPersonalizedHelp("#popular_solution_6 > span > span.main_title");
    }
    //TC#9
    public void returnAndRefunds() throws InterruptedException {
        clickOnHelp("#gh-p-3 > a");
        getPersonalizedHelp("#returns-refunds > span > span.t2");
    }
    //TC#10
    public void shippingAndTracking() throws InterruptedException {
        clickOnHelp("#gh-p-3 > a");
        getPersonalizedHelp("#postage-tracking > span > span.t2");
    }
    //TC#11
    public void selling() throws InterruptedException {
        clickOnHelp("#gh-p-3 > a");
        getPersonalizedHelp("#selling > span > span.t2");
    }
    //TC#12
    public void buying() throws InterruptedException {
        clickOnHelp("#gh-p-3 > a");
        getPersonalizedHelp("#buying > span > span.t2");
    }
    //TC#13
    public void account() throws InterruptedException {
        clickOnHelp("#gh-p-3 > a");
        getPersonalizedHelp("#account > span > span.t2");
    }

}
