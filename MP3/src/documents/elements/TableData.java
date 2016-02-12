package documents.elements;

import documents.elements.base.TextElement;
import documents.visitors.DocumentVisitor;

/**
 * Created by Wareus on 2016-02-12.
 */
public class TableData extends TextElement
{
    public TableData(String text)
    {
        super(text);
    }

    @Override
    public void accept(DocumentVisitor visitor)
    {
        visitor.visit(this);
    }
}
