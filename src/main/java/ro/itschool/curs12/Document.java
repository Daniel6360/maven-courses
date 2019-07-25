package ro.itschool.curs12;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Document {
    private final String documentId;
    private final String name;
    private final String content;
    private  List<Markup> markups;

    public Document(String documentId, String name, String content) {
        this.documentId = documentId;
        this.name = name;
        this.content = content;
        this.markups=new ArrayList<>();
    }



    @Override
    public String toString() {
        return "Document{" +
                "documentId='" + documentId + '\'' +
                ", name='" + name + '\'' +
                ", markups=" + markups +
                '}';
    }

    public String getDocumentId() {
        return documentId;
    }

    public String getName() {
        return name;
    }

    public List<Markup> getMarkups() {
        return markups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return Objects.equals(documentId, document.documentId) &&
                Objects.equals(name, document.name) &&
                Objects.equals(markups, document.markups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentId, name, markups);
    }

    public void addMarkup(Markup marked){
        markups.add(marked);

    }

    public String getContent() {
        return content;
    }

    public List<Markup> getMarkup(){
        return new ArrayList<>(markups);
    }


}
