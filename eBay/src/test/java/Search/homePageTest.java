package Search;

import MainPage.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class homePageTest extends HomePage {

    //TC#1 => User is verifying that he is on the right page
    @Test
    public void verifyEbay(){
        boolean expected = true;
       boolean actual = driver.findElement((By.cssSelector("#gh-logo"))).isDisplayed();
        System.out.println(actual);

        Assert.assertEquals(actual,expected);
    }
//TC#2 User can search any thing on the home page
    @Test
    public void searchItems() throws IOException {
HomePage homePage = PageFactory.initElements(driver, HomePage.class);
homePage.searchItemsAndSubmitButton();

    }

    //TC#3 Get all the list from  all categories
    @Test
    public void getCategories(){
        mouseHoverByCSS("#gh-cat");
        viewMultipleByCSS();
    }

    //TC#4
}