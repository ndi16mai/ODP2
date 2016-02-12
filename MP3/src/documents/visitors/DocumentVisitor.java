package documents.visitors;

import documents.builders.TextDocumentBuilder;
import documents.elements.*;
import documents.elements.ListItem;

/**
 * Created by Selma on 2016-02-09.
 */
public class DocumentVisitor {
    private TextDocumentBuilder builder;

    public DocumentVisitor(TextDocumentBuilder builder) {
        this.builder = builder;
    }

    public void visit(Header header)
    {
        builder.buildElement(header);
    }

    public void visit(Paragraph paragraph)
    {
       builder.buildElement(paragraph);
    }

    public void visit(BulletList bulletList)
    {
        builder.buildElement(bulletList);

        for (ListItem listItem: bulletList.getList())
        {
            visit(listItem);
        }

        builder.buildEndElement(bulletList);

    }

    public void visit(ListItem listItem)
    {
        builder.buildElement(listItem);
    }

    public void visit(Table table)
    {
        builder.buildElement(table);

        for (TableRow tableRow: table.getList())
        {
            visit(tableRow);
        }

        builder.buildEndElement(table);
    }

    public void visit(TableRow tableRow)
    {
        builder.buildElement(tableRow);

        for (TableData tableData: tableRow.getList())
        {
            visit(tableData);
        }

        builder.buildEndElement(tableRow);
    }
    public void visit(TableData tableData)
    {
        builder.buildElement(tableData);
    }

    public TextDocumentBuilder getBuilder() {
        return builder;
    }

}
