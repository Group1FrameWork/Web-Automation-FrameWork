package triggerTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.featureOfProduct.Trigger;
import java.io.IOException;
public class TestTrigger extends Trigger {
    Trigger trigger;
    @BeforeMethod
    public void initializationOfElement() {
        trigger = PageFactory.initElements(CommonAPI.driver, Trigger.class);
    }
    @Test
    public void testSelectFeature() throws IOException, InterruptedException {
        trigger.selectFeature();
    }
}
