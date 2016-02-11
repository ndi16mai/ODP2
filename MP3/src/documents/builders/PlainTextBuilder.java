package documents.builders;

import documents.TextDocument;
import documents.elements.Header;
import documents.elements.Paragraph;

/**
 * Created by Selma on 2016-02-10.
 */
public class PlainTextBuilder implements TextDocumentBuilder {

    @Override
    public String preamble() {
        return null;
    }

    @Override
    public String postamble() {
        return null;
    }

    @Override
    public String buildElement(Header header) {
        return header.getText() + "\n";
    }

    @Override
    public String buildElement(Paragraph paragraph) {
        return paragraph.getText() + "\n";
    }

    @Override
    public TextDocument getDocument() {
        return null;
    }
}
