package documents;

import documents.elements.Element;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Selma on 2016-02-09.
 */
public class StructuredTextDocument implements TextDocument{
    private List<Element> elementList;

    public StructuredTextDocument()
    {
        elementList = new ArrayList<Element>();
    }

    public void add(Element element)
    {
        elementList.add(element);
    }

}
