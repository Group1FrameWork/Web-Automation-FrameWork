package savingPage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class Saving extends CommonAPI {
    @FindBy(css = "#navSavings > span.title")
    public static WebElement clickInSavings;
    @FindBy(css ="#cdAccount")
    public static WebElement clickInCDs;
    @FindBy(css ="#zipCodeModalInputField")
    public static WebElement inputeZipCode;
    @FindBy (css ="#compare-accounts-large")
    //@FindBy(id ="open-now-featured-cd")
    public static WebElement clickInOpenNow;
    @FindBy(xpath = "//*[@id='go-to-application-mediumup']")
    public  static  WebElement goToApplication;
    @FindBy(css ="#zz_name_tb_fnm_v_1")
    public static WebElement firstName;
    @FindBy(css ="#zz_name_tb_mnm_v_1")
    public static WebElement middleName;
    @FindBy(css ="#zz_name_tb_lnm_v_1")
    public static WebElement lastName;
    @FindBy(css ="#zz_addr_tb_line1_v_1")
    public static WebElement adress1;
    @FindBy(css ="#zz_addr_tb_line2_v_1")
    public static WebElement adress2;
    @FindBy(css ="#zz_addr_tb_city_v_1")
    public static WebElement city;
    @FindBy(css ="#zz_addr_lb_state_v_1")
    public static WebElement state;
    @FindBy(css ="#zz_phn_tb_ppno_v_1")
    public static WebElement phoneNumber;
    @FindBy(css ="#zz_phn_lb_ppnotp_v_1")
    public static WebElement tyoeOfPhoneNumber;
    @FindBy(css ="#zz_email_tb_addr_v_1")
    public static WebElement emailAdress;
    @FindBy(css ="#zz_citz_lb_uscit_yes_v_1-real")
    public  static WebElement radioButten;
    @FindBy(css ="#l3FFk1")
    public  static WebElement saveForLetter;
    public void clickInSavingsPage() throws InterruptedException {
        clickInSavings.click();
        Thread.sleep(2000);
        inputeZipCode.sendKeys("11427",Keys.ENTER);
        Thread.sleep(2000);
        //clickInCDs.click();
        clickInOpenNow.click();
        Thread.sleep(2000);
        goToApplication.click();
        firstName.sendKeys("abcd",Keys.ENTER);
        middleName.sendKeys("abcz",Keys.ENTER);
        lastName.sendKeys("qqq",Keys.ENTER);
        adress1.sendKeys("11-10,201th street",Keys.ENTER);
        adress2.sendKeys("11-10-,201 th street",Keys.ENTER);
        city.sendKeys("NY",Keys.ENTER);
        selectOptionByVisibleText(state,"Alaska");
        phoneNumber.sendKeys("9296753392");
        selectOptionByVisibleText(tyoeOfPhoneNumber,"Home");
        emailAdress.sendKeys("qbc@gmail.com)",Keys.ENTER);
        radioButten.click();
        //saveForLetter.click();
    }
}
