package com.kdpark0723;

import java.io.*;

public class BufferedByteStreamDo {
    public static void main(String[] args) {
        String sourceFile = Path.ROOT + "bin/data/base.txt";
        String destFile =  Path.ROOT + "bin/data/output_byte.txt";

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
                System.out.println("Read data[" + (char)i + "," + len + "]");
            }

            bufferedInputStream.close();
            bufferedOutputStream.close();

            System.out.println("finished");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
