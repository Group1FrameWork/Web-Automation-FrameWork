package LoginPackage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Ilogin extends CommonAPI {

    //Login with invalid id and password
    public void loginwithinvalid() {
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/article/div[2]/div[1]/div/form/span/button")).sendKeys(Keys.ENTER);
    }
    public void getinwithinvalid(){
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("1225997676");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("kiki",Keys.ENTER);
        //driver.switchTo().window("fb_content clearfix ");
    }

   //Login with valid id and password
    public void loginwithvalid() {
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/article/div[2]/div[1]/div/form/span/button")).sendKeys(Keys.ENTER);
    }
    public void getinwithvalid(){
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("6469825965");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("kirankitzy",Keys.ENTER);
     //driver.switchTo().window("fb_content clearfix ");
    }
    public void findsomeone(){
        driver.findElement(By.cssSelector("#react-root > section > nav > div._8MQSO.Cx7Bp > div > div > div.LWmhU._0aCwM > div > div")).click();
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[2]/input")).sendKeys("issy", Keys.ENTER);

    }

}
