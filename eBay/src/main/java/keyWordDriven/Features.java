package keyWordDriven;

import base.CommonAPI;
import dataDriven.InputFromExcel;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.support.PageFactory;
import pageObjectModel.HomePage;
import pageObjectModel.SignInPage;

import java.io.IOException;

public class Features extends CommonAPI {
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
    InputFromExcel inputFromExcel = PageFactory.initElements(driver, InputFromExcel.class);

    //KeyWord ClickSigIn
    public void clickSignIn() throws InterruptedException ,Exception{
        homePage.clickSignIn();
    }
    //KeyWord SignIn
    public void signIn() throws InterruptedException {
        signInPage.SignIn();
    }
    public void selectAction(String featureName) throws IOException, InterruptedException ,Exception{
        switch (featureName) {
            case "ClickSignIn":
                clickSignIn();
                break;
            case "SwitchToSignInForm":
              signInPage.noEmailNoPasswordUse("sdhbyvlhu","gvgcvgcfh");
              signInPage.captureErrorMessage();
              //driver.navigate().back();
                break;
            case "SignIn":
               signIn();
                break;
            default:
                throw new InvalidArgumentException("Invalid feature choice");
        }
    }

    public void selectFeature() throws IOException, InterruptedException,Exception {
        String[] keyword = inputFromExcel.getDataFromSignInKeyword("Key.xls");
        for (int i = 0; i < keyword.length; i++) {
            selectAction(keyword[i]);
        }
    }
}

