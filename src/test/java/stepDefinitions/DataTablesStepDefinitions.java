package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
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
        dataPage.newButton.click();
    }

    @And("ad bolumune {string} yazir")
    public void adBolumuneYazir(String firstname) {
        dataPage.adElaveEt.sendKeys(firstname);
    }

    @And("soyad bolumune {string} yazir")
    public void soyadBolumuneYazir(String lastname) {
        actions.sendKeys(Keys.TAB).sendKeys(lastname).perform();
        //dataPage.soyadElaveEt.sendKeys(lastname);
    }

    @And("position bolumune {string} yazir")
    public void positionBolumuneYazir(String position) {
        actions.sendKeys(Keys.TAB).sendKeys(position).perform();
        //dataPage.positionElaveEt.sendKeys(position);
    }

    @And("office bolumune {string} yazir")
    public void officeBolumuneYazir(String office) {
        actions.sendKeys(Keys.TAB).sendKeys(office).perform();
        //dataPage.officeElaveEt.sendKeys(office);
    }

    @And("extension bolumune {string} yazir")
    public void extensionBolumuneYazir(String extension) {
        actions.sendKeys(Keys.TAB).sendKeys(extension).perform();
        //dataPage.extensionElaveEt.sendKeys(extension);
    }

    @And("startDate bolumune {string} yazir")
    public void startdateBolumuneYazir(String startDate) {
        actions.sendKeys(Keys.TAB).sendKeys(startDate).perform();
        //dataPage.startDateElaveEt.sendKeys(startDate);
    }

    @And("salary bolumune {string} yazir")
    public void salaryBolumuneYazir(String salary) {
        actions.sendKeys(Keys.TAB).sendKeys(salary).perform();
    }

    @And("istifadeci create button'una basir")
    public void istifadeciCreateButtonUnaBasir() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        dataPage.createButton.click();
    }

    @And("istifadeci {string} ile axtaris edir")
    public void istifadeciIleAxtarisEdir(String firstname) {
        dataPage.searchText.sendKeys(firstname,Keys.ENTER);
    }

    @And("ad bolumunde {string} oldugunu test edir")
    public void adBolumundeOldugunuTestEdir(String ad) {
        Assert.assertTrue(dataPage.searchResult.getText().contains(ad));
    }
}
