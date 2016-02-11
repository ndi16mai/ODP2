package documents.elements;

import documents.visitors.DocumentVisitor;

/**
 * Created by Selma on 2016-02-09.
 */
public class Paragraph implements Element {

    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }


    @Override
    public String getText() {
        return text;
    }
}
