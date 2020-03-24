package com.kdpark0723;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamDo {
    public static void main(String[] args) {
        InputStream in = System.in;

        try {
            while (true) {
                int i = in.read();
                if (i == -1)
                    break;

                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
