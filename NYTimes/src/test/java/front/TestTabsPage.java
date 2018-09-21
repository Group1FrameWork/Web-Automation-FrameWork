package front;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class TestTabsPage extends CommonAPI {

    @Test
    public void homeUrl() {
        getCurrentPageUrl();
    }

    @Test
    public void clickWorld() {
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/header/div[4]/ul/li[1]/a")).click();
    }

    @Test
    public void clickUS() {
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/header/div[4]/ul/li[2]/a")).click();
    }

    @Test
    public void clickPolitics() {
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/header/div[4]/ul/li[3]/a")).click();
    }

    @Test
    public void clickNY() {
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/header/div[4]/ul/li[4]/a")).click();
    }

    @Test
    public void clickBusiness() {
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/header/div[4]/ul/li[5]/a")).click();
    }

    @Test
    public void clickTech() {
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/header/div[4]/ul/li[7]/a")).click();
    }

    @Test
    public void clickScience() {
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/header/div[4]/ul/li[8]/a")).click();
    }

    @Test
    public void clickHealth() {
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/header/div[4]/ul/li[9]/a")).click();
    }

    @Test
    public void clickSports() {
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/header/div[4]/ul/li[10]/a")).click();
    }

    @Test
    public void clickArt() {
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/header/div[4]/ul/li[11]/a")).click();
    }

    @Test
    public void clickBooks() {
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/header/div[4]/ul/li[12]/a")).click();
    }

    @Test
    public void clickStyle() {
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/header/div[4]/ul/li[13]/a")).click();
    }

    @Test
    public void clickFood() {
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/header/div[4]/ul/li[14]/a")).click();
    }

    @Test
    public void clickTravel() {
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/header/div[4]/ul/li[15]/a")).click();
    }

    @Test
    public void clickMagazine() {
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/header/div[4]/ul/li[16]/a")).click();
    }

    @Test
    public void clickTMagazine() {
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/header/div[4]/ul/li[17]/a")).click();
    }

    @Test
    public void clickRealEstate() {
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/header/div[4]/ul/li[18]/a")).click();
    }

    @Test
    public void clickVideo() {
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/header/div[4]/ul/li[19]/a")).click();
    }
}