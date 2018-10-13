package HomePageFunctionTest;


import HomePageFunction.homePage;
import org.testng.annotations.Test;

@Test
public class homePagetestTest {
    public class homePagetest extends homePage {
        public homePagetest() { }
        @Test
        public void homepagetest() {
            this.homepage();
        }
        @Test
        public void forgotbuttontest() {
            this.forgotaccountbutton();
        }
        @Test
        public void checkFemaleboxtest() {
            this.checkFemalebox("#u_0_s > span:nth-child(1) > label");
        }
        @Test
        public void checkMaleBoxtest() {
            this.checkMalebox("#u_0_s > span:nth-child(2) > label");
        }
        @Test
        public void signuptest() {
            this.signup("#u_0_v");
        }
        @Test
        public void createpagetest() {
            this.createpage("body");
        }
    }
}

