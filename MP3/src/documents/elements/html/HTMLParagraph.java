package documents.elements.html;

import documents.elements.Paragraph;

/**
 * Created by Selma on 2016-02-09.
 */
public class HTMLParagraph  {
    private String text;

    public HTMLParagraph(String text) {
        this.text = text;
    }

    public String getText() {
        return "<p>" + text + "</p>";
    }
}
