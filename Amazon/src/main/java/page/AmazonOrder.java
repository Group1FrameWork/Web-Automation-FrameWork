package page;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AmazonOrder extends CommonAPI{
    @FindBy(how = How.XPATH, using = ".//*[@id='nav-orders']/span[2]")
    public static WebElement Order;
    @FindBy(how = How.XPATH, using = ".//*[@id='ap_email']")
    public static WebElement Email;
    @FindBy(how = How.XPATH, using = ".//*[@id='ap_password']")
    public static WebElement passwordBox;
    @FindBy(how = How.XPATH, using = ".//*[@id='signInSubmit']")
    public static WebElement SignIn;

    public void clickOnorder(){
        Order.click();
    }
    public void SignInAmazon(String email,String password){
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[2]")).click();
       Email.sendKeys(email);
       driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
       passwordBox.sendKeys(password);
       SignIn.click();
    }
}
