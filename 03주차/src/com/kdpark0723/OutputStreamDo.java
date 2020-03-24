package com.kdpark0723;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamDo {
    public static void main(String[] args) {
        OutputStream out = System.out;
        //  OutputStreamWriter out = new OutputStreamWriter(System.out);

        char out1 = 'A';
        char out2 = '가';

        try {
            out.write(out1);
            out.write(out2);

            out.flush();
            out.close();
        } catch (IOException e) {
            System.out.println("예외냐? 이것떄문: " + e);
        }
    }
}
