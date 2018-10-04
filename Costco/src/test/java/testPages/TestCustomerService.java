package testPages;
import base.CommonAPI;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.pages.CustomerService;
public class TestCustomerService extends CustomerService {
    CustomerService customerService;
    @BeforeMethod
    public void initializationOfElement(){
        TestLogger.log(getClass().getSimpleName()+": "+converToString((new Object(){}.getClass().getEnclosingMethod().getName())));
        customerService=PageFactory.initElements(CommonAPI.driver, CustomerService.class);
    }
    @Test(priority = 1, enabled = true)
    public void testCustomerService(){
        TestLogger.log(getClass().getSimpleName()+": "+converToString((new Object(){}.getClass().getEnclosingMethod().getName())));
        customerService.searchCustomerService();
    }
    @Test
    public void testCreditCard(){
        TestLogger.log(getClass().getSimpleName()+": "+converToString((new Object(){}.getClass().getEnclosingMethod().getName())));
        customerService.creditCardEnd();
        //navigateToSpecificPage("https://www.costco.com/credit-card.html");
        customerService.setCreditCard2();
        getText("#costcoModalText");
    }
    @Test
    public void testMembership(){
        TestLogger.log(getClass().getSimpleName()+": "+converToString((new Object(){}.getClass().getEnclosingMethod().getName())));
        customerService.membershipEnd();
    }
    @Test
    public void testWindowHandle(){
        TestLogger.log(getClass().getSimpleName()+": "+converToString((new Object(){}.getClass().getEnclosingMethod().getName())));
        customerService.popNewWindow();
    }
    @Test
    public void testTabSwitching(){
        TestLogger.log(getClass().getSimpleName()+": "+converToString((new Object(){}.getClass().getEnclosingMethod().getName())));
        customerService.tabSwitching();
        switchTabs(1,2);
    }
}


