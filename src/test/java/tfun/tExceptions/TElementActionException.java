package tfun.tExceptions;

import org.openqa.selenium.WebElement;

public class TElementActionException extends Exception {


    public TElementActionException(WebElement element, String xpath, String action, Throwable err) {
        super("Error while doing action over an element \n"
                + "WebElement: " + element + "\n"
                + "Xpath: " + xpath + "\n "
                + "Action: " + action + "\n"
                + "Error: " + err, null, false, false);
    }
}
