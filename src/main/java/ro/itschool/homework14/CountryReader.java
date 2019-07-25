package ro.itschool.homework14;

import ro.itschool.curs9.Parent;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class CountryReader {




    public List<Country> readCountry(String path) throws IOException {
        List<Country> result=new ArrayList<>();
        BufferedReader breader=new BufferedReader(new FileReader(new File(path)));
        String line=breader.readLine();
        String[] pos;

        while (line!=null){
            pos=line.split(Pattern.quote("|"));
            result.add(new Country(pos[0],pos[1],Long.parseLong(pos[2]),Integer.parseInt(pos[3])));
            line=breader.readLine();
        }
        return result;
    }
}
