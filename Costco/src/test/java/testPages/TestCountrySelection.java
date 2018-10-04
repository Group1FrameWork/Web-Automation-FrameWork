package testPages;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.pages.CountrySelection;
public class TestCountrySelection extends CountrySelection {
    CountrySelection countrySelection;
    @BeforeMethod
    public void initializationOfElement(){
        TestLogger.log(getClass().getSimpleName()+": "+converToString((new Object(){}.getClass().getEnclosingMethod().getName())));
        countrySelection=PageFactory.initElements(CommonAPI.driver, CountrySelection.class);
    }
    @Test
    public void testDismissAlert(){
        TestLogger.log(getClass().getSimpleName()+": "+converToString((new Object(){}.getClass().getEnclosingMethod().getName())));
        countrySelection.alertPopUp();
    }
    @Test
    public void testConvertToString(){
        TestLogger.log(getClass().getSimpleName()+": "+converToString((new Object(){}.getClass().getEnclosingMethod().getName())));
        converToString("AHIL");
    }
}
