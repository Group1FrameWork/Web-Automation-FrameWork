

package signInPageObject;

import base.CommonAPI;

public class SignInPage extends CommonAPI {
    /*@FindBy(xpath = "//*[@id=\"thirdpart-login\"]/a[1]")
    public static WebElement signInByFacebookIcon;
    @FindBy(xpath = "//*[@id=\"thirdpart-login\"]/a[2]")
    public static WebElement signInByGoogleIcon;
    @FindBy(css = "#email")
    public static WebElement facebookEmailInputBox;
    @FindBy(css = "#pass")
    public static WebElement facebookPasswordInputBox;
    @FindBy(css = "#u_0_0")
    public static WebElement facebookLogInButton;
    @FindBy(css = ".fsl")
    public static WebElement facebookLogInErorMessage;
    @FindBy(id = "identifierId")
    public static WebElement googleEmailInputBox;
    @FindBy(name = "password")
    public static WebElement googlePasswordInputBox;
    @FindBy(css = "#advisory > a:nth-child(2)")
    public static WebElement getHelp;
    @FindBy(xpath = "//div[@id='password']/div[2]/div[2]")
    public static WebElement gmailErrorMessage;

    //Switch to Sign In form
    public void switchToSignInForm() {
        WebDriver frame = driver.switchTo().frame("Facebook.com");
    }

    private void implicitWait(WebDriver driver, int i) {
    }

    // Sign in by Facebook icon Status
    public boolean signInByFacebookIconStatus() {
        boolean bl = signInByFacebookIcon.isEnabled();
        return bl;
        // Assert.assertEquals(bl, true);
    }

    //T3ALI_SI_TC07, Sign in by Google icon Status
    public boolean signInByGoogleIconStatus() {
        boolean bl = signInByGoogleIcon.isEnabled();
        return true;
    }

    //T3ALI_SI_TC12 , Sign in by invalid(email & password) Twitter account
    public String signInByInvalidFacebookAccount() {
        try {
            signInByFacebookIcon.click();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        facebookEmailInputBox.sendKeys("ismayatikiran96@gmail.com");
        facebookPasswordInputBox.sendKeys("kirankitzy996");
        facebookLogInButton.click();
        String actualErrorMessage = facebookLogInErorMessage.getText();
        System.out.println("Sign In Facebook Actual Error Message: " + actualErrorMessage);
        return actualErrorMessage;
    }

    //T3ALI_SI_TC13, Sign In By Valid google account
    public void signInByValidGooleAcount() {
        try {
            signInByGoogleIcon.click();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        googleEmailInputBox.sendKeys("testdata.islam@gmail.com" + Keys.ENTER);
        googlePasswordInputBox.sendKeys("testdata" + Keys.ENTER);
    }

    // Get Help Here option verification
    public void getHlepHere() {
        getHelp.click();
    }
    // Send email and password for Google Account
    public String sendGoogleIdAndPassword() {
        System.out.println(driver.getTitle());
        googleEmailInputBox.sendKeys("ismayatikiran96@gmail.com" + Keys.ENTER);
        googlePasswordInputBox.sendKeys("Kirankitzy96" + Keys.ENTER);
        String text = gmailErrorMessage.getText();
        return text;
    }

   */
}

