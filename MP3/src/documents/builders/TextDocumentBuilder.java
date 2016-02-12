package documents.builders;

import documents.TextDocument;
import documents.elements.*;

/**
 * Created by Selma on 2016-02-09.
 */
public abstract class TextDocumentBuilder {

    protected TextDocument textDocument = new TextDocument();


    public abstract void preamble();
    public abstract void postamble();
    public abstract void buildElement(Header header);
    public abstract void buildElement(Paragraph paragraph);
    public abstract void buildElement(BulletList bulletList);
    public abstract void buildEndElement(BulletList bulletList);
    public abstract void buildElement(ListItem listItem);
    public abstract void buildElement(Table table);
    public abstract void buildEndElement(Table table);
    public abstract void buildElement(TableRow tableRow);
    public abstract void buildEndElement(TableRow tableRow);
    public abstract void buildElement(TableData tableData);
    public TextDocument getDocument()
    {
        return textDocument;
    }
}
