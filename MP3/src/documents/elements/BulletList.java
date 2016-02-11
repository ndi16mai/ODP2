package documents.elements;

import documents.visitors.DocumentVisitor;

import java.util.List;

/**
 * Created by Selma on 2016-02-09.
 */
public class BulletList implements Element{

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
//        visitor.visit(this);
//        v.visitbulletlistbegin(this)
//        for(element e: list)
//        e.accept(v)
//        v.visitbulletlistend(this)
    }

    @Override
    public String getText() {
        return null;
    }

    @Override
    public void add(Element element)
    {

    }
}
