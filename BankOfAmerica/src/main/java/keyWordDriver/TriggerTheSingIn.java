package keyWordDriver;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import pages.SignIn;
import utility.DataReader;
import java.io.IOException;

public class TriggerTheSingIn extends CommonAPI{

SignIn signIn= PageFactory.initElements(CommonAPI.driver,SignIn.class);

    public void clickSignIn() throws InterruptedException {
        signIn.clickInSignIn();
    }
    //KeyWord Input Data
    public void switchToSignInForm() {
        signIn.clickInOnlineId();
        signIn.clickPasscode();
    }
    //KeyWord SignInGS
    public void signIn() throws InterruptedException {
    }
    public void selectAction(String featureName) throws IOException, InterruptedException {
        switch (featureName) {
            case "ClickSignIn":
                clickSignIn();
                break;
            case "SwitchToSignInForm":
                switchToSignInForm();
                break;
            case "SignInGS":
                signIn();
                break;
            default:
                //throw new InvalidArgumentException("Invalid feature choice");
        }
    }
    DataReader reader = new DataReader();
    public String[] getDataFromSignInKeyword(String fileName) throws IOException {
        String path = "../BankOfAmerica/Data/" + fileName;
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
