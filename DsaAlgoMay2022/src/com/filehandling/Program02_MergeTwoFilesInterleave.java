package com.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Program02_MergeTwoFilesInterleave {
    public static void main(String[] args) throws IOException {
        String path = "/home/swarupcodes/worker/projects/data-structure/DsaAlgoMay2022/src/resources/files/";

        //create merged file Object
        PrintWriter pw = new PrintWriter(path + "merged_problem2.txt");

        // create file-1 to read object
        BufferedReader br1 = new BufferedReader(new FileReader(path+"file-1.txt"));
        // create file-2 to read object
        BufferedReader br2 = new BufferedReader(new FileReader(path+"file-2.txt"));

        String line1 = br1.readLine();
        String line2 = br2.readLine();

        while ((line1 != null) || (line2 != null)) {
            if (line1 != null) {
                pw.println(line1);
                line1 = br1.readLine();
            }
            if (line2 != null) {
                pw.println(line2);
                line2 = br2.readLine();
            }
        }
        br1.close();
        br2.close();
        pw.flush();
        pw.close();

    }
}
