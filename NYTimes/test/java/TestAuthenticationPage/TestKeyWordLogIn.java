package TestAuthenticationPage;

import AuthenticationPage.KeyWordLogIn;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestKeyWordLogIn extends CommonAPI {
    KeyWordLogIn keyWordLogIn;

    @BeforeMethod
    public void initialization() {
        keyWordLogIn = PageFactory.initElements(driver, KeyWordLogIn.class);

    }

    @Test
    public void testLogIn() throws IOException, InterruptedException {
        keyWordLogIn.loginByKeyword();
    }

    }

