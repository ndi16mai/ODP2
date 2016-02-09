package documents.elements;

import documents.visitors.DocumentVisitor;

/**
 * Created by Selma on 2016-02-09.
 */
public abstract class Table implements Element{
    protected String[][] table;

    public Table(int column, int row) {
        table = new String[column][row];
    }

    public abstract void set(int col, int row, String value);

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void add(Element element) {

    }
}
