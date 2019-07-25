package ro.itschool.curs12;

import java.util.List;
import java.util.Optional;

public class DocumentPrinter {
    private final Document document;

    public DocumentPrinter(Document document) {
        this.document = document;
    }
    public String printWithMarkups(){

        String s="";
        String content=document.getContent();
        List<Markup> markups=document.getMarkups();
        int mkindex=0;

        Markup currentMarkup= markups.get(mkindex);

        for(int i=0; i<content.length(); i++){
            s=s+content.charAt(i);
            if(currentMarkup.getPosition()==i){
                s+="["+currentMarkup.getContent()+"]";
                mkindex++;
                if (mkindex<markups.size())
                currentMarkup=markups.get(mkindex);
            }
            }
        return s;

        }

    }


