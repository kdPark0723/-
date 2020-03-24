package com.kdpark0723;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDo {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("bin/data/software_read.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String s;
            while ((s = bufferedReader.readLine()) != null) {
                System.out.println(s);
            }

            fileReader.close();
        } catch (IOException e) {
            System.out.println("예외냐? 이것떄문: " + e);
        }
    }
}
