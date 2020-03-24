package com.kdpark0723;

import java.io.*;

public class BufferedCharStreamDo {
    public static void main(String[] args) {
        String crSet = "_UTF-8";

        String sourceFile = Path.ROOT + "bin/data/base" + crSet + ".txt";
        String destFile =  Path.ROOT + "bin/data/output_char" + crSet + ".txt";

        System.out.println("Source Name:" + sourceFile);
        System.out.println("Target Name:" + destFile);

        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(sourceFile));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destFile), 256);

            int i;
            int len = 0;
            while ((i = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(i);

                len += 1;
                System.out.println("Read data[" + i + "," + len + "]");
            }

            bufferedInputStream.close();
            bufferedOutputStream.close();

            System.out.println("finished");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
