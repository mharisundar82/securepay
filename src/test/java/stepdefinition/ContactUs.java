package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import securepaymethods.Helper;
import cucumber.api.java.en.And;
import datafactory.TestData;
import securepaymethods.Browser;
import parameters.ContactUsRecord;

import java.util.concurrent.TimeUnit;

public class ContactUs {

    Helper helper;
    WebDriver driver;
    ContactUsRecord contactUsRecord;


    @Given("^generate contactUsRecord for \"([^\"]*)\" with message \"([^\"]*)\"$")
    public void generate_record(String reasonForEnquiry, String message){
        TestData testData = new TestData();
        contactUsRecord = testData.generateContactUsRecord(reasonForEnquiry, message);
    }

    @Given("^url \"([^\"]*)\"$")
    public void url(String url) throws Throwable {
        driver = Browser.launch();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        helper = new Helper(driver);
    }

    @And("^search \"([^\"]*)\"$")
    public void google_search(String value) throws Throwable{
        helper.searchText(value);
    }

    @And("^click search result \"([^\"]*)\"$")
    public void click_Search_Result(String searchresult) throws Throwable{
        WebElement element = helper.waitForCondition(driver,ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='rc']//a[@href='"+ searchresult +"']"))));
        element.click();
    }

    @And("^click support link \"([^\"]*)\"$")
    public void click_support_link(String support) throws Throwable{
        WebElement element = helper.waitForCondition(driver,ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//li[contains(@class,'menu-item')]//a[contains(text(),'"+ support +"')]"))));
        element.click();
    }

    @And("^click contactUs link \"([^\"]*)\"$")
    public void click_contactUs_link(String contact) throws Throwable{
        WebElement element = helper.waitForCondition(driver, ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[contains(text(),'"+ contact +"')]"))));
        element.click();
    }

    @And("^verify contactUs page loaded$")
    public void verify_contactUs_page_loaded() throws Throwable{
       helper.waitForCondition(driver, ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='content']//div[contains(@class,'grid-container')]"))));
       System.out.println("ContactUs Form Loaded");
    }

    @And("^input fields \"([^\"]*)\" As \"([^\"]*)\"$")
    public void input_fields(String xpath, String fieldinput) throws Throwable {
        helper.input(xpath, contactUsRecord.getFieldValue(fieldinput));

    }

    @And("^textArea fields \"([^\"]*)\" As \"([^\"]*)\"$")
    public void textArea_fields(String xpath, String textarea) throws Throwable {
        helper.textArea(xpath, contactUsRecord.getFieldValue(textarea));

    }

    @And("^Select Value \"([^\"]*)\" As \"([^\"]*)\"$")
    public void select_value(String selectlabel, String visibletext) throws Throwable {
        helper.select(selectlabel,contactUsRecord.getFieldValue(visibletext));
    }

    @Then("^quit$")
    public void quit() throws Throwable {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.quit();
    }

}
