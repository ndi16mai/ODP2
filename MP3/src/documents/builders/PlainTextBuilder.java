package documents.builders;

import documents.TextDocument;
import documents.elements.BulletList;
import documents.elements.Header;
import documents.elements.Paragraph;
import documents.elements.items.ListItem;

/**
 * Created by Selma on 2016-02-10.
 */
public class PlainTextBuilder implements TextDocumentBuilder {

    private TextDocument textDocument = new TextDocument();

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
    public void buildElement(ListItem listItem) {

    }

    @Override
    public TextDocument getDocument() {
        return textDocument;
    }
}
