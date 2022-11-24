package tfun;

import tfun.tExceptions.TElementActionException;

public interface TElement {
    /**
     * Click on element
     */
    @SuppressWarnings("unused")
    TElement click() throws TElementActionException;

    /**
     * Setting text to element. This method also sets text to empty string before setting desired text
     *
     * @param text Text to set
     */
    void setText(String text);

    @SuppressWarnings("unused")
    Boolean isPresent();

    /**
     * Hover over element
     */
    @SuppressWarnings("unused")
    void hover();

    @SuppressWarnings("unused")
    String getValue();

    @SuppressWarnings("unused")
    String getAttribute(String attribute);
}
