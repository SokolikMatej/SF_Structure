package salesforce;

import driver.Driver;
import org.openqa.selenium.WebDriver;
import tfun.TFunctions;

import java.util.concurrent.TimeUnit;

public class SF_Functions implements TFunctions {

    WebDriver driver;

    public SF_Functions() {
        this.driver = Driver.webDriver;
    }

    public void anyAdditionalFunction() {

    }

    //TODO: Error handling - Functions
    @Override
    public void navigationToUrl(String url) {
        this.driver.get(url);
    }

    @Override
    public void navigationBackButton() {

    }

    @Override
    public void navigationForwardButton() {

    }

    public void delay(int seconds) throws InterruptedException {
        TimeUnit.SECONDS.sleep(seconds);
    }
}
