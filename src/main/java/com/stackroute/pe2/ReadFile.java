package main.java.com.stackroute.pe2;

import java.io.*;
import java.util.Scanner;

public class ReadFile {

    public static String checkReadFile(File file) {
        String line="";
        String sentence="";
        int len=0;
        try {
            FileReader fr = new FileReader(String.valueOf(file));
            BufferedReader bufferedReader = new BufferedReader(fr);
            while((line = bufferedReader.readLine())!=null)
            {
                sentence=sentence.concat(line);

            }
            len=sentence.length();
            bufferedReader.close();
        } catch (IOException e) {
            return "not found";
        }
        return sentence.toUpperCase();
    }

}

