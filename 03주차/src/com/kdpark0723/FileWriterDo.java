package com.kdpark0723;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDo {
    public static void main(String[] args) {
        String what1 = "안녕하신가요? ㅡ.ㅡ\n";
        String what2 = "자바 네트워크 프로그래밍을 듣고 있습니다.";

        try {
            FileWriter fileWriter = new FileWriter("bin/data/software_write.txt");

            fileWriter.write(what1);
            fileWriter.write(what2);

            fileWriter.close();

            System.out.println("Done: check software.txt");
        } catch (IOException e) {
            System.out.println("예외냐? 이것떄문: " + e);
        }
    }
}
