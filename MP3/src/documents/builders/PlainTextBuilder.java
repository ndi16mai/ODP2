package documents.builders;

import documents.TextDocument;
import documents.elements.*;

/**
 * Created by Selma on 2016-02-10.
 */
public class PlainTextBuilder extends TextDocumentBuilder {


    @Override
    public void preamble() {

    }

    @Override
    public void postamble()
    {

    }

    @Override
    public void buildElement(Header header) {
        textDocument.add(header.getText() + "\n");
    }

    @Override
    public void buildElement(Paragraph paragraph) {
        textDocument.add(paragraph.getText() + "\n");
    }

    @Override
    public void buildElement(BulletList bulletList) {

    }

    @Override
    public void buildEndElement(BulletList bulletList)
    {

    }

    @Override
    public void buildElement(ListItem listItem) {
        textDocument.add("- " + listItem.getText() + "\n");
    }

    @Override
    public void buildElement(Table table)
    {

    }

    @Override
    public void buildEndElement(Table table)
    {

    }

    @Override
    public void buildElement(TableRow tableRow)
    {

    }

    @Override
    public void buildEndElement(TableRow tableRow)
    {
        textDocument.add("\n");
    }

    @Override
    public void buildElement(TableData tableData)
    {
        textDocument.add(tableData.getText() + "\t");
    }

    @Override
    public TextDocument getDocument() {
        return textDocument;
    }
}
