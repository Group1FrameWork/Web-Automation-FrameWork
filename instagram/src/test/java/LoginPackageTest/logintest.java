package LoginPackageTest;

import LoginPackage.login;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class logintest extends login {

    @Test()
    public void lginfbtest() throws InterruptedException {
        loginwithvalid();
        Thread.sleep(3000);
        getinwithvalid();
    }
    @Test
    public void findsometest(){
        loginwithvalid();
        getinwithvalid();
        this.findsomeone();
    }





}
