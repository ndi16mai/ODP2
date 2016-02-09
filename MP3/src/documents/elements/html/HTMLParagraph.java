package documents.elements.html;

import documents.elements.Paragraph;

/**
 * Created by Selma on 2016-02-09.
 */
public class HTMLParagraph extends Paragraph {
    private String text;

    public HTMLParagraph(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return "<p>" + text + "</p>";
    }
}
