package documents.elements;

import documents.elements.items.ListItem;
import documents.visitors.DocumentVisitor;

import java.util.List;

/**
 * Created by Selma on 2016-02-09.
 */
public class BulletList<T extends Element> extends CompositeElement{
    List<T> elementList;

    public BulletList(List<T> elementList) {
        super(elementList);
        this.elementList = elementList;
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
        for (T listItem: elementList)
        {

        }
    }

    @Override
    public String getText() {
        return null;
    }

}
