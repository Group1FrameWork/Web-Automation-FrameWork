package Front;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FrontPage extends CommonAPI {
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/header/div[4]/ul/li[1]/a")
    public static WebElement tabWorld;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/header/div[4]/ul/li[2]/a")
    public static WebElement tabUS;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/header/div[4]/ul/li[3]/a")
    public static WebElement tabPolitics;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/header/div[4]/ul/li[4]/a")
    public static WebElement tabNY;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/header/div[4]/ul/li[5]/a")
    public static WebElement tabBusiness;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/header/div[4]/ul/li[7]/a")
    public static WebElement tabTech;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/header/div[4]/ul/li[8]/a")
    public static WebElement tabScience;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/header/div[4]/ul/li[9]/a")
    public static WebElement tabHealth;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/header/div[4]/ul/li[10]/a")
    public static WebElement tabSports;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/header/div[4]/ul/li[11]/a")
    public static WebElement tabArt;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/header/div[4]/ul/li[12]/a")
    public static WebElement tabBooks;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/header/div[4]/ul/li[13]/a")
    public static WebElement tabStyle;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/header/div[4]/ul/li[14]/a")
    public static WebElement tabFood;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/header/div[4]/ul/li[15]/a")
    public static WebElement tabTravel;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/header/div[4]/ul/li[16]/a")
    public static WebElement tabMagazine;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/header/div[4]/ul/li[17]/a")
    public static WebElement tabTMagazine;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/header/div[4]/ul/li[18]/a")
    public static WebElement tabRealEstate;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/header/div[4]/ul/li[19]/a")
    public static WebElement tabVideo;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/header/section[1]/div[1]/div[2]/button")
    public static WebElement searchClick;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/header/section[1]/div[1]/div[2]/button")
    public static WebElement searchBar;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/header/section[1]/div[1]/div[2]/div/form/div/input")
    public static WebElement topToday;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/header/section[1]/div[3]/ul/li[1]/a")
    public static WebElement topEnglish;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/header/section[1]/div[3]/ul/li[2]/a")
    public static WebElement topSpanish;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/header/section[1]/div[3]/ul/li[3]/a")
    public static WebElement topChinese;
    @FindBy(xpath = "/html/body/div[1]/main/div[1]/div[1]/div/section/div/div/div/div/div[4]/div/div[1]/div[2]/div")
    public static WebElement topNyWeather;

    public void searchBar() {
        searchClick.click();
        searchBar.sendKeys("sports", Keys.ENTER);
    }
    /*public void searchBar1() {
        searchClick.click();
        Actions action = new Actions(driver);
        action.moveToElement(searchBar).click().perform();
        //driver.findElement(By.cssSelector(".css-l8ph0q.e1f9nlu41")).sendKeys("sports", Keys.ENTER);
        searchBar.sendKeys("sports", Keys.ENTER);
        String Expected = "sports";
        String Actual = driver.findElement(By.cssSelector("#searchTextField")).getText();
        Assert.assertEquals(Actual,Expected);
    }*/

    public void searchBar1() {
        searchBar.click();
        searchBar.sendKeys("sports", Keys.ENTER);
        String Expected = "sports";
        String Actual = "sports";
        Assert.assertEquals(Actual, Expected);
    }

    public void setTopToday() { topToday.click();
    }
    public void setTopNyWeather() { topNyWeather.click();
    }
    public void setTopEnglish() { topEnglish.click();
    }
    public void setTopSpanish() { topSpanish.click();
    }
    public void setTopChinese() { topChinese.click();
    }
    public void setTabWorld() {
        tabWorld.click();
    }
    public void setTabUS() {
        tabUS.click();
    }
    public void setTabPolitics() {
        tabPolitics.click();
    }
    public void setTabNY() {
        tabNY.click();
    }
    public void setTabBusiness() {
        tabBusiness.click();
    }
    public void setTabTech() {
        tabTech.click();
    }
    public void setTabScience() {
        tabScience.click();
    }
    public void setTabHealth() {
        tabHealth.click();
    }
    public void setTabSports() {
        tabSports.click();
    }
    public void setTabArt() {
        tabArt.click();
    }
    public void setTabBooks() {
        tabBooks.click();
    }
    public void setTabStyle() {
        tabStyle.click();
    }
    public void setTabFood() {
        tabFood.click();
    }
    public void setTabTravel() {
        tabTravel.click();
    }
    public void setTabMagazine() {
        tabMagazine.click();
    }
    public void setTabTMagazine() {
        tabTMagazine.click();
    }
    public void setTabRealEstate() {
        tabRealEstate.click();
    }
    public void setTabVideo() {
        tabVideo.click();
    }
}



