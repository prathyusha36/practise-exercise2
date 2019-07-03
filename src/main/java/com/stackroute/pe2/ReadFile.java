package main.java.com.stackroute.pe2;

import java.io.*;
import java.util.Scanner;
/*
 read contents of files find out its length and make it uppercase
 */
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
            System.out.println(len);
            bufferedReader.close();
        } catch (IOException e) {
            return "not found";
        }
        return sentence.toUpperCase();
    }

}

