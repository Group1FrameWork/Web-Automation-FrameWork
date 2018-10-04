package testPages;


import base.CommonAPI;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.pages.HomePage;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class TestHomePage extends HomePage {
    HomePage homePage;
    @BeforeMethod
    public void initializationOfElement() {
        homePage = PageFactory.initElements(CommonAPI.driver, HomePage.class);
    }
    @Test
    public void testShowCostcoTitle(){
        TestLogger.log(getClass().getSimpleName()+": "+converToString((new Object(){}.getClass().getEnclosingMethod().getName())));
        showCostcoTitle();
    }
    @Test
    public void search(){
        TestLogger.log(getClass().getSimpleName()+": "+converToString((new Object(){}.getClass().getEnclosingMethod().getName())));
        homePage.getSearchResult("Table");
    }
    @Test()
    public  void testAllInput(){
        TestLogger.log(getClass().getSimpleName()+": "+converToString((new Object(){}.getClass().getEnclosingMethod().getName())));
        homePage.getclick();
    }
    @Test()
    public  void testGetAllDept() {
        TestLogger.log(getClass().getSimpleName()+": "+converToString((new Object(){}.getClass().getEnclosingMethod().getName())));
        homePage.getAlldepartments();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }
    @Test()
    public void testDropdownOfAll() {
        TestLogger.log(getClass().getSimpleName()+": "+converToString((new Object(){}.getClass().getEnclosingMethod().getName())));
        List<String> text1 = new ArrayList<String>();
        text1 = allDropdown();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        for (String e : text1) {
            System.out.println(e);
        }
    }
    @Test()
    public void hoverPharmacy() {
        TestLogger.log(getClass().getSimpleName()+": "+converToString((new Object(){}.getClass().getEnclosingMethod().getName())));
        WebElement element = hoverPharmacyElement;
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }
    @Test()
    public void testHoverShopAllDepartments(){
        TestLogger.log(getClass().getSimpleName()+": "+converToString((new Object(){}.getClass().getEnclosingMethod().getName())));
        hoverShopAllDepartments();
    }
    @Test()
    public void testNavigate(){
        TestLogger.log(getClass().getSimpleName()+": "+converToString((new Object(){}.getClass().getEnclosingMethod().getName())));
        homePage.navigateTesting();
    }
    @Test()
    public void testCurrentURL(){
        TestLogger.log(getClass().getSimpleName()+": "+converToString((new Object(){}.getClass().getEnclosingMethod().getName())));
        navigateHardCoded();
        getCurrentPageUrl();
    }
    @Test()
    public void testEnableStatusSearchBar(){
        TestLogger.log(getClass().getSimpleName()+": "+converToString((new Object(){}.getClass().getEnclosingMethod().getName())));
        enableStatusSearchBar();
    }
    @Test()
    public void testListOfStringOfAllDept(){
        TestLogger.log(getClass().getSimpleName()+": "+converToString((new Object(){}.getClass().getEnclosingMethod().getName())));
        listOfStringOfAllDept();
    }
    @Test()
    public void testDropDownOfAll(){
        TestLogger.log(getClass().getSimpleName()+": "+converToString((new Object(){}.getClass().getEnclosingMethod().getName())));
        allDropDown2();
    }
    @Test()
    public void testAllDept(){
        TestLogger.log(getClass().getSimpleName()+": "+converToString((new Object(){}.getClass().getEnclosingMethod().getName())));
        selectOptionByVisibleText(allInput,"Grocery");
    }
    @Test()
    public void testTagName(){
        TestLogger.log(getClass().getSimpleName()+": "+converToString((new Object(){}.getClass().getEnclosingMethod().getName())));
    }
    @Test()
    public void testGetAllLinks(){
        TestLogger.log(getClass().getSimpleName()+": "+converToString((new Object(){}.getClass().getEnclosingMethod().getName())));
    }
    @Test()
    public void testCostcoLogo(){
        TestLogger.log(getClass().getSimpleName()+": "+converToString((new Object(){}.getClass().getEnclosingMethod().getName())));
       logoValidation();
    }
}
