package documents.elements;

import documents.visitors.DocumentVisitor;

import java.util.List;

/**
 * Created by Selma on 2016-02-09.
 */
public abstract class BulletList implements Element{

    protected List<String> list;

    public BulletList(List<String> list) {
        this.list = list;
    }

    public void add(String text)
    {
        list.add(text);
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void add(Element element)
    {

    }
}
