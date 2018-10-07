package LoginPackageTest;

import LoginPackage.Ilogin;
import org.testng.annotations.Test;

public class Ilogintest extends Ilogin {

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
