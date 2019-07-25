package ro.itschool.curs12;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class DocumentService {
    private List<Document> documents;

    public DocumentService(List<Document> documents) {
        this.documents = new ArrayList<>(documents);
    }

    public List<Document> getAllDocuments() {
        return documents;
    }

    public Optional<Document> getDoumentWithName(String name) {
        for (Document document : documents) {
            if (document.getName().equals(name)) {
                return Optional.of(document);
            }
        }
        return Optional.empty();
    }

    public Optional<Document> getDoumentById(String id) {
        for (Document document : documents) {
            if (document.getDocumentId().equals(id)) {
                return Optional.of(document);
            }
        }
        return Optional.empty();
    }


    public void addMarkupForDocument(Markup markup, String docId){
    Optional<Document> doc=getDoumentById(docId);
    if(doc.isPresent()){
        doc.get().addMarkup(markup);
    }
    }

    public List<Markup> getMarkupsForDocument(String docId){
        Optional<Document> doc=getDoumentById(docId);
        if (doc.isPresent()){
            return doc.get().getMarkup();
        }
        return Collections.emptyList();
    }
    public String getDocumentContent(String docId){
        Optional<Document> document=getDoumentById(docId);
        return null;
    }




}
