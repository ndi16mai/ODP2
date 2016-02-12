package documents.elements;

import documents.elements.base.CompositeElement;
import documents.elements.base.Element;
import documents.visitors.DocumentVisitor;

import java.util.List;

/**
 * Created by Selma on 2016-02-09.
 */
public class Table extends CompositeElement<TableRow>
{

    public Table(List<TableRow> elementList)
    {
        super(elementList);
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }


}