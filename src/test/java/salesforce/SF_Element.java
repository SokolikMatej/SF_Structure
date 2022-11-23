package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import tfun.TElement;
import tfun.tExceptions.TFunctionException;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class SF_Element implements TElement {
    WebElement element;
    WebDriverWait wait;
    String xpath;

    WebDriver driver;


    //TODO: Error handling - element creation and actions
    public SF_Element(WebElement element, String xpath, WebDriverWait wait, WebDriver driver) {
        this.element = element;
        this.xpath = xpath;
        this.wait = wait;
        this.driver = driver;
    }

    public static SF_Element createElementWithXpath(WebDriver driver, String xpath) {
        WebDriverWait waiter = new WebDriverWait(driver, Duration.ofSeconds(SF_Constants.MIN_LOADING_TIME));
        waiter.until(presenceOfElementLocated(By.xpath(xpath)));
        return getElementByXpath(driver, xpath, waiter);
    }

    private static SF_Element getElementByXpath(WebDriver driver, String xpath, WebDriverWait waiter) {
        return new SF_Element(driver.findElement(By.xpath(xpath)), xpath, waiter, driver);
    }

    @Override
    public SF_Element click() throws TFunctionException {
        try {
            element.click();
            return this;
        } catch (Exception e) {
            throw new TFunctionException("SF_Element click()", e, "Error while click on element with xpath: " + this.xpath);
        }
    }

    public void waitForLoading() {

    }

    //TODO: Error while creating element if element not present
    @Override
    public Boolean isPresent() {
        return null;
    }

    @Override
    public void hover() {
        Actions actions = new Actions(this.driver);
        actions.moveToElement(element);
    }

    @Override
    public void setText(String value) {
        element.sendKeys("");
        element.sendKeys(value);
    }

    @Override
    public String getValue() {
        return element.getAttribute("innerHTMP");
    }

    @Override
    public String getAttribute(String attributeName) {
        return element.getAttribute(attributeName);
    }


}
