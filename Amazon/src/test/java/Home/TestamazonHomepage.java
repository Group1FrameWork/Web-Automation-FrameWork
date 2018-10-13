package Home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.amazonhomepage;

public class TestamazonHomepage extends CommonAPI {
    @Test
    public void  testSearchUP(){
       amazonhomepage amazonHome = PageFactory.initElements(driver, amazonhomepage.class );
            amazonHome.searchUP("Megaman Battlenework 3 ");

        }
}
