package ro.itschool.homework17;

import ro.itschool.curs17.recursion.StringLength;

public class Document {
    String documentId;
    String name;
    Status status;

    public Document(String documentId, String name, Status status) {
        this.documentId = documentId;
        this.name = name;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Document{" +
                "documentId='" + documentId + '\'' +
                ", name='" + name + '\'' +
                ", status=" + status +
                '}';
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getDocumentId() {
        return documentId;
    }

    public String getName() {
        return name;
    }

    public Status getStatus() {
        return status;
    }
}
