package search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.SearchPages;

public class InputSearch extends CommonAPI {

    @Test
    public  void Pages(){
        SearchPages searchPages = PageFactory.initElements(driver,SearchPages.class);
        searchPages.setSearchPages();

    }
    /*public void search() throws InterruptedException {
        driver.findElement(By.cssSelector("#nav-search-query")).sendKeys("mobile banking",Keys.ENTER);
        Thread.sleep(5000);
    }*/

    /*@Test
    public void Checking() throws InterruptedException {
        driver.findElement(By.cssSelector("#navChecking > span.title")).click();
        Thread.sleep(5000);

    }*/
}

