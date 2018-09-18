package Search;

import base.CommonAPI;
import org.testng.annotations.Test;

public class InputSearch extends CommonAPI {
    @Test
   public void search(){
        typeOnInputBox("#gh-ac","ring");
    }
}
