package documents.builders;

import documents.TextDocument;
import documents.elements.BulletList;
import documents.elements.Header;
import documents.elements.items.ListItem;
import documents.elements.Paragraph;

/**
 * Created by Selma on 2016-02-09.
 */
public interface TextDocumentBuilder {

    void preamble();
    void postamble();
    void buildElement(Header header);
    void buildElement(Paragraph paragraph);
    void buildElement(BulletList bulletList);
    void buildElement(ListItem listItem);
    TextDocument getDocument();
}
