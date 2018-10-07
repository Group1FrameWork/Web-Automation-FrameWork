package KeyWordDriven;

import HomePageObjects.HomePage;
import base.CommonAPI;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.support.PageFactory;
import signInPageObjects.ByInputFromExls;
import signInPageObjects.SignInPage;

import java.io.IOException;

public class Features extends CommonAPI {
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
    ByInputFromExls byInputFromExls = PageFactory.initElements(driver, ByInputFromExls.class);

    //KeyWord ClickSigIn
    public void clickSignIn() throws InterruptedException {
        homePage.clikSignIn();
    }
    //KeyWord SwitchToSignForm
    public void switchToSignInForm() {
        signInPage.switchToSignInForm();
    }
    //KeyWord SignIn
    public void signIn() throws InterruptedException {
        signInPage.signIn();
    }
    public void searchProduct(){
      //  homePage.searchProduct();
        System.out.println("Search for Jahid");
    }
    public void selectAction(String featureName) throws IOException, InterruptedException {
        switch (featureName) {
            case "ClickSignIn":
                clickSignIn();
                break;
            case "SwitchToSignInForm":
                switchToSignInForm();
                break;
            case "SignIn":
                signIn();
                break;
            default:
                throw new InvalidArgumentException("Invalid feature choice");
        }
    }
    public void selectFeature() throws IOException, InterruptedException {
        String[] keyword = byInputFromExls.getDataFromSignInKeyword("Key.xls");
        for (int i = 0; i < keyword.length; i++) {
            selectAction(keyword[i]);
        }
    }
}


