package productsPageObjects;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends CommonAPI {
    @FindBy(xpath = "/html//input[@id='email']")
    private WebElement email;
    @FindBy(xpath = "//form[@id='footerReceiveSpecialOffersForm']/input[@title='Sign Up']")
    private WebElement signUPbody;
    @FindBy(xpath = "sleepFor(3);")
    private WebElement tickONhealthclinic;



    public void Medinesearch() throws InterruptedException {

        System.out.println("Medicine Page Title: " + driver.getTitle());

        email.sendKeys("kiranrazu@gmail.com");
        signUPbody.click();
        switchWindow(driver);
        sleepFor(2);

        waitUntilClickAble(tickONhealthclinic);
        tickONhealthclinic.click();
    }
}



