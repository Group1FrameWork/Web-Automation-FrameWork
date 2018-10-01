package testPages;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.pages.Grocery;
import java.util.concurrent.TimeUnit;

public class TestGrocery extends Grocery {
    Grocery grocery;
    @BeforeMethod
    public void initializationOfElement() {
        TestLogger.log(getClass().getSimpleName()+": "+converToString((new Object(){}.getClass().getEnclosingMethod().getName())));
        grocery = PageFactory.initElements(driver, Grocery.class);
    }
    @Test(priority = 1, enabled = true)
    public void testGroceryButton() {
        grocery.clickGrocery();
    }
    @Test
    public void testGetText(){
        grocery.clickGrocery();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        getText("//*[@id=\"delivery-postal-popup-body\"]/span");
    }
    @Test
    public void testNegativeZipCode(){
        grocery.valueZipCodeCSS();
        typeOnInputBox("#postal-code-input", "1000");
        clickOnElement("#postal-code-submit");
    }
    @Test
    public void testPositiveZipCode(){
        grocery.valueZipCodeCSS();
        typeOnInputBox("#postal-code-input", "11416");
        clickOnElement("#postal-code-submit");
    }
    @Test
    public void testClearZipCode(){
        grocery.clearZipCodeField();
        typeOnInputBox("#postal-code-input","121212");
        clearInputField("#postal-code-input");
    }
    @Test
    public void testGroceryText(){
        getGroceryText();
    }

    @Test
    public void testPhotoHover(){
        mouseHoverByXpath("#Home_Ancillary_5");
    }
    @Test
    public void testDefaultWindow(){
        defaultChecking();
    }
    @Test
    public void testTextOfZipCode(){
        grocery.GroceryBarCSS.click();
        getText("//div[@id='delivery-postal-popup-body']/span");
    }
}
