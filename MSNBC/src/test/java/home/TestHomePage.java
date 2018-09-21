package home;

import base.CommonAPI;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {

    @Test
    public void homeUrl(){
        getCurrentPageUrl();
        navigateForward();
    }
}
