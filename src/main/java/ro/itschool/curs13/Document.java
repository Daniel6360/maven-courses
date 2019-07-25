package ro.itschool.curs13;

import java.util.List;
import java.util.UUID;

public class Document {
    private String documentId;
    private String name;
    private String content;
    private List<Markup> markups;
    public Document(String name,String content){
        this(UUID.randomUUID().toString(),name, content);
    }

    @Override
    public String toString() {
        return "Document{" +
                "documentId='" + documentId + '\'' +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", markups=" + markups +
                '}';
    }

    public Document(String documentId, String name, String content) {
        this.documentId = documentId;
        this.name = name;
        this.content = content;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Markup> getMarkups() {
        return markups;
    }

    public void setMarkups(List<Markup> markups) {
        this.markups = markups;
    }
    public void addMarkup(Markup marker){
        markups.add(marker);
    }
}
