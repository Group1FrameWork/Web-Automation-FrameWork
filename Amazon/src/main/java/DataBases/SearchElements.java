package DataBases;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchElements extends CommonAPI {
        @FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]")
        public static WebElement getXcelElement;

        public void getXcelElement() {
            //Logger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
            //}.getClass().getEnclosingMethod().getName()));
            getXcelElement.click();
        }
    }


