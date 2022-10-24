package com.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        String path = "/home/swarupcodes/worker/projects/data-structure/DsaAlgoMay2022/src/resources/buffered-writer-demo.txt";

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));
            bw.write(100);
            bw.newLine();
            bw.write(new char[] {'a','b','c'});
            bw.newLine();
            bw.write("I am a old BufferedWriter Object.");
            bw.newLine();
            bw.flush();
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
