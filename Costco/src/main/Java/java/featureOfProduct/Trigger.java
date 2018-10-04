package java.featureOfProduct;
import base.CommonAPI;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.support.PageFactory;
import utility.DataReader;
import java.io.IOException;
import java.pages.HomePage;
import java.pages.SignInOrRegister;
public class Trigger extends CommonAPI {
        SignInOrRegister signInOrRegister1 = PageFactory.initElements(CommonAPI.driver, SignInOrRegister.class);
        HomePage homePage1 = PageFactory.initElements(CommonAPI.driver, HomePage.class);
    //KeyWord ClickSigIn
    public void clickSignIn() throws InterruptedException {
        signInOrRegister1.signInClick();
    }
    //KeyWord Input Data
    public void switchToSignInForm() {
        signInOrRegister1.inputData();
    }
    //KeyWord SignIn
    public void signIn() throws InterruptedException {
        signInOrRegister1.clickSignInButton();
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
    DataReader reader = new DataReader();
    public String[] getDataFromSignInKeyword(String fileName) throws IOException {
        String path = "../Costco/Data/" + fileName;
        String[] output = reader.colReader(path, 2); //col 2 = email
        return output;
    }
    public void selectFeature() throws IOException, InterruptedException {
        String[] keyword = getDataFromSignInKeyword("Key.xls");
        for (int i = 0; i < keyword.length; i++) {
            selectAction(keyword[i]);
        }
    }
}
