package documents.elements;

import documents.elements.base.CompositeElement;
import documents.visitors.DocumentVisitor;

import java.util.List;

/**
 * Created by Wareus on 2016-02-12.
 */
public class TableRow extends CompositeElement<TableData>
{
    public TableRow(List<TableData> elementList)
    {
        super(elementList);
    }

    @Override
    public void accept(DocumentVisitor visitor)
    {
        visitor.visit(this);
    }
}
