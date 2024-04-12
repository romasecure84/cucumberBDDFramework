package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class FacebookStepDefinitions {
    @Given("istifadeci {string} sehifesine gedir")
    public void istifadeci_sehifesine_gedir(String istenilenURL) {
        Driver.getDriver().get(ConfigReader.getProperty(istenilenURL));
    }
    @Then("istifadeci {int} saniye lengiyir")
    public void istifadeci_saniye_lengiyir(Integer gozlemeVaxti) {
        ReusableMethods.waitFor(gozlemeVaxti);
    }
    @When("urlin {string} icerdiyini test edir")
    public void urlin_icerdiyini_test_edir(String istenilenKelime) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(istenilenKelime));
    }
    @When("sehifeni baglayir")
    public void sehifeni_baglayir() {
        Driver.closeDriver();
    }

    @When("url'in {string} oldugunu test edir")
    public void urlInOldugunuTestEdir(String istenilenURL) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(istenilenURL));
    }
}
