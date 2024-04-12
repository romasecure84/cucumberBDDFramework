package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinition {
    GuruPage guruPage=new GuruPage();
    @Given("istifadeci {string} ana sehifesine gedir")
    public void istifadeci_ana_sehifesine_gedir(String guruURL){
        Driver.getDriver().get(ConfigReader.getProperty(guruURL));
    }

    @Given("{string} sutunundaki butun deyerleri yazdirir")
    public void sutunundaki_butun_deyerleri_yazdirir(String basliq) {
        int index=0;
        for (int i=0; i<guruPage.basliqlar.size(); i++){
            if (guruPage.basliqlar.get(i).getText().equals(basliq)){
                System.out.println(guruPage.basliqlar.get(i).getText());
                index=i+1;

                List<WebElement> sutunElementleri=Driver.getDriver().findElements(By.xpath("//tbody/tr/td["+index+"]"));
                for (WebElement w:sutunElementleri){
                    System.out.println(w.getText());
                }
            }
        }
    }
}

