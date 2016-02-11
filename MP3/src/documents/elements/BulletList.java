package documents.elements;

import documents.elements.items.ListItem;
import documents.visitors.DocumentVisitor;

import java.util.List;

/**
 * Created by Selma on 2016-02-09.
 */
public class BulletList<T> extends CompositeElement{


    public BulletList(List<T> elementList) {
        super(elementList);
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
        for (T listItem: super.elementList)
        {
        }
    }

    @Override
    public String getText() {
        return null;
    }

}
