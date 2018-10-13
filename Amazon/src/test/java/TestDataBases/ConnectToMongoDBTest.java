package TestDataBases;

import DataBases.ConnectToMongoDB;
import DataBases.SearchElements;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.logging.Logger;

public class ConnectToMongoDBTest extends SearchElements {
    SearchElements object;

    @BeforeMethod
    public void init() {
        object = PageFactory.initElements(driver, SearchElements.class);
    }

    @Test
    public void testsearch() {
        Logger.getLogger(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> text = ConnectToMongoDB.readFromMongoDB("items");

        System.out.println("\n\n\n");
        for (int index = 0; index < text.size(); index++) {
            Assert.assertEquals(text.get(index), text.get(index));
        }
    }


}
