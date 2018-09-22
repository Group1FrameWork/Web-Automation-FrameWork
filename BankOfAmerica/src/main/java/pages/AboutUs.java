package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AboutUs extends CommonAPI {
    @FindBy( css = "#NAV_ABOUT_US")
    public static WebElement AboutUsCss;
    @FindBy( css = "#who-we-are")
    public  static  WebElement WhoWeAreCss;
   @FindBy( xpath = "//*[@id=\"subNavContainer_0\"]/div/ul/li[1]/a")
   public static WebElement OurCompanyCss;
   @FindBy(css = "#what-guides-us")
   public static WebElement WhatGuidesUs;

    public void clickAboutUs(){
       AboutUsCss.click();
    }

   public void  OurCompany(){
       Actions actions = new Actions(driver);
       actions.moveToElement(OurCompanyCss).click().perform();
   }


}
