package tfun;

import org.openqa.selenium.WebDriver;

public interface TElementFactory<E extends TElement> {


    public E button(String label);

    public E inputField(String label);

    public E menuItem(String label);

    public E xpathElement(String xpath);

}
