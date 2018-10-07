package ForgetPackage;

import base.CommonAPI;
import org.openqa.selenium.By;

public class forgetPage extends CommonAPI {

    public void faccount() {
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/article/div[2]/div[2]/p/a")).click();
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/section"));
        driver.findElement(By.id("forget=react-root")).click();
    }
}
