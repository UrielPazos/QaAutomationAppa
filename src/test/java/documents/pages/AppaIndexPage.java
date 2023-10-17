package documents.pages;

import org.openqa.selenium.WebDriver;

public class AppaIndexPage extends BasePage {

    public AppaIndexPage(WebDriver driver) {
        super(driver);
    }

    public void NavigateToWeAreAppa(){
        navigateTo("https://www.weareappa.com");
    }

    public void findTheDownloadButton(){
        findElementByXpath("//*[@id='comp-lfqwkpxu']/a/div/span[1]");
    }

    public void clicOnDownloadButton(){
        clickButton("//*[@id='comp-lfqwkpxu']/a/div/span[1]");
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }
    
}
    
