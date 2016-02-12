package documents.builders;

import documents.TextDocument;
import documents.elements.*;

/**
 * Created by Selma on 2016-02-11.
 */
public class HTMLDocumentBuilder extends TextDocumentBuilder{

    @Override
    public void preamble() {
        textDocument.add("<html>\n<body>\n");
    }

    @Override
    public void postamble() {
        textDocument.add("</body>\n</html>\n");
    }

    @Override
    public void buildElement(Header header) {
        textDocument.add("<h1> " + header.getText() + "</h1>\n");
    }

    @Override
    public void buildElement(Paragraph paragraph) {
        textDocument.add("<p>" + paragraph.getText() + "</p>\n");
    }

    @Override
    public void buildElement(BulletList bulletList) {
        textDocument.add("<ul>\n");
    }

    @Override
    public void buildEndElement(BulletList bulletList)
    {
        textDocument.add("</ul>\n");
    }

    @Override
    public void buildElement(ListItem listItem) {
        textDocument.add("<li>" + listItem.getText() + "</li>\n");
    }

    @Override
    public void buildElement(Table table)
    {
        textDocument.add("<table>\n");
    }

    @Override
    public void buildEndElement(Table table)
    {
        textDocument.add("</table>\n");
    }

    @Override
    public void buildElement(TableRow tableRow)
    {
        textDocument.add("<tr>\n");
    }

    @Override
    public void buildEndElement(TableRow tableRow)
    {
        textDocument.add("</tr>\n");
    }

    @Override
    public void buildElement(TableData tableData)
    {
        textDocument.add("<td>" + tableData.getText() + "</td>\n");
    }

}
