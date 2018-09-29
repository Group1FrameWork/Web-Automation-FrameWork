package Search;

import PageObjectModel.HelpAndContact;
import org.testng.annotations.Test;

import java.io.IOException;

public class HelpAndContactTest extends HelpAndContact {
    //TC#1
    @Test
    public void SearchForHelp() throws InterruptedException {
        clickOnHelp("#gh-p-3 > a");
        SearchField("#search_input_element");
    }
    // TC#2
    @Test
    public void SearForMultipleHelp() throws IOException, InterruptedException {
        clickOnHelp("#gh-p-3 > a");
        SearchMultipleField("#search_input_element");
    }
    //TC#3
    @Test
    public void GetHelp1() throws InterruptedException {
        clickOnHelp("#gh-p-3 > a");
        GetPersonalizedHelp("#popular_solution_1 > span > span.main_title");
    }

    //TC#4
    @Test
    public void GetHelp2() throws InterruptedException {
        clickOnHelp("#gh-p-3 > a");
        GetPersonalizedHelp("#popular_solution_2 > span > span.main_title");
    }
    //TC#5
    @Test
    public void GetHelp3() throws InterruptedException {
        clickOnHelp("#gh-p-3 > a");
        GetPersonalizedHelp("#popular_solution_3 > span > span.main_title");
    }
    //TC#6
    @Test
    public void GetHelp4() throws InterruptedException {
        clickOnHelp("#gh-p-3 > a");
        GetPersonalizedHelp("#popular_solution_4 > span > span.main_title");
    }
    //TC#7
    @Test
    public void GetHelp5() throws InterruptedException {
        clickOnHelp("#gh-p-3 > a");
        GetPersonalizedHelp("#popular_solution_5 > span > span.main_title");
    }
    //TC#8
    @Test
    public void GetHelp6() throws InterruptedException {
        clickOnHelp("#gh-p-3 > a");
        GetPersonalizedHelp("#popular_solution_6 > span > span.main_title");
    }
    //TC#9
    @Test
    public void ReturnAndRefunds() throws InterruptedException {
        clickOnHelp("#gh-p-3 > a");
        GetPersonalizedHelp("#returns-refunds > span > span.t2");
    }
    //TC#10
    @Test
    public void ShippingAndTracking() throws InterruptedException {
        clickOnHelp("#gh-p-3 > a");
        GetPersonalizedHelp("#postage-tracking > span > span.t2");
    }
    //TC#11
    @Test
    public void Selling() throws InterruptedException {
        clickOnHelp("#gh-p-3 > a");
        GetPersonalizedHelp("#selling > span > span.t2");
    }
    //TC#12
    @Test
    public void Buying() throws InterruptedException {
        clickOnHelp("#gh-p-3 > a");
        GetPersonalizedHelp("#buying > span > span.t2");
    }
    //TC#13
    @Test
    public void Account() throws InterruptedException {
        clickOnHelp("#gh-p-3 > a");
        GetPersonalizedHelp("#account > span > span.t2");
    }
}
