package ro.itschool.curs13;

import java.util.List;

public class MemoryDocSource implements DocSource {
    @Override
    public List<Document> getDocs() {
        return List.of(
                new Document("12","doc1","Hello from here"),
                new Document("13", "doc2","Hello Ana"),
                new Document("13", "doc3","Hello from there")
        );
    }
}
