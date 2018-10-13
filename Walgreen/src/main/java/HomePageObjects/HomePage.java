package HomePageObjects;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {

    @FindBy(xpath = "/html//input[@id='ntt-placeholder']")
    public static WebElement searchBox;
    @FindBy(xpath = "//li[@id='storelocatorlink']/a[@href='javascript:void(0)']")
    public static WebElement LocationOption;
    @FindBy(xpath = "/html//input[@id='storelocatorPreviewInput']")
    public static WebElement LocationSearchbox;
    @FindBy(xpath = "/html//button[@id='wag-store-locator-findStorepreview']")
    public static WebElement LocationsearchButton;
    @FindBy(xpath = "//section[@id='wag-header-mobile-slider']/nav//a[@title='Rx Refills']/span[.='Rx Refills']")
    public static WebElement RxRefills;
    @FindBy(partialLinkText = "Refill Prescriptions")
    public static WebElement refillPrescription;


    /* @FindBy(partialLinkText = "Your account")
     public static WebElement yourAccount;*/
    @FindBy(css = ".NewExp_signin .wag-NewExp-or:nth-of-type(1)")
    public static WebElement signIn;
    @FindBy(css = "[src='\\/images\\/adaptive\\/sp\\/798683_GlobalNav_613x80\\.png']")
    public static WebElement shopnow;
    @FindBy(css = "//*[@id=\"cartFocus\"]/a[1]")
    public static WebElement shopingcart;
    @FindBy(partialLinkText = "Home")
    public static WebElement homebutton;
    @FindBy(partialLinkText = "Shop")
    public static WebElement shopbutton;
    @FindBy(partialLinkText = "Health Info & Services")
    public static WebElement healthNinfo;
    @FindBy(partialLinkText = "Find Care Now")
    private WebElement findCarenow;
    @FindBy(xpath = "//*[@id=\"wag-store-filters-btn\"]")
    private WebElement filtremyCondition;
    @FindBy(xpath = "//div[@id='wagHeaderLogo']//img[@alt='Walgreens: Trusted since 1901']")
    private WebElement logo;
    @FindBy(xpath = "[ng-controller] .pt25:nth-of-type(4) [class='col-lg-3 col-md-3 col-sm-3 col-xs-12 mt10']:nth-of-type(2) .hidden-xs")
    private WebElement Naturebountyvitamins;

    //After sign under MyAccount this location shall be available
    @FindBy(xpath = "//*[@id=\"NewExpVersion_A_UserValue\"]/a/span[2]")
    public static WebElement HiKiran;
    //Login Page
    @FindBy(xpath = "/html/body")
    public static WebElement Loginpage;
    @FindBy(xpath = "//*[@id=\"continueBtn\"]")
    public static WebElement Loginbox;
    @FindBy(css = "/html//button[@id='continueBtn']")
    public static WebElement loginContinuebutton;

    @FindBy(xpath = "//*[@id=\"menu-healthinfo\"]/a")
    public static WebElement HealthInfo;
    @FindBy(xpath = "//*[@id=\"menu-cl\"]/a")
    public static WebElement ContactLenses;
    @FindBy(xpath = "//*[@id=\"menu-shop-products\"]/a")
    public static WebElement Shop;
    @FindBy(xpath = "//*[@id=\"menu-photo\"]/a")
    public static WebElement Photo;
    @FindBy(xpath = "//*[@id=\"menu-weeklyad\"]/a")
    public static WebElement WeeklyAdCoupons;
    @FindBy(xpath = "//*[@id=\"menu-br\"]/a")
    public static WebElement BalanceRewards;
    @FindBy(xpath = "//*[@id=\"walgreens_care_connect\"]")
    public static WebElement HealthCare;

    //1-WAL Home Page URL
    public void getPage() {
        String url = driver.getCurrentUrl();
        System.out.println("Home Page title: " + driver.getTitle());
        return;
    }
    //2-WAL Searchplaces
    public void searchplaces() {
        LocationOption.click();
        LocationSearchbox.sendKeys("11101");
        LocationsearchButton.click();
    }
    //3-WAL Searchproduct
    public void searchproduct() {
        searchBox.sendKeys("advil", Keys.ENTER);
        String title = driver.getTitle();
        System.out.println("Get Product Search Page Title: " + title);
        return;
    }
    //4-WAL Mousehover
    public void mouesehover() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(HealthInfo).perform();
        Thread.sleep(3000);
        actions.moveToElement(HealthCare).click().perform();
        RxRefills.click();
    }
    //5-WAL ClicksingIN
    public void clikSignIn() throws InterruptedException {
        sleepFor(2);
        Loginpage.click();
        sleepFor(1);
        Loginbox.click();
        sleepFor(2);
        loginContinuebutton.click();
    }
    public String rxrefills() {
        //hover over Categories. Hover in multiple windows.
        Actions act = new Actions(driver);
        act.moveToElement(RxRefills).moveToElement(refillPrescription).build().perform();
        refillPrescription.click();
        switchWindow(driver);
        String url = driver.getCurrentUrl();
        return url;
    }
}

