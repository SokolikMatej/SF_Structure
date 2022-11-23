package salesforce;

import driver.Driver;
import org.openqa.selenium.WebDriver;
import tfun.TElementFactory;
import tfun.tExceptions.TElementNotFoundException;

public class SF_ElementFactory implements TElementFactory<SF_Element> {

    WebDriver driver;

    public SF_ElementFactory() {
        this.driver = Driver.webDriver;
    }


    @Override
    public SF_Element button(String label) throws TElementNotFoundException {
        try {
            return SF_Element.createElementWithXpath(this.driver, SF_CommonXpaths.getButtonXpath(label));
        } catch (Exception e) {
            throw new TElementNotFoundException(SF_CommonXpaths.getButtonXpath(label), "Error while creating button element with label: " + label);

        }
    }

    @Override
    public SF_Element inputField(String label) throws TElementNotFoundException {
        try {
            return SF_Element.createElementWithXpath(this.driver, SF_CommonXpaths.getInputXpath(label));
        } catch (Exception e) {
            throw new TElementNotFoundException(SF_CommonXpaths.getInputXpath(label), "Error while creating input element with label: " + label);
        }

    }

    public SF_Element menuIcon() throws TElementNotFoundException {
        try {
            return SF_Element.createElementWithXpath(this.driver, SF_CommonXpaths.getMainMenuXpath());
        } catch (Exception e) {
            throw new TElementNotFoundException(SF_CommonXpaths.getMainMenuXpath(), "Error while creating menu icon element");
        }

    }

    @Override
    public SF_Element menuItem(String label) throws TElementNotFoundException {
        try {
            return SF_Element.createElementWithXpath(this.driver, SF_CommonXpaths.getMainMenuItemXpath(label));
        } catch (Exception e) {
            throw new TElementNotFoundException(SF_CommonXpaths.getMainMenuItemXpath(label), "Error while creating menu item with label: " + label);
        }
    }

    @Override
    public SF_Element xpathElement(String xpath) throws TElementNotFoundException {
        try {
            return SF_Element.createElementWithXpath(this.driver, xpath);
        } catch (Exception e) {
            throw new TElementNotFoundException(xpath, "Error while creating web element with xpath");
        }
    }

    public SF_Element navigationMenuItem(String itemLabel) throws TElementNotFoundException {
        try {
            return SF_Element.createElementWithXpath(this.driver, SF_CommonXpaths.getNavigationMenuItemXpath(itemLabel));
        } catch (Exception e) {
            throw new TElementNotFoundException(SF_CommonXpaths.getNavigationMenuItemXpath(itemLabel), "Error while creating navigation menu item with label: " + itemLabel);
        }
    }
}
