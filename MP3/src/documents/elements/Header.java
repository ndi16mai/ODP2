package documents.elements;

import documents.elements.base.TextElement;
import documents.visitors.DocumentVisitor;

/**
 * Created by Selma on 2016-02-09.
 */
public class Header extends TextElement
{


    public Header(String text)
    {
        super(text);
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }

}
