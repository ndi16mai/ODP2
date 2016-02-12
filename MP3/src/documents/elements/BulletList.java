package documents.elements;

import documents.elements.base.CompositeElement;
import documents.visitors.DocumentVisitor;

import java.util.List;

/**
 * Created by Selma on 2016-02-09.
 */
public class BulletList extends CompositeElement<ListItem>
{

    public BulletList(List<ListItem> itemList) {
        super(itemList);
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }

}
