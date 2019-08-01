package ro.itschool.homework17;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

public class DocumentMain {
    public static void main(String[] args) throws Exception {

        List<Document> doc = new ArrayList<>();
        doc.addAll(List.of(
                (new Document("1", "doc1", Status.IN_PROGRESS)),
                (new Document("2", "doc2", Status.IN_PROGRESS)),
                (new Document("3", "doc3", Status.FAILED)),
                (new Document("4", "doc4", Status.NEW)),
                (new Document("5", "doc5", Status.SUCCES)),
                (new Document("6", "doc6", Status.SUCCES)),
                (new Document("7", "doc7", Status.NEW)))
        );

        DocumentService ds = new DocumentService(doc);


        System.out.println(ds.getInProgressDocument());

        ds.startDocument("3");
        System.out.println(ds.getDocument("7"));

        ds.completeDocument("4");
        System.out.println(ds.getDocument("4"));

        ds.failDocument("4");
        System.out.println(ds.getDocument("4"));

        System.out.println(ds.getAllDocuments());


    }
}
