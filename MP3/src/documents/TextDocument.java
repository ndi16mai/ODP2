package documents;

import documents.elements.Element;

/**
 * Created by Selma on 2016-02-09.
 */
public class TextDocument implements Document{
    private String text;

    public TextDocument(String text) {
        this.text = text;
    }

    @Override
    public void print()
    {
        System.out.println(text);
    }
}
