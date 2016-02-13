package documents.builders;

import documents.elements.*;

/**
 * Created by Wareus on 2016-02-13.
 */
public class LatexDocumentBuilder extends TextDocumentBuilder
{
    private boolean newTableLine = true;

    @Override
    public void preamble()
    {
        textDocument.add("\\documentclass{article}\n");
        textDocument.add("\\begin{document}\n");



    }

    @Override
    public void postamble()
    {
        textDocument.add("\\end{document}\n");

    }

    @Override
    public void buildElement(Header header)
    {
        textDocument.add("\\section{" + header.getText() + "}\n");
    }

    @Override
    public void buildElement(Paragraph paragraph)
    {
        textDocument.add("\\paragraph{" + paragraph.getText() + "}\n");
    }

    @Override
    public void buildElement(BulletList bulletList)
    {

        textDocument.add("\\begin{itemize}\n");
    }

    @Override
    public void buildEndElement(BulletList bulletList)
    {
        textDocument.add("\\end{itemize}\n");
    }

    @Override
    public void buildElement(ListItem listItem)
    {
        textDocument.add("\\item " + listItem.getText() + "\n");
    }

    @Override
    public void buildElement(Table table)
    {
        textDocument.add("\\begin{tabular}{ l c r }\n");
    }

    @Override
    public void buildEndElement(Table table)
    {
        textDocument.add("\\end{tabular}\n");
    }

    @Override
    public void buildElement(TableRow tableRow)
    {

    }

    @Override
    public void buildEndElement(TableRow tableRow)
    {
        textDocument.add("\\\\\n");
        newTableLine = true;
    }

    @Override
    public void buildElement(TableData tableData)
    {
        if(newTableLine)
            textDocument.add(tableData.getText() + " ");
        else
            textDocument.add("& " + tableData.getText() + " ");

    }
}
