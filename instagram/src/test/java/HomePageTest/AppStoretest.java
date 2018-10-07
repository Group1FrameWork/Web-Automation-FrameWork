package HomePageTest;

import HomePageFunction.AppStore;
import org.testng.annotations.Test;

public class AppStoretest extends AppStore {
    @Test
    public void appstorebutoontest(){
        this.appstorebutton("html");
    }
}
