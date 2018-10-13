package page;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class amazonhomepage extends CommonAPI {
    @FindBy(how = How.ID, using = "twotabsearchtextbox")
    WebElement searchBox;

    @FindBy(how = How.CLASS_NAME, using = "nav-input")
    WebElement searchBtn;

    @FindBy(how = How.XPATH, using = ".//*[@id='nav-cart']/span[3]")
    public static WebElement shoppingCart;

    @FindBy(how = How.XPATH, using = ".//*[@id='nav-xshop']/a[3]")
    public static WebElement Giftcard;
    public void searchUP(String query){
        searchBox.sendKeys(query);
        searchBtn.click();
    }
    public void clickOnShoppingCart(){
        shoppingCart.click();
    }
    public void ClickonGiftcard(){
        Giftcard.click();
    }

}
