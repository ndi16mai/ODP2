package documents.builders;

import documents.TextDocument;
import documents.elements.Header;
import documents.elements.Paragraph;

/**
 * Created by Selma on 2016-02-10.
 */
public class PlainTextBuilder implements TextDocumentBuilder {

    private TextDocument textDocument = new TextDocument();

    @Override
    public void preamble() {

    }

    @Override
    public void postamble() {
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
    public TextDocument getDocument() {
        return textDocument;
    }
}
