package factories;

import documents.elements.BulletList;
import documents.elements.Header;
import documents.elements.Paragraph;
import documents.elements.Table;

/**
 * Created by Selma on 2016-02-09.
 */
public class LaTeXElementFactory implements TextElementFactory {
    @Override
    public Header createHeader(String text) {
        return null;
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
    public Table createTable() {
        return null;
    }
}
