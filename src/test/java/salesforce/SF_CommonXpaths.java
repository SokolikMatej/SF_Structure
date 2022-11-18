package salesforce;

public class SF_CommonXpaths {
    public static String getMainMenuXpath() {
        return "//div[@role='navigation']/one-app-launcher-header";
    }

    public static String getMainMenuItemXpath(String itemName) {
        return "//p[text() = '" + itemName + "']//ancestor::one-app-launcher-menu-item";
    }

    public static String getNavigationMenuItemXpath(String navigationActionName) {
        return "//a[@title='" + navigationActionName + "']/..";
    }

    public static String getEditIconXpath(String fieldName) {
        return "//span[text()='" + fieldName + "']/following-sibling::button";
    }


    //label[contains(text(),'Last Name')]/ancestor::lightning-input/div/input|//span[contains(text(),'Billing City')]/parent::label/following-sibling::input
    public static String getInputXpath(String inputLabel) {
        return "//label[contains(text(),'" + inputLabel + "')]/ancestor::lightning-input/div/input" +
                "|//span[contains(text(),'" + inputLabel + "')]/parent::label/following-sibling::input" +
                "|//label[contains(text(),'" + inputLabel + "')]/following-sibling::div/input[not(contains(@type,'hidden'))]";
        //
    }

    //span[contains(text(),'Parent Account')]/parent::label/following-sibling::div//input|//label[contains(text(),'Primary Campaign Source')]/following-sibling::div//lightning-base-combobox//input
    public static String getLookupInputXpath(String inputLabel) {
        return "//span[contains(text(),'" + inputLabel + "')]/parent::label/following-sibling::div//input|//label[contains(text(),'" + inputLabel + "')]/following-sibling::div//lightning-base-combobox//input";
    }

    //span[contains(text(),'Type')]/parent::span/following-sibling::div//a|//label[contains(text(),'Type')]/following-sibling::div//button
    public static String getComboboxByLabelXpath(String comboboxLabel) {
        return "//span[contains(text(),'" + comboboxLabel + "')]/parent::span/following-sibling::div//a";
    }

    //div[contains(@class,'visible')]/div/ul/li[contains(@class,'uiMenuItem')]/a[@title='Apparel']|//lightning-base-combobox-item//span[contains(text(),'Existing Business')]
    public static String getComboboxItemXpath(String itemName) {
        return "//div[contains(@class,'visible')]/div/ul/li[contains(@class,'uiMenuItem')]/a[@title='" + itemName + "']|//lightning-base-combobox-item//span[contains(text(),'" + itemName + "')]";
    }

    //(//span[contains(text(),'Description')]/parent::label/following-sibling::textarea|//span[contains(text(),'Comments')]/parent::label/following-sibling::div//textarea)|//label[contains(text(),'Mailing Street')]/following-sibling::div/textarea
    public static String getTextareaXpath(String textAreaLabel) {
        return "//span[contains(text(),'" + textAreaLabel + "')]/parent::label/following-sibling::textarea|//label[contains(text(),'" + textAreaLabel + "')]/following-sibling::div/textarea";
    }

    //label[text() = 'Date']/following-sibling::div/input
    public static String getDateInputXpath(String dateInputLabel) {
        return "//label[text() = '" + dateInputLabel + "']/following-sibling::div/input";
    }

    //span[text() = 'Reminder Set']/parent::label/following-sibling::lightning-input//input|//span[text() = 'Discovery Completed']/parent::label/following-sibling::div//input
    public static String getCheckboxXpath(String checkboxLabel) {
        return "//span[text() = '" + checkboxLabel + "']/parent::label/following-sibling::lightning-input//input|//span[text() = '" + checkboxLabel + "']/parent::label/following-sibling::div//input";
    }

    //button[text()='Save']|//div[contains(@style,'opacity: 1')]//span[text()='Save & New']/parent::button
    public static String getButtonXpath(String buttonText) {
        return "//button[text()='" + buttonText + "']" +
                "|//div[contains(@style,'opacity: 1')]//span[text()='" + buttonText + "']/parent::button" +
                "|//div[@title='" + buttonText + "']" +
                "|//input[@value='" + buttonText + "']";
    }

    public static String foxLoadingXpath() {
        return "//div[contains(@class,'auraLoadingBox') and not(contains(@style,'display: none'))]//descendant::div[text()='Loading']";
    }
}
