package documents;

import documents.elements.Element;
import factories.TextElementFactory;

/**
 * Created by Selma on 2016-02-09.
 */
public interface TextDocument extends Document{
    void print();
    void add(Element element);
}
