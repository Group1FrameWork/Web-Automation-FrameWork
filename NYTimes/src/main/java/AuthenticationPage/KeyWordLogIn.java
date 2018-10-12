package AuthenticationPage;

import DataBases.DBExcel;
import Front.FrontPage;
import base.CommonAPI;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;

import java.io.IOException;

public class KeyWordLogIn extends CommonAPI {

    FrontPage frontPage = PageFactory.initElements(CommonAPI.driver, FrontPage.class);
    LogInPage logInPage = PageFactory.initElements(CommonAPI.driver,LogInPage.class);
    DBExcel dbExcel =PageFactory.initElements(CommonAPI.driver,DBExcel.class);

    public void clickLogIn(){
        logInPage.clickSignIn();
    }
    public void logIn() throws InterruptedException {
        logInPage.logInPage();
    }

    public void selectAction(String featureName) throws IOException, InterruptedException {
        switch (featureName) {
            case "ClickLogIn":
                clickLogIn();
                break;
            case "Login":
               logIn();
                break;
            default:
                throw new InvalidArgumentException("Invalid feature choice");
        }
    }

    public void loginByKeyword() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String[] keyword = dbExcel.getDataFromSignInKeyword("KeyWord1.xls");
        for (int i = 0; i < keyword.length; i++) {
            selectAction(keyword[i]);
        }
    }
}
