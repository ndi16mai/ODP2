package documents.elements;

import documents.elements.base.TextElement;
import documents.visitors.DocumentVisitor;

/**
 * Created by Selma on 2016-02-11.
 */
public class ListItem extends TextElement
{


    public ListItem(String text)
    {
        super(text);
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }

}
