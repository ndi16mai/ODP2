package documents.elements.base;

/**
 * Created by Wareus on 2016-02-12.
 */
public abstract class TextElement implements Element
{
    protected String text;

    public TextElement(String text)
    {
        this.text = text;
    }

    public String getText()
    {
        return text;
    }
}
