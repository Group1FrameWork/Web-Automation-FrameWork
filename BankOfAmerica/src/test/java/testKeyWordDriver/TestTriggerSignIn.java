package testKeyWordDriver;

import base.CommonAPI;
import keyWordDriver.TriggerTheSingIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.IOException;

public class TestTriggerSignIn extends TriggerTheSingIn {
    TriggerTheSingIn triggerTheSingIn;
    @BeforeMethod
    public void initializationOfElement() {
        triggerTheSingIn = PageFactory.initElements(driver, TriggerTheSingIn.class);
    }
    @Test
    public void testSelectFeature() throws IOException, InterruptedException {
       triggerTheSingIn.selectFeature();
    }
}
