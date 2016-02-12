package documents.builders;

import documents.TextDocument;
import documents.elements.base.Element;
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
      TextDocumentBuilder builder = visitor.getBuilder();

      builder.preamble();

      for(Element element: list)
      {
         element.accept(visitor);
      }

      builder.postamble();

      return builder.getDocument();
   }




}
