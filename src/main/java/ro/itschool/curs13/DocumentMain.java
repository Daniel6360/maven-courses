package ro.itschool.curs13;

import javax.print.Doc;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DocumentMain {


    public static void main(String[] args) throws IOException {
//        DocSource docsource = new MemoryDocSource();
//        File f=new File("src/main/resources/doc.in");
//        System.out.println(f.getAbsolutePath());
//        FileReader reader=new FileReader(f);
//        BufferedReader breader = new BufferedReader(reader);
//        String line = breader.readLine();
//        System.out.println(line);
//        while(line!=null){
//            System.out.println(line);
//            line=breader.readLine();
//        }
//        DocSource docSource=new FileLineDocSource("src/main/resources/doc.in");
//        DocSource docSource2=new FileLineDocSource("src/main/resources/doc.in");
        DocSource docSource2=new FileSplitDocumentSource("src/main/resources/doc-split.in");

        //test(docSource);
        test(docSource2);
    }

    private static void test(DocSource docSource) {
        System.out.println(docSource.getDocs());

    }


}

