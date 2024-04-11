package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
    AmazonPage amazonPage=new AmazonPage();
    @Given("istifadeci amazon sehifesine gedir")
    public void istifadeci_amazon_sehifesine_gedir() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));
        amazonPage.cookies.click();
    }
    @When("istifadeci iphone axtarisi edir")
    public void istifadeci_iphone_axtarisi_edir() {
        amazonPage.searchBox.sendKeys("iphone", Keys.ENTER);

    }
    @Then("istifadeci necilerin iphone icerdiyini test edir")
    public void istifadeci_necilerin_iphone_icerdiyini_test_edir() {
        Assert.assertTrue(amazonPage.searchWE.getText().contains("iphone"));

    }
    @Then("istifadeci sehifeni baglayir")
    public void istifadeci_sehifeni_baglayir() {
        Driver.quitDriver();

    }

    @When("istifadeci Selenium axtarisi edir")
    public void istifadeciSeleniumAxtarisiEdir() {
        amazonPage.searchBox.sendKeys("Selenium", Keys.ENTER);
    }

    @Then("istifadeci necilerin Selenium icerdiyini test edir")
    public void istifadeciNecilerinSeleniumIcerdiyiniTestEdir() {
        Assert.assertTrue(amazonPage.searchWE.getText().contains("Selenium"));
    }

    @When("istifadeci Java axtarisi edir")
    public void istifadeciJavaAxtarisiEdir() {
        amazonPage.searchBox.sendKeys("Java", Keys.ENTER);
    }

    @Then("istifadeci necilerin Java icerdiyini test edir")
    public void istifadeciNecilerinJavaIcerdiyiniTestEdir() {
        Assert.assertTrue(amazonPage.searchWE.getText().contains("Java"));
    }

    @When("istifadeci {string} axtarisi edir")
    public void istifadeciAxtarisiEdir(String axtarilanObyekt) {
        amazonPage.searchBox.sendKeys(axtarilanObyekt,Keys.ENTER);
    }

    @Then("istifadeci necilerin {string} icerdiyini test edir")
    public void istifadeciNecilerinIcerdiyiniTestEdir(String obyekt) {
        Assert.assertTrue(amazonPage.searchWE.getText().contains(obyekt));
    }

    @Then("istifadeci {string} ucun axtaris edir")
    public void istifadeciUcunAxtarisEdir(String axtarilanKelime) {
        amazonPage.searchBox.sendKeys(axtarilanKelime,Keys.ENTER);
    }


}
