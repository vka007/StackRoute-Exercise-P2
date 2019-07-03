package com.stackroute.p2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadContent {

    public String readFile(String filePath) throws IOException {           //main method
        FileReader fr = new FileReader(filePath);                           //file reader obj create

        int i;
        String out = "";

        while ((i = fr.read()) != -1)                               //traverse to end of the file
            out = out + ((char) i);                                    //append the content in result string

        fr.close();

        int length = out.length();                                      //calculate the length of the file/string

        return out.toUpperCase();                                      //return after converting to upper case
    }
}
