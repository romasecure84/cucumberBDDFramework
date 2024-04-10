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
}