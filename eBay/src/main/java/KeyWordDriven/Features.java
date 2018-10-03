package KeyWordDriven;

import base.CommonAPI;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.support.PageFactory;
import DataDriven.InputFromExcel;
import PageObjectModel.SignInPage;
import PageObjectModel.HomePage;

import java.io.IOException;

public class Features extends CommonAPI {
    HomePage objOfHomePage = PageFactory.initElements(driver, HomePage.class);
    SignInPage objOfSignInPage = PageFactory.initElements(driver, SignInPage.class);
    InputFromExcel objOfInputFromExcel = PageFactory.initElements(driver, InputFromExcel.class);

    //KeyWord ClickSigIn
    public void clickSignIn() throws InterruptedException ,Exception{
        objOfHomePage.clickSignIn();
    }
    //KeyWord SignIn
    public void signIn() throws InterruptedException {
        objOfSignInPage.SignIn();
    }
    public void selectAction(String featureName) throws IOException, InterruptedException ,Exception{
        switch (featureName) {
            case "ClickSignIn":
                clickSignIn();
                break;
            case "SignIn":
                signIn();
                break;
            default:
                throw new InvalidArgumentException("Invalid feature choice");
        }
    }

    public void selectFeature() throws IOException, InterruptedException,Exception {
        String[] keyword = objOfInputFromExcel.getDataFromSignInKeyword("Key.xls");
        for (int i = 0; i < keyword.length; i++) {
            selectAction(keyword[i]);
        }
    }
}

