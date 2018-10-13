package search;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomeLone;
import pages.SignIn;
import reporting.TestLogger;

public class TestHomeLone extends HomeLone {
    HomeLone ElimentsOfHomeLone;
    @BeforeMethod
    public void ObjOfSignIn(){
        ElimentsOfHomeLone = PageFactory.initElements(driver,HomeLone.class);
    }

    @Test
    public void clickInHomePage (){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomeLone();}
}
