package search;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SignIn;

public class TestSignIn extends SignIn {

    SignIn ElimentsOgSignIn;
    @BeforeMethod
    public void ObjOfSignIn(){
        ElimentsOgSignIn = PageFactory.initElements(driver,SignIn.class);

    }


    @Test
    public void clickSignIn (){ClickInSignIn();}


}
