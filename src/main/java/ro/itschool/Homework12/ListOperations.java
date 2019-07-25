package ro.itschool.Homework12;

import java.util.List;

public class ListOperations {
    public boolean compare(List<String> first, List<String> second){
        for(int i=0; i<=first.size()|| i<=second.size(); i++) {
            if (first.get(i).contains(second.get(i))) {
                return true;
            }

        }
        return false;
    }
}
