import documents.StructuredTextDocument;
import documents.TextDocument;
import factories.StructuredTextElementFactory;
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
        TextConverter converter = TextConverterFactory.getInstance().createHTMLConverter();
        StructuredTextDocumentParser parser = new StructuredTextDocumentParser();
        parser.parse(document, converter);
        converter.getConverted().print();
        converter = TextConverterFactory.getInstance().createLaTeXConverter();
        parser.parse(document, converter);
        converter.getConverted().print();
    }
    public void buildDocument(TextDocument doc, TextElementFactory factory)
    { // jfr Builder
        doc.addElement(factory.createHeader(("Uppdraget"));
        doc.addElement(factory.createParagraph("Det h¨ar miniprojektet ..."));
        doc.addElement(factory.createHeader("Lista ¨over viktiga saker"));
        BulletList list = factory.createBulletList();
        list.add("F¨or det f¨orsta...");
        list.add("F¨or det andra...");
        list.add("F¨or det tredje...");
        doc.add(list);
        doc.addElement(factory.createParagraph("Multiplikationstabell"));
        Table table = factory.createTable(10,10);
        for(int row = 0; row<10; row++)
            for(int col=0;col<10;col++)
                table.set(row,col,row*col);
        doc.addElement(table);
    }

}
