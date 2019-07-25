package ro.itschool.curs13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileSplitDocumentSource implements DocSource {
    private final List<Document> documents;

    public FileSplitDocumentSource(String path) throws IOException {
        this.documents = fetchDocument(path);
    }

    @Override
    public List<Document> getDocs() {
        return documents;
    }

    private List<Document> fetchDocument(String path) throws IOException {
        List<Document> result = new ArrayList<>();
        BufferedReader breader = new BufferedReader(new FileReader(new File(path)));
        String line = breader.readLine();
        String[] pos;
        while (line != null) {
            pos=line.split("~");
            result.add(new Document(pos[0],pos[1]));
            line = breader.readLine();

        }
        return result;
    }
}
