package documents.elements.base;

import java.util.List;

/**
 * Created by Selma on 2016-02-11.
 */
public abstract class CompositeElement<T> implements Element {
    protected List<T> elementList;

    public CompositeElement(List<T> elementList) {
        this.elementList = elementList;
    }

    public void add(T element) {
        elementList.add(element);
    }

    public List<T> getList()
    {
        return elementList;
    }
}
