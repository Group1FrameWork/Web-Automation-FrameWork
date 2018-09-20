package Search;

import Main.HomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class homePageTest extends HomePage {

    //TC#1 => User is verifying that he is on the right page
    @Test
    public void verifyEbay(){
        boolean expected = true;
       boolean actual = driver.findElement((By.cssSelector("#gh-logo"))).isDisplayed();
        System.out.println(actual);

        Assert.assertEquals(actual,expected);
    }

    // TC#2 User is registering/signing up for eBay
    @Test
    public  void signUpForeBay() {
        clickOnCss("#gh-ug-flex > a");

        //typing the first name on the FirstName field

        typeByCss("#firstname", "Subhra");

        // typing the last name on the FirstName field

        typeByCss("#lastname","Roy");

        // typing the last name on the FirstName field

        typeByCss("#email","roysubhraroy1988@gmail.com");

        // typing the last name on the FirstName field

        typeByCss("#PASSWORD","Tanu01011988");

        // Click on Create account Button
        waitUntilClickAble(By.cssSelector("#ppaFormSbtBtn"));
        clickOnCss("#ppaFormSbtBtn");


    }
}