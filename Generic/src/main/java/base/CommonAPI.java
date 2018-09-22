package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public WebDriver driver = null;
    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","/Users/fahmida/IdeaProjects/automation/Generic/browser-driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://www.bankofamerica.com");
    }
    @AfterMethod
    public void cleanUp(){
        //driver.close();
    }//NAVIGATION
    public void navigateBack(){driver.navigate().back();}
    public  void  navigateForward(){driver.navigate().forward();}
    public  void  refresh(){driver.navigate().forward();}

    public void selectByVisibletext(WebElement element,String value){
        Select select = new Select(element);
       select.selectByVisibleText(value);

    }
    public String getCurrentPageUrl(){
        String url = driver.getCurrentUrl();
        System.out.println(url);
        return  url;
    }

}
