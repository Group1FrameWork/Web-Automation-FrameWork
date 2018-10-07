package HomePageTest;

import HomePageFunction.IhomePage;
import org.testng.annotations.Test;

public class IhomePagetest extends IhomePage {

    @Test
    public void homepagetest(){this.homepage();}
    @Test
    public void loginbuttontest(){this.loginbutton("#react-root");}
    @Test
    public void signupnuttontest(){this.signupbutton("#ssfErrorAlert");}
    @Test
    public void termbuttontest(){this.termbutton("#helpCenterRootID");}




}

