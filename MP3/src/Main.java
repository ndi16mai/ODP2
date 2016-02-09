import converters.StructuredTextDocumentParser;
import converters.TextConverter;
import documents.StructuredTextDocument;
import documents.TextDocument;
import documents.elements.BulletList;
import documents.elements.Table;
import factories.StructuredTextElementFactory;
import factories.TextConverterFactory;
import factories.TextElementFactory;

/**
 * Created by Selma on 2016-02-09.
 */
public class Main {

    public static void main(String args[]){

    }

    public void testRun()
    {
        TextElementFactory factory = new StructuredTextElementFactory();
        TextDocument document = new StructuredTextDocument();
        buildDocument(document, factory);
        document.print(); // t.ex. till consol eller fil ...
        TextConverter converter = new TextConverterFactory().createHTMLConverter();
        StructuredTextDocumentParser parser = new StructuredTextDocumentParser();
        parser.parse(document, converter);
        converter.getConverted().print();
        converter = new TextConverterFactory().createLaTeXConverter();
        parser.parse(document, converter);
        converter.getConverted().print();
    }
    public void buildDocument(TextDocument doc, TextElementFactory factory)
    { // jfr Builder
        doc.add(factory.createHeader(("Uppdraget"));
        doc.add(factory.createParagraph("Det h¨ar miniprojektet ..."));
        doc.add(factory.createHeader("Lista ¨over viktiga saker"));
        BulletList list = factory.createBulletList();
        list.add("F¨or det f¨orsta...");
        list.add("F¨or det andra...");
        list.add("F¨or det tredje...");
        doc.add(list);
        doc.add(factory.createParagraph("Multiplikationstabell"));
        Table table = factory.createTable(10,10);
        for(int row = 0; row<10; row++)
            for(int col=0;col<10;col++)
                table.set(col,row,row*col + "");
        doc.add(table);
    }

}
