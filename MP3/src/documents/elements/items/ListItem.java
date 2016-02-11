package documents.elements.items;

import documents.elements.CompositeElement;
import documents.elements.Element;
import documents.visitors.DocumentVisitor;

import java.util.List;

/**
 * Created by Selma on 2016-02-11.
 */
public class ListItem extends CompositeElement {

    public ListItem(List<Element> elementList) {
        super(elementList);
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);

    }

    @Override
    public String getText() {
        return null;
    }
}
