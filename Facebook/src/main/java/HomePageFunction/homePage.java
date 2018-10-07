package HomePageFunction;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class homePage extends CommonAPI {

    public void homepage() {
        driver.findElement(By.xpath("//*[@id=\"facebook\"]"));
    }
    public void loginbutton(String locator) {
        driver.findElement(By.cssSelector("#u_0_2")).sendKeys(Keys.ENTER);
    }
    public void forgotaccountbutton() {
        driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[3]/td[2]/div/a"));
    }
    public void checkFemalebox(String locator) {
        driver.findElement(By.cssSelector("#u_0_9")).click();
    }
    public void checkMalebox(String locator) {
        driver.findElement(By.cssSelector("#u_0_a")).click();
    }

    public void signup(String locator){
        driver.findElement(By.cssSelector("#u_0_u")).click();
    }
    public void createpage(String locator){
        driver.findElement(By.cssSelector("#reg_pages_msg > a"));
    }

    //hidden bars implemented test method
   public void undername(){driver.findElement(By.xpath("//*[@id=\"u_0_b\"]/i[1]"));
    }
    public void underlastname(){driver.findElement(By.xpath("//*[@id=\"u_0_a\"]/i[1]"));
    }
    public void MobilenumberandEmail(String locator) {
       driver.findElement(By.cssSelector("#u_0_h")).click();
    }
    public void newpasswordbox(String locator){
        driver.findElement(By.cssSelector("#u_0_o")).click();
    }
}

