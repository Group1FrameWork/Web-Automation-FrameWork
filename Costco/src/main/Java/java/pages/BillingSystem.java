package java.pages;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class BillingSystem extends CommonAPI {
    @FindBy(id = "cart-d")
    public static WebElement cart;
}
