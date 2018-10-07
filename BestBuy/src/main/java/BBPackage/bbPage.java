package BBPackage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class bbPage extends CommonAPI {



    public void popUP() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"modal971\"]"));
        /*driver.findElement(By.xpath("//*[@id=\"emailId\"]")).sendKeys("ismayatikiran96@gmail.com", Keys.ENTER);
        Thread.sleep(3000);
        clickByXpath("//*[@id=\"emailSubmissionId\"]/div/div[2]/div/input");*/
    }

    @FindBy(xpath = "//*[@id=\"menu0\"]")
    public static WebElement Products;
    @FindBy(xpath = "//*[@id=\"menu1\"]")
    public  static WebElement Brands;
    @FindBy(xpath = "//*[@id=\"menu2\"]")
    public static WebElement Deals;
    @FindBy(xpath = "//*[@id=\"menu3\"]")
    public static WebElement Services;


    @FindBy (xpath = "//*[@id=\"gh-search-input\"]")
    public static WebElement search;
    public void search() {
        search.sendKeys("iPhone", Keys.ENTER);


    }
}


