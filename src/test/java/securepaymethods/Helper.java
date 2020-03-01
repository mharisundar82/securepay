package securepaymethods;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Helper {

    WebDriver driver;
    private static final Logger log = LogManager.getLogger(Helper.class.getName());

    public Helper(WebDriver driver) {
        this.driver = driver;

    }

    public void searchText(String value) {
        WebElement element = driver.findElement(By.xpath("//input[@name='q']"));
        element.clear();
        element.sendKeys(value);
        element.sendKeys(Keys.ENTER);
    }

    public void input(String fieldinput, String value) {
        WebElement element = driver.findElement(By.xpath("//input[contains(@placeholder,'"+ fieldinput +"')]"));
        element.clear();
        element.sendKeys(value);
    }

    public void textArea(String textarea, String text) {
        WebElement element = driver.findElement(By.xpath("//textarea[contains(@name,'"+ textarea +"')]"));
        element.clear();
        element.sendKeys(text);
    }


    public void select(String text, String label) {
        WebElement picklist = driver.findElement(By.xpath("//select[contains(@name,'"+ text +"')]"));
        Select value = new Select(picklist);
        value.selectByVisibleText(label);
        }

    public static <V> V waitForCondition(WebDriver driver, ExpectedCondition<V> expectedCondition){
        WebDriverWait conditionwait = new WebDriverWait(driver, 400);
        return conditionwait.until(expectedCondition);
    }
}



