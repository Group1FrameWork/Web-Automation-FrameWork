package HomePageFunction;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class homepage extends CommonAPI {
    public void homepage() {
        boolean expected = true;
        boolean actual = driver.findElement(By.cssSelector("#react-root > section > main > article > div.rgFsT > div:nth-child(1) > h1")).isDisplayed();
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
    }
    public void loginbutton(String locator) {
        driver.findElement(By.cssSelector("#react-root > section > main > article > div.rgFsT > div:nth-child(2) > p > a")).sendKeys(Keys.ENTER);
    }

    public void signupbutton(String locator){
        driver.findElement(By.cssSelector("#react-root > section > main > article > div.rgFsT > div:nth-child(1) > div > form > div:nth-child(8) > span > button")).sendKeys(Keys.ENTER);
    }
    public void termbutton(String locator){
        driver.findElement(By.cssSelector("#react-root > section > main > article > div.rgFsT > div:nth-child(1) > div > form > p > a:nth-child(1)")).sendKeys(Keys.ENTER);
    }


    /*
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
    }*/


}
