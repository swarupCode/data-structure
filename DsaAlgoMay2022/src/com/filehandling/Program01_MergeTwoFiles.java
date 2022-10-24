package com.filehandling;

import java.io.*;

public class Program01_MergeTwoFiles {
    public static void main(String[] args) throws IOException {
        String path = "/home/swarupcodes/worker/projects/data-structure/DsaAlgoMay2022/src/resources/files/";

        //create merged file Object
        PrintWriter pw = new PrintWriter(path + "merged_problem1.txt");

        // create file-1 to read object
        BufferedReader br1 = new BufferedReader(new FileReader(path+"file-1.txt"));
        // create file-2 to read object
        BufferedReader br2 = new BufferedReader(new FileReader(path+"file-2.txt"));

        String line1 = br1.readLine();
        while (line1 != null) {
            pw.println(line1);
            line1 = br1.readLine();
        }
        String line2 = br2.readLine();
        while (line2 != null) {
            pw.println(line2);
            line2 = br2.readLine();
        }
        br1.close();
        br2.close();
        pw.flush();
        pw.close();

    }
}
