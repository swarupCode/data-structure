package com.filehandling;

import java.io.*;

public class Program03_MergeAllFiles {
    public static void main(String[] args) throws IOException {
        String path = "/home/swarupcodes/worker/projects/data-structure/DsaAlgoMay2022/src/resources/files/";

        //create merged file Object
        PrintWriter pw = new PrintWriter(path + "merged_problem3.txt");

        File f = new File(path);
        String[] files_list = f.list();
        for (String file : files_list) {
            BufferedReader br = new BufferedReader(new FileReader(new File(f, file)));
            String line = br.readLine();
            while (line != null) {
                pw.println(line);
                line = br.readLine();
            }
        }
        pw.flush();
        pw.close();

    }
}
