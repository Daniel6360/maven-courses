package ro.itschool.curs13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileLineDocSource implements DocSource {
    private final List<Document> documents;

    public FileLineDocSource(String path) throws IOException {
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
        String name = line;
        while (line != null) {
            if (name == null) {
                name = line;
            } else {
                result.add(new Document(line, name));
                name = null;

            }
            line = breader.readLine();
        }
        return result;
    }

}
