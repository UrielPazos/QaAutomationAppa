package documents.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public static WebDriver driver;

    private static WebDriverWait wait;

    static {
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, 10);
    }

    public BasePage (WebDriver driver){
        BasePage.driver = driver;
    }

    public static void navigateTo(String url){
        driver.get(url);
    }

    public WebElement waitUntilClickable(String xpath) {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
    }

    public void clickButton(String xpath) {
        WebElement button = waitUntilClickable(xpath);
        button.click();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    
}

