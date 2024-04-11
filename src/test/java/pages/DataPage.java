package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DataPage {
    public DataPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='dt-button buttons-create']")
    public WebElement adNew;

    @FindBy(xpath = "//*[@id='DTE_Field_first_name']")
    public WebElement adElaveEt;

    @FindBy(xpath = "//*[@id='DTE_Field_last_name']")
    public WebElement soyadElaveEt;

    @FindBy(xpath = "//*[@id='DTE_Field_position']")
    public WebElement positionElaveEt;

    @FindBy(xpath = "//*[@id='DTE_Field_office']']")
    public WebElement officeElaveEt;

    @FindBy(xpath = "//*[@id='DTE_Field_extn']")
    public WebElement extensionElaveEt;

    @FindBy(xpath = "//*[@id='DTE_Field_start_date']")
    public WebElement startDateElaveEt;

    @FindBy(xpath = "//*[@id='DTE_Field_salary']")
    public WebElement salaryElaveEt;

    @FindBy(xpath = "/html/body/div[9]/div/div/div/div[1]/div[4]/div[3]/button")
    public WebElement createButton;
}
