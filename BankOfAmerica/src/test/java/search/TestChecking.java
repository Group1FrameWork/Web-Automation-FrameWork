package search;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.Checking;

public class TestChecking extends Checking {


    @Test
    public void clickChecking(){
        Checking checking = PageFactory.initElements(driver,Checking.class);
        checking.getclicInChecking();


    }

}
