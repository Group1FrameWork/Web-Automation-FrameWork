package search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.SearchPages;

public class InputSearch extends CommonAPI {

    @Test
    public  void Pages(){
        SearchPages searchPages = PageFactory.initElements(driver,SearchPages.class);
        searchPages.setSearchPages();
    }

}

