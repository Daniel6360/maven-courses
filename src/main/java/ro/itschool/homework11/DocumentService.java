package ro.itschool.homework11;

import ro.itschool.curs11.Person;

import java.util.List;

public class DocumentService {

    private List<Document> list;

    public DocumentService(List<Document> list) {
        this.list = list;
    }

    public List<Document> getAllDocuments() {
        return list;

    }

    public Document getDocumentWithName(String name) {
        for (Document doc : list) {
            if (name == doc.getName()) {
                return doc;
            }
        }
        return null;
    }

    public void addMarkupForDocument(String document, int markupid, int position, String content) {
        for (Document doc : list) {
            if (document == doc.getName()) {
            }
        }
    }
}
