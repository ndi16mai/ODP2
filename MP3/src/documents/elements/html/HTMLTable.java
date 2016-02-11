package documents.elements.html;

import documents.elements.Table;

/**
 * Created by Selma on 2016-02-09.
 */
public class HTMLTable extends Table {

    public HTMLTable(int column, int row) {
        super(column, row);
    }

    public void set(int column, int row, String value)
    {
        table[column][row] = value;
    }

    @Override
    public String getText() {
        String temp = "<table>";

        for (int i = 0; i < table[0].length; i++) {
            temp += "<tr>";
            for (int j = 0; j < table.length; j++) {
                temp += "<td>" + table[i][j] + "</td>";
            }
            temp += "</tr>";

        }

        return temp + "</table>";
    }
}
