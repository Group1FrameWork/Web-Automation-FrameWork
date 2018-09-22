package HomePageTest;

import HomePageFunction.homepage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class homepagetest extends homepage {

    @Test
    public void homepagetest(){this.homepage();}
    @Test
    public void loginbuttontest(){this.loginbutton("#react-root");}
    @Test
    public void signupnuttontest(){this.signupbutton("#ssfErrorAlert");}
    @Test
    public void termbuttontest(){this.termbutton("#helpCenterRootID");}

/*
    @Test
    public void forgotbuttontest(){this.forgotaccountbutton();}

    @Test
    public void checkFemaleboxtest(){this.checkFemalebox("#u_0_s > span:nth-child(1) > label");}
    @Test
    public void checkMaleBoxtest(){this.checkMalebox("#u_0_s > span:nth-child(2) > label");}
    @Test
    public void signuptest(){this.signup("#u_0_v");}
    @Test
    public void createpagetest(){this.createpage("body");}
    //hidden bars test
    @Test
    public void undernametest(){ this.undername();}
    @Test
    public void underlastnametest(){ this.undername();}
    @Test
    public void MobilenumberandEmailtest(){this.MobilenumberandEmail("#u_0_g > i._5dbc.img.sp_6E_d5dmi7E6.sx_f40ac8");}
    @Test
    public void newpasswordbostest(){this.newpasswordbox("#u_0_n > i._5dbc.img.sp_6E_d5dmi7E6.sx_f40ac8");}*/


}

