package Search;

<<<<<<< HEAD:eBay/src/test/java/Search/InputSearch.java
import common.CommonAPI;
=======
import Main.HomePage;
>>>>>>> master:eBay/src/test/java/Search/InputHome.java
import org.testng.annotations.Test;

public class InputHome extends HomePage {
    @Test
   public void search(){
        typeOnInputBox("#gh-ac","ring");
    }
}
