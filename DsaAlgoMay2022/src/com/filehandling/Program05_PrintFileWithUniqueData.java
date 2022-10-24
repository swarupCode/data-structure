package com.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashSet;
import java.util.Set;

public class Program05_PrintFileWithUniqueData {
    public static void main(String[] args) throws IOException {
        String path = "/home/swarupcodes/worker/projects/data-structure/DsaAlgoMay2022/src/resources/files/";

        //create merged file Object
        PrintWriter pw = new PrintWriter(path + "output.txt");

        BufferedReader br1 = new BufferedReader(new FileReader(path + "input.txt"));
        String line = br1.readLine();
        Set<String> set = new LinkedHashSet<>();
        while (line != null) {
            set.add(line);
            line = br1.readLine();
        }
        for (String s : set) {
            pw.println(s);
        }
        pw.flush();
        pw.close();
    }
}
