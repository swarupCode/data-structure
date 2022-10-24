package com.filehandling;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
        String path = "/home/swarupcodes/worker/projects/data-structure/DsaAlgoMay2022/src/resources/print-writer-demo.txt";

        PrintWriter pw = new PrintWriter(new FileWriter(path,true));
        pw.write(100);
        pw.println(100);
        pw.println(true);
        pw.println('C');
        pw.println(new char[] {'a','b','c'});
        pw.println("I am a PrintWriter Object...");
        pw.flush();
        pw.close();

    }
}
