import documents.builders.PlainTextBuilder;
import documents.builders.TextDocumentParser;
import documents.builders.TextDocumentBuilder;
import documents.TextDocument;
import documents.elements.*;
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

        PlainTextBuilder builder = new PlainTextBuilder();
        DocumentVisitor visitor = new DocumentVisitor(builder);
        TextDocumentParser textDocumentParser = new TextDocumentParser(visitor);

        TextDocument textDocument = textDocumentParser.parse(list);

        textDocument.print();

    }

}
