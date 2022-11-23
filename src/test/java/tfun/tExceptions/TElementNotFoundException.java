package tfun.tExceptions;


public class TElementNotFoundException extends Exception {
    public TElementNotFoundException(String xpath, String... customText) {
        super("Error while creating web element with xpath: " + xpath + " \n" +
                " " + (customText.length > 0 ? ("Custom text: " + customText[0]) : " "), null, false, false);
    }
}
