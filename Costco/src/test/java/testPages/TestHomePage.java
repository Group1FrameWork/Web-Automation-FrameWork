package testPages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestHomePage extends HomePage {
    HomePage homePage;
    @BeforeMethod
    public void initializationOfElement() {
        TestLogger.log(getClass().getSimpleName()+": "+converToString((new Object(){}.getClass().getEnclosingMethod().getName())));
        homePage = PageFactory.initElements(driver, HomePage.class);
    }
//    @Test
//    public void testShowCostcoTitle(){
//        showCostcoTitle();
//    }
//    @Test
//    public void search(){
//        //driver.findElement(By.cssSelector("#search-field")).sendKeys("Table", Keys.ENTER);
//        HomePage hp1 = PageFactory.initElements(driver, HomePage.class);
//        hp1.getSearchResult("Table");
//    }
//    @Test()
//    public  void click(){
//        HomePage hp2 = PageFactory.initElements(driver, HomePage.class);
//        hp2.getclick();
//    }
//
//    @Test()
//    public  void click2() {
//        HomePage hp3 = PageFactory.initElements(driver, HomePage.class);
//        hp3.getAlldepartments();
//        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//    }
//    @Test()
//    public void testDropdownOfAll() {
//        List<String> text1 = new ArrayList<String>();
//        text1 = allDropdown();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        for (String e : text1) {
//            System.out.println(e);
//        }
//    }
//    @Test()
//    public void hoverPharmacy() {
//        WebElement element = HoverPharmacyElement;
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).perform();
//    }
//
//    @Test()
//    public void testHoverShopAllDepartments(){
//        hoverShopAllDepartments();
//    }
//
//    @Test()
//    public void testNavigate(){
//        navigateHardCoded();
//        navigateBack();
//        navigateBack();
//        navigateForward();
//        refreshPage();
//    }
//    @Test()
//    public void testCurrentURL(){
//        navigateHardCoded();
//        getCurrentPageUrl();
//    }
//
//    @Test()
//    public void testEnableStatusSearchBar(){
//        enableStatusSearchBar();
//    }
//    @Test()
//    public void testListOfStringOfAllDept(){
//        listOfStringOfAllDept();
//    }
//    @Test()
//    public void testDropDownOfAll(){
//        allDropDown2();
//    }
//    @Test()
//    public void testAllDept(){
//        selectOptionByVisibleText(AllInput,"Grocery");
//    }
//    @Test()
//    public void testTagName(){
//        tagName();
//    }
    @Test()
    public void testGetAllLinks(){
        getLinks();
    }
    @Test()
    public void testCostcoLogo(){
       logoValidation();
    }

}
