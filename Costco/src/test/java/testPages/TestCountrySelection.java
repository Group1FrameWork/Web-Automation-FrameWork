package testPages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CountrySelection;
import pages.CustomerService;
import reporting.TestLogger;

public class TestCountrySelection extends CountrySelection {
    CountrySelection countrySelection;
    @BeforeMethod
    public void initializationOfElement(){
        TestLogger.log(getClass().getSimpleName()+": "+converToString((new Object(){}.getClass().getEnclosingMethod().getName())));
        countrySelection=PageFactory.initElements(driver, CountrySelection.class);
    }

    @Test
    public void testDismissAlert(){
        navigate("https://www.costco.com/LogonForm");
        countrySelection.alertPopUp();
        waitUntilClickAble(Website);
        Website.click();
    }
    @Test
    public void testConvertToString(){
        converToString("AHIL");
    }
}
