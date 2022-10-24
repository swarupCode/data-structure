package com.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        String path = "/home/swarupcodes/worker/projects/data-structure/DsaAlgoMay2022/src/resources/";

        try {
            FileWriter fw = new FileWriter(path+"file-writer-demo.txt", true);
            fw.write(102);
            fw.write(new char[]{'a', 'q', 'n'});
            fw.write("\nI amm Swarup Das...");
            fw.write("\n");
            fw.flush();
            fw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
