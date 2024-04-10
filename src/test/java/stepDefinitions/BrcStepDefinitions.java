package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class BrcStepDefinitions {
    BrcPage brcPage=new BrcPage();
    Faker faker=new Faker();
    @Given("istifadeci {string} sehifesine girir")
    public void istifadeci_sehifesine_girir(String istenilenURL) {
        Driver.getDriver().get(ConfigReader.getProperty("brcURL"));
    }
    @Then("istifadeci etibarsiz login girir")
    public void istifadeci_etibarsiz_login_girir() {
        brcPage.email.sendKeys(faker.internet().emailAddress());
    }
    @Then("istifadeci etibarsiz password girir")
    public void istifadeci_etibarsiz_password_girir() {
        brcPage.password.sendKeys(faker.internet().password());

    }
    @Then("login button'una basir")
    public void login_button_una_basir() {
        brcPage.loginButton2.click();
    }
    @Then("sehifeye giris edilmediyini test edir")
    public void sehifeye_giris_edilmediyini_test_edir() {
        Assert.assertTrue(brcPage.loginButton2.isDisplayed());
    }
    @Then("sehifeden cixar")
    public void sehifeden_cixar() {
        Driver.closeDriver();
    }

    @When("istifadeci login yazisina basir")
    public void istifadeciLoginYazisinaBasir() {
        brcPage.loginButton.click();
    }
}
