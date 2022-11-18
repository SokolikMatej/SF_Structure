package tfun;

import salesforce.SF_Element;

public interface TElement {
    /**
     * Click on element
     */
    void click();

    /**
     * Setting text to element. This method also sets text to empty string before setting desired text
     *
     * @param text Text to set
     */
    void setText(String text);

    Boolean isPresent();

    /**
     * Hover over element
     *
     */
    void hover();

    String getValue();

    String getAttribute(String attribute);
}
