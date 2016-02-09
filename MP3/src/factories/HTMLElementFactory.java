package factories;

import documents.elements.*;
import documents.elements.html.HTMLHeader;

/**
 * Created by Selma on 2016-02-09.
 */
public class HTMLElementFactory implements TextElementFactory {
    @Override
    public Header createHeader(String text) {
        return new HTMLHeader(text);
    }

    @Override
    public Paragraph createParagraph(String text) {
        return null;
    }

    @Override
    public BulletList createBulletList() {
        return null;
    }

    @Override
    public Table createTable(int column, int row) {
        return null;
    }

}
