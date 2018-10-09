package TestFront;

import Front.NextPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class TestNextPage extends CommonAPI {

    NextPage nextPage;

    @BeforeMethod
    public void init() {
        nextPage = PageFactory.initElements(driver, NextPage.class);
    }
     /*public void searchBar1() {
        searchClick.click();
        Actions action = new Actions(driver);
        action.moveToElement(searchBar).click().perform();
        //driver.findElement(By.cssSelector(".css-l8ph0q.e1f9nlu41")).sendKeys("sports", Keys.ENTER);
        searchBar.sendKeys("sports", Keys.ENTER);
        String Expected = "sports";
        String Actual = driver.findElement(By.cssSelector("#searchTextField")).getText();
        Assert.assertEquals(Actual,Expected);
    }*/



}

