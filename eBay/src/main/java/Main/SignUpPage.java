package Main;

import base.CommonAPI;
import org.openqa.selenium.By;

public class SignUpPage extends CommonAPI {

    //Creating an account
    public void createAnAccount(){

        clickOnCss("#gh-ug-flex > a");

        //typing the first name on the FirstName field

        clickOnCss("#firstname");
        typeByCss("#firstname", "Subhra");

        // typing the last name on the FirstName field
        clickOnCss("#lastname");
        typeByCss("#lastname", "Roy");

        // typing the last name on the FirstName field
        clickOnCss("#email");
        typeByCss("#email", "roysubhraroy1988@gmail.com");

        // typing the last name on the FirstName field
        clickOnCss("#PASSWORD");

        typeByCss("#PASSWORD", "Tanu01011988");

        // Click on Create account Button
        waitUntilClickAble(By.cssSelector("#ppaFormSbtBtn"));
        clickOnCss("#ppaFormSbtBtn");

        // replace your account
        clickOnCss("#reginter");

    }

}
