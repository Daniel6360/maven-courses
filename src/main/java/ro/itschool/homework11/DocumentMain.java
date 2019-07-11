package ro.itschool.homework11;


import javax.print.Doc;
import java.util.List;


public class DocumentMain {
    public static void main(String[] args) {
        List<Document> documentList = List.of(
                new Document(1, "document1", "Whatever1", List.of(new Markup(1, 1, "whatever1"))),
                new Document(2, "document2", "Whatever2", List.of(new Markup(2, 2, "whatever2"))),
                new Document(3, "document3", "Whatever3", List.of(new Markup(3, 3, "whatever3"))),
                new Document(4, "document4", "Whatever4", List.of(new Markup(4, 4, "whatever4")))
        );
        DocumentService doc=new DocumentService(documentList);

        System.out.println(doc.getAllDocuments());
        System.out.println(doc.getDocumentWithName("document2"));
    }
}
