package documents.pages;

import org.openqa.selenium.WebDriver;

public class AppaIndexPage extends BasePage {

    public AppaIndexPage(WebDriver driver) {
        super(driver);
    }

    public void NavigateToWeAreAppa(){
        navigateTo("https://www.weareappa.com");
    }

    public void clicOnDownloadButton(){
        // Boton de descarga del header.
        clickButton("//span[contains(text(),'Descargar')]");//xpath relativo por chropath
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }
    
}
    
