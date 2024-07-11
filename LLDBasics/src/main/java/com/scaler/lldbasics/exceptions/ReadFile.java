package com.scaler.lldbasics.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) throws IOException {
        File f = new File("abc.txt");
        FileReader fr = new FileReader(f);
        fr.read();


    }
}

