package documents.builders;

import documents.TextDocument;
import documents.elements.Header;
import documents.elements.Paragraph;

/**
 * Created by Selma on 2016-02-09.
 */
public interface TextDocumentBuilder {

    String preamble();
    String postamble();
    String buildElement(Header header);
    String buildElement(Paragraph paragraph);
    TextDocument getDocument();
}
