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
    public void clickWorld(){
       driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/header/div[4]")).click();
    }





}
