package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {

    @Test
    public void homeUrl(){
        getCurrentPageUrl();
    }
    @Test
    public void clickONPlay(){
       driver.findElement(By.xpath("//html/body/div/div/div[7]/div/div/div[3]/div[1]/section[1]/div[2]/span")).click();
    }





}
