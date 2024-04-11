package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.DataPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class DataTablesStepDefinitions {
    DataPage dataPage=new DataPage();
    Actions actions=new Actions(Driver.getDriver());

    @When("istifadeci {string} anasehifesine gedir")
    public void istifadeciAnasehifesineGedir(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Then("istifadeci new button'una basir")
    public void istifadeciNewButtonUnaBasir() {
        dataPage.adNew.click();
    }

    @And("ad bolumune {string} yazir")
    public void adBolumuneYazir(String firstname) {
        dataPage.adElaveEt.sendKeys(firstname);
    }

    @And("soyad bolumune {string} yazir")
    public void soyadBolumuneYazir(String lastname) {
        dataPage.soyadElaveEt.sendKeys(lastname);
    }

    @And("position bolumune {string} yazir")
    public void positionBolumuneYazir(String position) {
        dataPage.positionElaveEt.sendKeys(position);
    }

    @And("office bolumune {string} yazir")
    public void officeBolumuneYazir(String office) {
        dataPage.officeElaveEt.sendKeys(office);
    }

    @And("extension bolumune {string} yazir")
    public void extensionBolumuneYazir(String extension) {
        dataPage.extensionElaveEt.sendKeys(extension);
    }

    @And("startDate bolumune {string} yazir")
    public void startdateBolumuneYazir(String startDate) {
        dataPage.startDateElaveEt.sendKeys(startDate);
    }

    @And("salary bolumune {string} yazir")
    public void salaryBolumuneYazir(String arg0, String arg1) {
    }

    @And("istifadeci create button'una basir")
    public void istifadeciCreateButtonUnaBasir() {
        dataPage.createButton.click();
    }

    @And("istifadeci {string} ile axtaris edir")
    public void istifadeciIleAxtarisEdir(String arg0, String arg1) {
    }

    @And("ad bolumunde {string} oldugunu test edir")
    public void adBolumundeOldugunuTestEdir(String arg0, String arg1) {
    }
}
