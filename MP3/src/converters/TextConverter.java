package converters;

import documents.TextDocument;

/**
 * Created by Selma on 2016-02-09.
 */
public interface TextConverter {

    void preamble();
    void postamble();
    void addHeader();
    void addParagraph();
    void addBulletList();
    void addTable();
    TextDocument getConverted();
}
