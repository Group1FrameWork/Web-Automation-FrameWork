package LoginPackage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class loginPage extends CommonAPI {


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

       // WebDriver driver =new InternetExplorerDriver();
      //  driver.get("http://ismayati kiru:Kirankitzy996@facebook.com/");
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ismayatikiran96@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Kirankitzy996",Keys.ENTER);

        Thread.sleep(5000);
        clickByXpath("//*[@id=\"u_0_a\"]/div[1]/div[1]/div/a/span/span");
       // WillCloseWhenClosed;

    //public void alerthandle() {
        // driver.findElement(By.xpath("/*[@id=\"ariaAssertiveAlert\"]"));
    }

    public void checknotification(String locator){
        driver.findElement(By.cssSelector("#js_x > div")).click();

    }

    /*@AfterMethod
    public void cancelAlert() {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }*/


}














