package search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AboutUs;
import pages.SmallBusiness;
import reporting.TestLogger;

import javax.swing.*;

public class TestAboutUs extends AboutUs {
    AboutUs ObjOfAboutUS ;
    @BeforeMethod
    public void elementsOfAboutUs(){
        ObjOfAboutUS = PageFactory.initElements(driver, AboutUs.class);
        }
    @Test
    public void hoverWhoAreYou(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WebElement element = WhoWeAreCss;
        Actions action = new Actions(driver);
        ObjOfAboutUS.clickAboutUs();
        action.moveToElement(element).perform();
        }
    @Test
    public void Company(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        OurCompany();
    }
}
