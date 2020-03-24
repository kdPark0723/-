package com.kdpark0723;

import java.io.*;

public class MarkResetDo {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = null;
        BufferedInputStream bufferedInputStream = null;

        try {
            File file = new File("bin/data/number.txt");
            inputStream = new FileInputStream(file);
            bufferedInputStream = new BufferedInputStream(inputStream);

            if (bufferedInputStream.markSupported()) {
                int length = (int) file.length();
                int half = length / 2;

                System.out.println(length + " " + half);
                System.out.println("read complete file:");
                System.out.println("---------------------------");

                int b;
                int count = 0;
                while ((b = bufferedInputStream.read()) > 0) {
                    System.out.print((char) b);

                    if (++count == half)
                        bufferedInputStream.mark(half);
                }

                System.out.println("\n---------------------------");
                System.out.println("\nmarked: " + half + "\n");

                bufferedInputStream.reset();

                System.out.println("read back from marked point:");
                System.out.println("---------------------------");

                while ((b = bufferedInputStream.read()) > 0) {
                    System.out.print((char) b);
                }

                System.out.println("\n---------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) inputStream.close();
            if (bufferedInputStream != null) bufferedInputStream.close();
        }
    }
}
