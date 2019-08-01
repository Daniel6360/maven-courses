package ro.itschool.homework17;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

public class DocumentService {
    List<Document> documents = new ArrayList<>();

    public DocumentService(List<Document> documents) {
        this.documents = documents;
    }

    public List<Document> getAllDocuments() {
        List<Document> docs = new ArrayList<>();
        for (Document document : documents) {
            docs.add(document);
        }
        return documents;
    }

    public Document getDocument(String documentId) {
        for (Document document : documents) {
            if (document.getDocumentId() == documentId) {
                return document;
            }
        }
        return null;
    }

    public void validate(Document doc) throws Exception {
        if (doc.getStatus() == Status.IN_PROGRESS) {
            throw new DocumentAlreadyFinishedException();
        }
    }

    public void validateNotInProgress(Document doc) throws Exception {
        if (doc.getStatus() != Status.IN_PROGRESS) {
            throw new DocumentAlreadyFinishedException();
        }
    }


    public Document getDocumentById(String documentId) {
        for (Document document : documents) {
            if (document.getDocumentId().equals(documentId)) {
                return document;
            }
        }
        return null;
    }


    public List<Document> getInProgressDocument() {
        List<Document> doc = new ArrayList<>();
        for (Document document : documents) {
            if (document.status == Status.IN_PROGRESS) {
                doc.add(document);
            }
        }
        return doc;
    }

    public List<Document> getFailedDocuments() {
        List<Document> doc = new ArrayList<>();
        for (Document document : documents) {
            if (document.status == Status.FAILED) {
                doc.add(document);
            }
        }
        return doc;
    }

    public void startDocument(String documentId) throws Exception {
        Document doc = getDocumentById(documentId);
        validate(doc);
        doc.setStatus(Status.IN_PROGRESS);


    }


    public void completeDocument(String documentId) throws Exception {
        Document doc = getDocumentById(documentId);
        validateNotInProgress(doc);
        doc.setStatus(Status.SUCCES);
    }


    public void failDocument(String documentId) throws Exception {
        Document doc = getDocumentById(documentId);
        validateNotInProgress(doc);
        doc.setStatus(Status.FAILED);

    }


}

