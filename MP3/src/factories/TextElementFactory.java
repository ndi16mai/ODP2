package factories;

import documents.elements.*;

/**
 * Created by Selma on 2016-02-09.
 */
public interface TextElementFactory {

    Header createHeader(String text);
    Paragraph createParagraph(String text);
    BulletList createBulletList();
    Table createTable();


}
