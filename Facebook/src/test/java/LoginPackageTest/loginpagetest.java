package LoginPackageTest;

import LoginPackage.loginpage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class loginpagetest extends loginpage {

    @Test //login with invalid email and valid password//
    public void invalidemailtest() throws InterruptedException {
        this.invalidemail("//*[@id=\"facebook\"]/body");

    }

    @Test//login with valid email and invalid password//
    public void invalidpasswordtest() throws InterruptedException {
        this.invalidpassword("//*[@id=\"facebook\"]/body");

    }
    @Test //login wit invalid email and invalid password//
    public void invalidemailpasswordtest() throws InterruptedException {
        this.invalidemailpassword("");
    }

    @Test //login wit valid email and valid password//
    public void validemailpasswordtest() throws InterruptedException {
        validemailpassword("//*[@id=\"u_0_2\"]");
        mouseHoverByCSS("#ariaAssertiveAlert");
     //@Test
   //  public void alerthandletest(){
       // alerthandle();


    }


}
    /*@Test
    public void statustest() throws InterruptedException {this.Status();}*/


