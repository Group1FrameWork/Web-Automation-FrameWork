package Front;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NextPage {

    @FindBy(xpath = "/html/body/div[4]/header/div[1]/div[2]/button[1]")
    public static WebElement selectionW;
    @FindBy(css = ".")
    public static WebElement worldSection;
    @FindBy(xpath = "//*[@id=\"collection-world\"]/header/nav/ol/li[1]/a")
    public static WebElement africaSelection;
    @FindBy(xpath = "//*[@id=\"collection-world\"]/header/nav/ol/li[2]/a")
    public static WebElement americasSelection;
    @FindBy(xpath = "//*[@id=\"collection-world\"]/header/nav/ol/li[3]/a")
    public static WebElement asiaSelection;
    @FindBy(xpath = "//*[@id=\"collection-world\"]/header/nav/ol/li[4]/a")
    public static WebElement austrliaSelection;
    @FindBy(xpath = "//*[@id=\"collection-world\"]/header/nav/ol/li[5]/a")
    public static WebElement europeSelection;
    @FindBy(xpath = "//*[@id=\"collection-world\"]/header/nav/ol/li[6]/a")
    public static WebElement middleEastSelection;
    @FindBy(css = "#desktop-sections-button")
    public static WebElement MenuSelection;
    @FindBy(xpath = "//*[@id=\"tab-link-2\"]/i")
    public static WebElement search;
    @FindBy(xpath = "//*[@id=\"search-tab-input\"]")
    public static WebElement inputSearch;

    public void inputSearch() {
        inputSearch.sendKeys();
    }

    public void setSearch() {
        search.click();
    }

    public void setAfricaSelection() {
        africaSelection.click();
    }

    public void setAmericasSelection() {
        americasSelection.click();
    }

    public void setAsiaSelection() {
        asiaSelection.click();
    }

    public void setAustrliaSelection() {
        austrliaSelection.click();
    }

    public void setEuropeSelection() {
        europeSelection.click();
    }

    public void setMiddleEastSelection() {
        middleEastSelection.click();
    }

    public void setSelection() {
        selectionW.click();
    }

    public void setWorldSection() {
        worldSection.click();
    }

    public void hoverOnMenu(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(worldSection);
    }
    public void setMenuSelection() {
        MenuSelection.click();
    }
    public void goToNextPage(WebDriver driver) {
        FrontPage frontPage = PageFactory.initElements(driver, FrontPage.class);
        frontPage.setTabWorld();
        setAfricaSelection();
        setSearch();
        inputSearch.sendKeys("Safari");
    }
}
