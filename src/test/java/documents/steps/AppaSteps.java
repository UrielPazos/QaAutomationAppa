package documents.steps;

import org.junit.Assert;

import documents.pages.AppaIndexPage;
import documents.pages.BasePage;
import io.cucumber.java.en.*;

public class AppaSteps {

    AppaIndexPage appa = new AppaIndexPage(BasePage.driver); // Instancia de driver BasePage

    @Given("^im on the index page of www.weareappa.com$")
    // navega a la pagina de weareappa
    public void navigateToWeAreAppa(){
        appa.NavigateToWeAreAppa();
    }

    @When("^i click on the download-app button$")
    // busca y clickea sobre el boton de descarga que se le pasa el xpath como parametro en AppaPage
    public void clicOnDownloadButton(){
        appa.clicOnDownloadButton();
    }
    

    @Then("^I should be redirected to the specific route$")
    // Se le da la URL que espera abrir y matchea contra la que actualmente renderiza el navegador
    public void iShouldBeRedirectedToTheExpectedURL() {
    String expectedUrl = "https://www.weareappa.com/appa-descarga";
    String actualUrl = appa.getCurrentUrl();

    // Assertions
    Assert.assertEquals("The URLs did not match", expectedUrl, actualUrl);
}

}

