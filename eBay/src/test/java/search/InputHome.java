package search;



import pageObjectModel.HomePage;

import org.testng.annotations.Test;

public class InputHome extends HomePage {
    @Test
   public void search(){
        typeOnInputBox("#gh-ac","ring");
    }
}
