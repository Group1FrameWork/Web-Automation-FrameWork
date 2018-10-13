package search;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AboutUs;
import pages.BusinessesAndInstitutions;
import reporting.TestLogger;

public class TestBusinessesAndInstitution extends BusinessesAndInstitutions {
    BusinessesAndInstitutions objOfBusinessesAndInstitutions ;
    @BeforeMethod
    public void elementsOfBusinesses(){
        objOfBusinessesAndInstitutions = PageFactory.initElements(driver, BusinessesAndInstitutions.class);
    }
    @Test
    public void clickInNavber(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickinBusinesses();
    }
}
