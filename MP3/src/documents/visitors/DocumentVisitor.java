package documents.visitors;

import documents.builders.TextDocumentBuilder;
import documents.elements.*;
import documents.elements.items.ListItem;

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
    }

    public void visit(ListItem listItem)
    {
        builder.buildElement(listItem);
    }

    public TextDocumentBuilder getBuilder() {
        return builder;
    }
}
