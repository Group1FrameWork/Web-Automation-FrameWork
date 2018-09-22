package LoginPackage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class loginpage extends CommonAPI {


    //login to the page with invalid email and valid password
    public void invalidemail(String locator)throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ismayatk@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("kirankitzy", Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"facebook\"]/body"));
        Thread.sleep(5000);
    }
    //login to the page with valid email and invalid password
    public void invalidpassword(String locator) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ismayatkiran96@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("kiran96",Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"facebook\"]/body"));
        Thread.sleep(5000);
    }
    //login to the page with invalid email and invalid password
    public void invalidemailpassword(String locator) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ismayat@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("kiran96",Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"facebook\"]/body"));
        Thread.sleep(5000);
    }

 //login to the page with valid email and valid password
    public void validemailpassword(String locator) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ismayatkiran96@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("kirankitzy",Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"facebook\"]/body"));
        Thread.sleep(5000);
    }
    public void alerthandle() {
        driver.findElement(By.xpath("/*[@id=\"ariaAssertiveAlert\"]"));
    }

    }




   /* protected void Status() throws InterruptedException {
       // Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"js_h\"]")).sendKeys("Kiran is Happy");
        driver.findElement(By.xpath("//*[@id=\"js_ba\"]/div[2]/div[3]/div[2]/div/div/span/button")).click();*/














