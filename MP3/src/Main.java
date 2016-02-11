import documents.builders.PlainTextBuilder;
import documents.builders.TextDocumentParser;
import documents.builders.TextDocumentBuilder;
import documents.TextDocument;
import documents.elements.BulletList;
import documents.elements.Element;
import documents.elements.Table;
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
        PlainTextBuilder builder = new PlainTextBuilder();
        DocumentVisitor visitor = new DocumentVisitor(builder);
        TextDocumentParser textDocumentParser = new TextDocumentParser(visitor);

        textDocumentParser.parse(list).print();

    }

}
