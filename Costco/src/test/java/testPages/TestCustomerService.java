package testPages;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CustomerService;
import reporting.TestLogger;

public class TestCustomerService extends CustomerService {
    CustomerService customerService;

    @BeforeMethod
    public void initializationOfElement(){
        TestLogger.log(getClass().getSimpleName()+": "+converToString((new Object(){}.getClass().getEnclosingMethod().getName())));
        customerService=PageFactory.initElements(driver, CustomerService.class);
    }
    @Test(priority = 1, enabled = true)

    public void testCustomerService(){

        customerService.searchCustomerService();
    }

    @Test
    public void testCreditCard(){
        customerService.creditCardEnd();
        navigateToSpecificPage("https://www.costco.com/credit-card.html");
        customerService.setCreditCard2();
        getText("#costcoModalText");
    }
    @Test
    public void testMembership(){
        customerService.membershipEnd();
    }
    @Test
    public void testWindowHandle(){
        customerService.popNewWindow();
        windowHandle(driver);
    }
    @Test
    public void testTabSwitching(){
        //customerService.tabSwitching();
        switchTabs(1,2);
    }
}


