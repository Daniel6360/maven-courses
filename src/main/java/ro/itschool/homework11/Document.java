package ro.itschool.homework11;

import java.util.List;

public class Document {
    private final int documentId;
    private final String name;
    private final String content;
    private final List<Markup> markups;

    public Document(int documentId, String name, String content, List<Markup> markups) {
        this.documentId = documentId;
        this.name = name;
        this.content = content;
        this.markups = markups;
    }

    public int getDocumentId() {
        return documentId;
    }

    public String getName() {
        return name;
    }

    public List<Markup> getMarkups() {
        return markups;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Document ID " + documentId+","+
                "Name " +name +","+
                "Content " + content+","+
                "Markup" + markups;
    }
}
