package base;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;
import reporting.ExtentManager;
import reporting.ExtentTestManager;
import org.openqa.selenium.chrome.ChromeDriver;
import reporting.TestLogger;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonAPI {
    //ExtentReport
    public static ExtentReports extent;
    @BeforeSuite
    public void extentSetup(ITestContext context) {
        ExtentManager.setOutputDirectory(context);
        extent = ExtentManager.getInstance();
    }
    @BeforeMethod
    public void startExtent(Method method) {
        String className = method.getDeclaringClass().getSimpleName();
        String methodName = method.getName().toLowerCase();
        ExtentTestManager.startTest(method.getName());
        ExtentTestManager.getTest().assignCategory(className);
    }
    protected String getStackTrace(Throwable t) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        return sw.toString();
    }
    @AfterMethod
    public void afterEachTestMethod(ITestResult result) {
        ExtentTestManager.getTest().getTest().setStartedTime(getTime(result.getStartMillis()));
        ExtentTestManager.getTest().getTest().setEndedTime(getTime(result.getEndMillis()));

        for (String group : result.getMethod().getGroups()) {
            ExtentTestManager.getTest().assignCategory(group);
        }

        if (result.getStatus() == 1) {
            ExtentTestManager.getTest().log(LogStatus.PASS, "Test Passed");
        } else if (result.getStatus() == 2) {
            ExtentTestManager.getTest().log(LogStatus.FAIL, getStackTrace(result.getThrowable()));
        } else if (result.getStatus() == 3) {
            ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");
        }
        ExtentTestManager.endTest();
        extent.flush();
        if (result.getStatus() == ITestResult.FAILURE) {
            captureScreenshot(driver, result.getName());
        }
        driver.quit();
    }
    @AfterSuite
    public void generateReport() {
        extent.close();
    }
    private Date getTime(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();
    }

    public static WebDriver driver = null;
    public String browserstack_username = "aliflailanabila1";
    public String browserstack_accesskey = "";
    public String saucelabs_username = "Subhra2018";
    public String saucelabs_accesskey = "4516433a-548c-47ff-aa2d-ea0c89dea812";

    public static void sleepFor(int sec) throws InterruptedException {
        Thread.sleep(sec * 1000);
    }

    public static void captureScreenshot(WebDriver driver, String screenshotName) {
        DateFormat df = new SimpleDateFormat("(MM.dd.yyyy-HH:mma)");
        Date date = new Date();
        df.format(date);

        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File(System.getProperty("user.dir") + "/screenshots/" + screenshotName + " " + df.format(date) + ".png"));
            System.out.println("Screenshot captured");
        } catch (Exception e) {
            System.out.println("Exception while taking screenshot " + e.getMessage());
        }

    }

    public static String convertToString(String st) {
        String splitString;
        splitString = StringUtils.join(StringUtils.splitByCharacterTypeCamelCase(st), ' ');
        return splitString;
    }

    //Handling New Tabs
    public static WebDriver handleNewTab(WebDriver driver1) {
        String oldTab = driver1.getWindowHandle();
        List<String> newTabs = new ArrayList<String>(driver1.getWindowHandles());
        newTabs.remove(oldTab);
        driver1.switchTo().window(newTabs.get(0));
        return driver1;
    }

    public static boolean isPopUpWindowDisplayed(WebDriver driver1, String locator) {
        boolean value = driver1.findElement(By.cssSelector(locator)).isDisplayed();
        return value;
    }

    @Parameters({"useCloudEnv", "cloudEnvName", "os", "os_version", "browserName", "browserVersion", "url"})
    @BeforeMethod
    public void setUp(@Optional("false") boolean useCloudEnv, @Optional("false") String cloudEnvName, @Optional("OS X") String os, @Optional("Sierra") String os_version, @Optional("chrome") String browsername, @Optional("69") String browserVersion, @Optional("https://www.eBay.com/") String url) throws Exception {
        //System.setProperty("webdriver.chrome.driver", "/Users/subhra/WebPageAutomation/Generic/Browser-Driver/chromedriver");
        if (useCloudEnv == true) {
            if (cloudEnvName.equalsIgnoreCase("browserstack")) {
                getCloudDriver(cloudEnvName, browserstack_username, browserstack_accesskey, os, os_version, browsername, browserVersion);
            } else if (cloudEnvName.equalsIgnoreCase("saucelabs")) {
                getCloudDriver(cloudEnvName, saucelabs_username, saucelabs_accesskey, os, os_version, browsername, browserVersion);
            }
        } else {
            getLocalDriver(os, browsername);
        }
        //driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();

    }

    public WebDriver getLocalDriver(@Optional("mac") String OS, String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            if (OS.equalsIgnoreCase("OS X")) {
                System.setProperty("webdriver.chrome.driver", "../Generic/Browser-Driver/chromedriver");
            } else if (OS.equalsIgnoreCase("Windows")) {
                System.setProperty("webdriver.chrome.driver", "../Generic/Browser-Driver/chromedriver.exe");
            }
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("chrome-options")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disabled-notifications");
            if (OS.equalsIgnoreCase("OS X")) {
                System.setProperty("webdriver.chrome.driver", "../Generic/Browser-Driver/chromedriver");
            } else if (OS.equalsIgnoreCase("Windows")) {
                System.setProperty("webdriver.chrome.driver", "../Generic/Browser-Driver/chromedriver.exe");
            }
            driver = new ChromeDriver(options);
        } else if (browserName.equalsIgnoreCase("firefox")) {
            if (OS.equalsIgnoreCase("OS X")) {
                System.setProperty("webdriver.gecko.driver", "../Generic/Browser-Driver/geckodriver");
            } else if (OS.equalsIgnoreCase("Windows")) {
                System.setProperty("webdriver.gecko.driver", "../Generic/Browser-Driver/geckodriver.exe");
            }
            driver = new FirefoxDriver();

        } else if (browserName.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", "../Generic/Browser-Driver/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        return driver;
    }

    public WebDriver getCloudDriver(String envName, String envUsername, String envAccessKey, String os, String os_version, String browserName, String browserVersion) throws IOException {
        /*DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("browser", browserName);
        cap.setCapability("browser_version", browserVersion);
        cap.setCapability("os", os);
        cap.setCapability("os_version", os_version);*/
        DesiredCapabilities cap = null;
        if (envName.equalsIgnoreCase("Saucelabs")) {
            cap = getSauceLabsPlatform(os,os_version,browserName,browserVersion);
            driver = new RemoteWebDriver(new URL("http://" + envUsername + ":" + envAccessKey + "@ondemand.saucelabs.com:80/wd/hub"), cap);
        } else if (envName.equalsIgnoreCase("Browserstack")) {
            cap = getBrowserStackPlatform(os,os,browserName,browserVersion);
            driver = new RemoteWebDriver(new URL("http://" + envUsername + ":" + envAccessKey +
                    "@hub-cloud.browserstack.com/wd/hub"), cap);
        }
        return driver;
    }

    public static DesiredCapabilities getSauceLabsPlatform(String OS, String OS_Version, String browserName, String browserVersion){
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform",OS);
        caps.setCapability("version", "60.0");
        caps.setCapability("screenResolution","1024x768");
        return caps;
    }
    public static DesiredCapabilities getBrowserStackPlatform(String OS, String OS_Version, String browserName, String browserVersion){
        DesiredCapabilities cap =   new DesiredCapabilities();
        cap.setCapability("browser",browserName);
        cap.setCapability("browser_version",browserVersion);
        cap.setCapability("os",OS);
        cap.setCapability("os_version",OS_Version);
        cap.setCapability("resolution","1024x768");
        return cap;
    }


    @AfterMethod
    public void cleanUp()throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();
    }
    public void clickOnCss(String locator) throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(By.cssSelector(locator)).click();
    }

    public void clickOnLinkText(String locator) {
        driver.findElement(By.linkText(locator)).click();
    }

    public void clickByXpath(String locator)throws NullPointerException {

        driver.findElement(By.xpath(locator)).click();
    }

    public void clickOnElement(String locator) {
        try {
            driver.findElement(By.cssSelector(locator)).click();
        } catch (Exception ex1) {
            ex1.printStackTrace();
        }
        try {
            driver.findElement(By.xpath(locator)).click();
        } catch (Exception ex2) {
            ex2.printStackTrace();
        }
        try {
            driver.findElement(By.id(locator)).click();
        } catch (Exception ex3) {
            ex3.printStackTrace();
        }
        try {
            driver.findElement(By.className(locator)).click();
        } catch (Exception ex4) {
            ex4.printStackTrace();
        }
    }

    public void typeOnCss(String locator, String value) {
        driver.findElement(By.cssSelector(locator)).sendKeys(value);
    }

    public void typeOnInputField(String locator, String value) {
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            driver.findElement(By.id(locator)).sendKeys(value);
        } catch (Exception ex1) {
            ex1.printStackTrace();
        }
    }

    public void typeByCss(String locator, String value) {

        driver.findElement(By.cssSelector(locator)).sendKeys(value);
    }

    public void typeByCssNEnter(String locator, String value) {
        driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
    }

    public void typeByXpath(String locator, String value) {

        driver.findElement(By.xpath(locator)).sendKeys(value);
    }

    public void takeEnterKeys(String locator) {
        driver.findElement(By.cssSelector(locator)).sendKeys(Keys.ENTER);
    }

    public void clearInputField(String locator) {
        driver.findElement(By.cssSelector(locator)).clear();
    }

    public List<WebElement> getListOfWebElementById(String locator) {
        List<WebElement> list = new ArrayList<WebElement>();
        list = driver.findElements(By.id(locator));
        return list;
    }

    public List<String> getTextFromWebElements(String locator) {
        List<WebElement> element = new ArrayList<WebElement>();
        List<String> text = new ArrayList<String>();
        element = driver.findElements(By.cssSelector(locator));
        for (WebElement web : element) {
            String st = web.getText();
            text.add(st);
        }
        return text;
    }

    public List<WebElement> getListOfWebElementsByCss(String locator) {
        List<WebElement> list = new ArrayList<WebElement>();
        list = driver.findElements(By.cssSelector(locator));
        return list;
    }

    public List<WebElement> getListOfWebElementsByXpath(String locator) {
        List<WebElement> list = new ArrayList<WebElement>();
        list = driver.findElements(By.xpath(locator));
        return list;
    }

    public String getTextByCss(String locator) {
        String st = driver.findElement(By.cssSelector(locator)).getText();
        System.out.println(st);
        return st;
    }

    public String getTextByXpath(String locator) {
        String st = driver.findElement(By.xpath(locator)).getText();
        System.out.println(st);
        return st;
    }

    public String getTextById(String locator) {
        String st = driver.findElement(By.id(locator)).getText();
        System.out.println(st);
        return st;
    }

    public String getTextByName(String locator) {
        String st = driver.findElement(By.name(locator)).getText();
        System.out.println(st);
        return st;
    }

    public String getCurrentPageUrl() {
        String url = driver.getCurrentUrl();
        return url;
    }

    public void navigateBack() {
        driver.navigate().back();
    }

    public void navigateForward() {
        driver.navigate().forward();
    }

    public List<String> getListOfString(List<WebElement> list) {
        List<String> items = new ArrayList<String>();
        for (WebElement element : list) {
            items.add(element.getText());
        }
        return items;
    }

    public void selectOptionByVisibleText(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }

    public void mouseHoverByCSS(String locator) {
        try {
            WebElement element = driver.findElement(By.cssSelector(locator));
            Actions action = new Actions(driver);
            action.moveToElement(element).perform();
        } catch (Exception ex) {
            System.out.println("First attempt has been done, This is second try");
            WebElement element = driver.findElement(By.cssSelector(locator));
            Actions action = new Actions(driver);
            action.moveToElement(element).perform();
        }
    }

    public void mouseHoverByLinkText(String locator) {
        try {
            WebElement element = driver.findElement(By.linkText(locator));
            Actions action = new Actions(driver);
            action.moveToElement(element).perform();
        } catch (Exception ex) {
            System.out.println("First attempt has been done, This is second try");
            WebElement element = driver.findElement(By.linkText(locator));
            Actions action = new Actions(driver);
            action.moveToElement(element).perform();
        }
    }

    public void mouseHoverByXpath(String locator) {
        try {
            WebElement element = driver.findElement(By.xpath(locator));
            Actions action = new Actions(driver);
            Actions hover = action.moveToElement(element);
            hover.clickAndHold();
        } catch (Exception ex) {
            System.out.println("First attempt has been done, This is second try");
            WebElement element = driver.findElement(By.xpath(locator));
            Actions action = new Actions(driver);
            action.moveToElement(element).perform();
        }
    }
    // Handling Alert
    public void okAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void cancelAlert() {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    //iFrame Handle
    public void iframeHandle(WebElement element) {

        driver.switchTo().frame(element);
    }

    public void goBackToHomeWindow() {

        driver.switchTo().defaultContent();
    }

    //get Links
    public void getLinks(String locator) {
        driver.findElement(By.linkText(locator)).findElement(By.tagName("a")).getText();
    }

    //Taking Screen shots
    public void takeScreenShot() throws IOException {
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("screenShots.png"));
    }

    //Synchronization
    public void waitUntilClickAble(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void waitUntilVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitUntilSelectable(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        boolean element = wait.until(ExpectedConditions.elementToBeSelected(locator));
    }

    public void upLoadFile(String locator, String path) {
        driver.findElement(By.cssSelector(locator)).sendKeys(path);
        /* path example to upload a file/image
           path= "C:\\Users\\rrt\\Pictures\\ds1.png";
         */
    }

    public void clearInput(String locator) {

        driver.findElement(By.cssSelector(locator)).clear();
    }

    public void keysInput(String locator) {

        driver.findElement(By.cssSelector(locator)).sendKeys(Keys.ENTER);
    }

    public void typeOnInputBox(String locator, String value) {
        try {
            driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
        } catch (Exception ex1) {
            System.out.println("ID locator didn't work");
        }
        try {
            driver.findElement(By.name(locator)).sendKeys(value, Keys.ENTER);
        } catch (Exception ex2) {
            System.out.println("Name locator didn't work");
        }
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
        } catch (Exception ex3) {
            System.out.println("CSS locator didn't work");
        }
    }
    //switch tabs
    public void switchTabs(Integer toClose, Integer toKeep) {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(toClose));
        driver.close();
        driver.switchTo().window(tabs.get(toKeep));
    }
    public void inputValueInTextBoxByWebElement(WebElement webElement, String value){
        webElement.sendKeys(value + Keys.ENTER);
    }
    public String getTextByWebElement(WebElement webElement){
        String text = webElement.getText();
        return text;
    }
    public void clearInputBox(WebElement webElement){
        webElement.clear();
    }
    public void SendKeys(WebElement element, String keys, String elementName){
        TestLogger.log("Sending Keys to " + elementName);
        element.sendKeys(keys);
        TestLogger.log("Keys Sent Successfully to "+ elementName);
    }
    public void typeByXpathNEnter(String locator, String value) {
        driver.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER);
    }
    //clear Input
    public void clearInputByXpath(String locator) {
        driver.findElement(By.xpath(locator)).clear();
    }


    public String getText(String locator) {
        try {
            String st = driver.findElement(By.xpath(locator)).getText();
            System.out.println("Locator found by ID");
            System.out.println(st);

        } catch (Exception ex1) {
            System.out.println("Locator can't be found by ID");
        }
        try {
            String st = driver.findElement(By.cssSelector(locator)).getText();
            System.out.println("Locator found by CSS");
            System.out.println(st);
            return st;
        } catch (Exception ex2) {
            System.out.println("Locator can't be found by CSS");
        }
        try {
            String st = driver.findElement(By.xpath(locator)).getText();
            System.out.println("Locator found by xpath");
            System.out.println(st);
            return st;
        } catch (Exception ex3) {
            System.out.println("Locator can't be found by xpath");
        }
        return locator;
    }


    public void navigateHardCoded() {
        driver.navigate().to("https://www.costco.com");
        driver.navigate().to("https://www.costco.com/LogonForm");
        driver.navigate().to("https://www.costcophotocenter.com/Home?utm_source=costco.com&utm_medium=referral&utm_campaign=Costco.com%20Navigation%20Bar&utm_term=Photo%20Main&utm_content=Photo");
    }

    public static String showTitle(WebDriver driver) {
        String title = driver.getTitle();
        return title;
    }

    public static boolean isEnableStatus(WebDriver driver, WebElement web) {
        boolean en = web.isEnabled();
        System.out.println(en);
        return en;
    }
    public void isDisplayedStatus(WebElement element) {
        boolean value = element.isDisplayed();
        System.out.println(value);
    }
    public void getSizeOfElement(WebElement element) {
        Dimension dimension = element.getSize();
        System.out.println("Width of element: " + dimension.width);
        System.out.println("Height of element: " + dimension.height);
    }
    public String converToString(String st){
        String splitString ;
        splitString = StringUtils.join(StringUtils.splitByCharacterTypeCamelCase(st), ' ');
        System.out.println(splitString);
        return splitString;
    }

    public void isSelectedStatus(WebElement element) {
        boolean value = element.isSelected();
        System.out.println(value);
    }
    //clear Input
    public void clearInputByXpath1(String locator) {
        driver.findElement(By.xpath(locator)).clear();
    }
    public void clickOnLinkCSS(String locator) {
        driver.findElement(By.cssSelector(locator)).click();
    }
}
