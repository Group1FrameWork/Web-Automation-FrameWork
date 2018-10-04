package Search;

import PageObjectModel.HelpAndContact;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;

public class HelpAndContactTest extends HelpAndContact {

    HelpAndContact helpAndContact = PageFactory.initElements(CommonAPI.driver,HelpAndContact.class);
    //TC#1
    @Test
    public void searchForHelp() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " : " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        helpAndContact.searchForHelp();
    }
    // TC#2
    @Test
    public void searchForMultipleHelp() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " : " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        helpAndContact.searchForMultipleHelp();
    }
    //TC#3
    @Test
    public void getHelp1() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " : " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        helpAndContact.getHelp1();
    }

    //TC#4
    @Test
    public void getHelp2() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " : " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        helpAndContact.getHelp2();
    }
    //TC#5
    @Test
    public void getHelp3() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " : " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        helpAndContact.getHelp3();
    }
    //TC#6
    @Test
    public void getHelp4() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " : " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        helpAndContact.getHelp4();
    }
    //TC#7
    @Test
    public void getHelp5() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " : " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        helpAndContact.getHelp5();
    }
    //TC#8
    @Test
    public void getHelp6() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " : " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        helpAndContact.getHelp6();
    }
    //TC#9
    @Test
    public void returnAndRefunds() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " : " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        helpAndContact.returnAndRefunds();
    }
    //TC#10
    @Test
    public void shippingAndTracking() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " : " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        helpAndContact.shippingAndTracking();
    }
    //TC#11
    @Test
    public void selling() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " : " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        helpAndContact.selling();
    }
    //TC#12
    @Test
    public void buying() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " : " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        helpAndContact.buying();
    }
    //TC#13
    @Test
    public void account() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " : " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        helpAndContact.account();
    }
}
