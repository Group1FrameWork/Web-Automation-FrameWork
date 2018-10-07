package testKeyWordDriven;

import KeyWordDriven.Features;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestFeatures extends Features {
    Features features;
    @BeforeMethod
    public void initializeObjects(){
        features = PageFactory.initElements(driver, Features.class);
    }
    @Test
    public void testSignInWithInvalidIdAndPassword() throws IOException, InterruptedException {
        features.selectFeature();
    }
}

