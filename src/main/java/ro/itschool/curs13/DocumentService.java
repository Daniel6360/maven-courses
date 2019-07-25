package ro.itschool.curs13;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DocumentService {
    private List<Document> documents;

    public DocumentService(List<Document> documents) {
        this.documents = new ArrayList<>(documents);
    }

    public List<Document> getAlldocuments() {
        return documents;
    }

    public Document getDocumentWithName(String name) {
        for (Document document : documents) {
            if (document.getName().equals(name)) {
                return document;
            }
        }
        return null;
    }

    public Optional<Document> getDocumentById(String id) {
        for (Document document : documents) {
            if (document.getDocumentId().equals(id)) {
                return Optional.of(document);
            }
        }
        return Optional.empty();
    }

    public void addMarkupForDocument(Markup markup, String id) {
        Optional<Document> doc = getDocumentById(id);
        if (doc.isPresent()) {
           doc.get().addMarkup(markup);
        }
    }
}
