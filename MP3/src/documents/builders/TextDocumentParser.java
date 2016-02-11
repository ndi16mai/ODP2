package documents.builders;

import documents.TextDocument;
import documents.elements.Element;
import documents.visitors.DocumentVisitor;

import java.util.List;

/**
 * Created by Selma on 2016-02-09.
 */
public class TextDocumentParser {
   private DocumentVisitor visitor;

   public TextDocumentParser(DocumentVisitor visitor) {
      this.visitor = visitor;
   }

   public TextDocument parse(List<Element> list)
   {
      for(Element element: list)
      {
       element.accept(visitor);
      }
      return visitor.getBuilder().getDocument();
   }




}
