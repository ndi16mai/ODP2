package documents.elements;

import documents.visitors.DocumentVisitor;

/**
 * Created by Selma on 2016-02-09.
 */
public interface Element {
    void accept(DocumentVisitor visitor);
    String getText();
    void addElement(Element element);
}
