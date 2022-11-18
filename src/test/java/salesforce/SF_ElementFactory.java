package salesforce;

import driver.Driver;
import org.openqa.selenium.WebDriver;
import tfun.TElementFactory;

public class SF_ElementFactory implements TElementFactory<SF_Element> {

    WebDriver driver;

    public SF_ElementFactory() {
        this.driver = Driver.webDriver;
    }


    @Override
    public SF_Element button(String label) {
        return SF_Element.createElementWithXpath(this.driver, SF_CommonXpaths.getButtonXpath(label));
    }

    @Override
    public SF_Element inputField(String label) {

        return SF_Element.createElementWithXpath(this.driver, SF_CommonXpaths.getInputXpath(label));

    }

    @Override
    public SF_Element menuItem(String label) {
        return SF_Element.createElementWithXpath(this.driver, SF_CommonXpaths.getMainMenuItemXpath(label));
    }

    @Override
    public SF_Element xpathElement(String xpath) {
        return SF_Element.createElementWithXpath(this.driver, xpath);
    }

}
