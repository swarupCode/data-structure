package com.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        String path = "/home/swarupcodes/worker/projects/data-structure/DsaAlgoMay2022/src/resources/file-writer-demo.txt";
//        readFileWithInt(path);
        readFileWithCharArr(path);
    }

    private static void readFileWithCharArr(String path) {
        try {
            FileReader fr = new FileReader(path);
            int i = fr.read();
            while (i!=-1) {
                System.out.print((char) i);
                i = fr.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void readFileWithInt(String path) {
        try {
            FileReader fr = new FileReader(path);
            System.out.println((char)fr.read());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
