package ro.itschool.curs12;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class DocumentMain {
    public static void main(String[] args) {
        List<Document> documents = new ArrayList<>();
        documents.addAll(List.of(
                new Document("ion", "Maria are mere", "Povestea Mariei"),
                new Document(UUID.randomUUID().toString(), "Ana are mere", "Povestea Anei"),
                new Document(UUID.randomUUID().toString(), "Stefan are mere", "Povestea lui Stefan"),
                new Document(UUID.randomUUID().toString(), "Stefania are mere", "Povestea Stefaniei")
        ));

        DocumentService documentService = new DocumentService(documents);
        List<Document> docs = documentService.getAllDocuments();
        System.out.println(documentService.getAllDocuments());
        System.out.println(documentService.getDoumentWithName("Ana are mere"));
        Optional<Document> doc = documentService.getDoumentWithName("Povestea Anei");
        if (doc.isPresent()) {
            System.out.println(doc.get().getName());
        }
        documentService.addMarkupForDocument(new Markup("32", 3, "hello"), "ion");
        documentService.addMarkupForDocument(new Markup("3", 7, "hello"), "ion");
        doc = documentService.getDoumentById("ion");
        System.out.println(doc);
        System.out.println(documentService.getMarkupsForDocument("ion"));
        DocumentPrinter prnt = new DocumentPrinter(documents.get(0));
        System.out.println(prnt.printWithMarkups());


    }
}
