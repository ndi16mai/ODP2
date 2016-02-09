package documents.elements.html;

import documents.elements.Header;

/**
 * Created by Selma on 2016-02-09.
 */
public class HTMLHeader extends Header {
    private String text;

    public HTMLHeader(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return "<h1> " + text + "</h1>" ;
    }
}
