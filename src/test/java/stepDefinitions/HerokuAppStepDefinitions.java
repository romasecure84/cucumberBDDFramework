package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HerokuappPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class HerokuAppStepDefinitions {

    HerokuappPage herokuappPage=new HerokuappPage();
    @Given("Istifadeci {string} sehifesinde")
    public void istifadeci_sehifesinde(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }
    @Given("add element buttonu'na basir")
    public void add_element_buttonu_na_basir() {
        herokuappPage.addElementButton.click();
    }
    @Given("istifadeci {int} sn gozleyir")
    public void istifadeci_sn_gozleyir(Integer vaxt) {
        ReusableMethods.wait(vaxt);
    }
    @Then("Delete button'unun gorunene qeder gozleyit")
    public void delete_button_unun_gorunene_qeder_gozleyit() {
        ReusableMethods.waitForVisibility(herokuappPage.deleteButton,10);
    }
    @Then("Delete button'unun gorunduyunu test edir")
    public void delete_button_unun_gorunduyunu_test_edir() {
        Assert.assertTrue(herokuappPage.deleteButton.isDisplayed());
    }
    @Then("Delete button'una basir")
    public void delete_button_una_basir() {
        herokuappPage.deleteButton.click();
    }
    @Then("Delete button'unun gorunmediyini test edir")
    public void delete_button_unun_gorunmediyini_test_edir() {
        Assert.assertTrue(herokuappPage.deleteButtonList.isEmpty());
    }
    @Then("sehifeni qapadir")
    public void sehifeni_qapadir() {
        Driver.closeDriver();
    }
}
