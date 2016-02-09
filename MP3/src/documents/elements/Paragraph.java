package documents.elements;

import documents.visitors.DocumentVisitor;

/**
 * Created by Selma on 2016-02-09.
 */
public class Paragraph implements Element {
    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getText()
    {
        return null;
    }

    @Override
    public void addElement(Element element)
    {

    }
}
