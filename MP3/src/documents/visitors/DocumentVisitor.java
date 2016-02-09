package documents.visitors;

import documents.elements.*;

/**
 * Created by Selma on 2016-02-09.
 */
public interface DocumentVisitor {
    void visit(Header header);
    void visit(Paragraph paragraph);
    void visit(BulletList bulletList);
    void visit(Table table);
}
