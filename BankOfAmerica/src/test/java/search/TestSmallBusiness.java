package search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SmallBusiness;
import reporting.TestLogger;

public class TestSmallBusiness extends SmallBusiness {
    SmallBusiness ObjOfSmallBusiness;

    @BeforeMethod
    public void elementsOfSmallBusiness(){
        ObjOfSmallBusiness = PageFactory.initElements(driver,SmallBusiness.class);
        }

    @Test
    public void TestSmallBusiness() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ObjOfSmallBusiness.SearchSmallBusiness();
        navigateBack();
        refresh();
        navigateForward();
        getCurrentPageUrl();
        selectOptionByVisibleText(OpenAnCheckingAccountSubmitButton," New York ");
        Thread.sleep(2000);

    }
}
