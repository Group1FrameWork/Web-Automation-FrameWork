package java.pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerService  extends  CommonAPI{
    @FindBy(css = "#customer-service-link")
    public static WebElement CustomerServiceCSS;
    @FindBy(css = "#rn_SourceSearchField_9_SearchInput")
    public static WebElement CustomerServiceSearchCSS;
    @FindBy(css = "#rn_SourceSearchButton_10_SubmitButton")
    public static WebElement CustomerServiceSubmitButtonCSS;
    @FindBy(css = "#ProductCategoryList > div > ul.rn_LeftColumn > li:nth-child(1) > a")
    public static WebElement CreditCard;
    @FindBy(css = "#ProductCategoryList > div > ul.rn_LeftColumn > li:nth-child(2) > a")
    public static WebElement Membership;
    @FindBy(css = "#rn_Multiline_14_Content > ol > li:nth-child(1) > span.rn_Element1 > a")
    public static WebElement HowCanIApply;
    @FindBy(xpath = "//li[text()='Apply online ']/a")
    public static WebElement HereLink;
    //#search-results > div.c_279101 > div > div > div:nth-child(2) > div:nth-child(2) > div.row > div:nth-child(1) > a > img
    @FindBy(css = "#search-results > div.c_279101 > div > div > div:nth-child(2) > div:nth-child(2) > div.row > div:nth-child(1) > a > img")
    public static WebElement NextStep;
    @FindBy(css = "#costcoModalText")
    public static WebElement ModalText;
    //#rn_Multiline_14_Content > ol > li:nth-child(1) > span.rn_Element1 > a
    @FindBy(css = "#rn_Multiline_14_Content > ol > li:nth-child(1) > span.rn_Element1 > a")
    public static WebElement LinkingMembership;
    @FindBy(css = "#kirklandvideo")
    public static WebElement MembershipVideo;
    //#kirklandvideo

    public void searchCustomerService(){
        CustomerServiceCSS.click();
        CustomerServiceSearchCSS.sendKeys("Membership");
        CustomerServiceSubmitButtonCSS.click();
    }
    public void creditCardEnd() {
        CustomerServiceCSS.click();
        CreditCard.click();
        HowCanIApply.click();
    }
    public void setCreditCard2(){
        NextStep.click();
    }
    public void membershipEnd() {
        CustomerServiceCSS.click();
        Membership.click();
        LinkingMembership.click();
        MembershipVideo.click();
    }
    public void popNewWindow(){
        CustomerServiceCSS.click();
        CreditCard.click();
        HowCanIApply.click();
        HereLink.click();
    }
    public void tabSwitching(){
        CustomerServiceCSS.click();
        CreditCard.click();
        HowCanIApply.click();
        HereLink.click();

    }

}
