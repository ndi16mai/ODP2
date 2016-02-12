import documents.builders.HTMLDocumentBuilder;
import documents.builders.PlainTextBuilder;
import documents.builders.TextDocumentBuilder;
import documents.builders.TextDocumentParser;
import documents.TextDocument;
import documents.elements.*;
import documents.elements.base.Element;
import documents.visitors.DocumentVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Selma on 2016-02-09.
 */
public class Main {

    public static void main(String args[]){
        new Main().testRun();
    }

    public void testRun()
    {
        List<Element> list = new ArrayList<Element>();

        list.add(new Header("Snowhite & the seven dwarves"));
        list.add(new Paragraph("Once upon a time, there was a black lady"));

        List<ListItem> listItems = new ArrayList<>();

        listItems.add(new ListItem("Glader"));
        listItems.add(new ListItem("Toker"));

        list.add(new BulletList(listItems));


        List<TableRow> tableRows = new ArrayList<>();
        List<TableData> tableData1 = new ArrayList<>();
        tableData1.add(new TableData("r1c1"));
        tableData1.add(new TableData("r1c2"));
        tableData1.add(new TableData("r1c3"));
        tableRows.add(new TableRow(tableData1));
        List<TableData> tableData2 = new ArrayList<>();
        tableData2.add(new TableData("r2c1"));
        tableData2.add(new TableData("r2c2"));
        tableData2.add(new TableData("r2c3"));
        tableRows.add(new TableRow(tableData2));

        list.add(new Table(tableRows));


//        TextDocumentBuilder builder = new PlainTextBuilder();
        TextDocumentBuilder builder = new HTMLDocumentBuilder();
        DocumentVisitor visitor = new DocumentVisitor(builder);
        TextDocumentParser textDocumentParser = new TextDocumentParser(visitor);

        textDocumentParser.parse(list).print();

    }

}
