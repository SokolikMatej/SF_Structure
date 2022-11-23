package tfun;

import tfun.tExceptions.TElementNotFoundException;

public interface TElementFactory<E extends TElement> {


    public E button(String label) throws TElementNotFoundException;

    public E inputField(String label) throws TElementNotFoundException;

    public E menuItem(String label) throws TElementNotFoundException;

    public E xpathElement(String xpath) throws TElementNotFoundException;

}
