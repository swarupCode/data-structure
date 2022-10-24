package com.filehandling;

import java.io.*;

public class Program04_PrintFileWithFilteredData {
    public static void main(String[] args) throws IOException {
        String path = "/home/swarupcodes/worker/projects/data-structure/DsaAlgoMay2022/src/resources/files/";

        //create merged file Object
        PrintWriter pw = new PrintWriter(path + "filtered_problem.txt");

        BufferedReader br1 = new BufferedReader(new FileReader(path + "input.txt"));
        String line = br1.readLine();
        while (line != null) {
            BufferedReader br2 = new BufferedReader(new FileReader(path + "delete.txt"));
            String line2 = br2.readLine();
            boolean available = false;
            while (line2 != null) {
                if (line.equals(line2)) {
                    available = true;
                    break;
                }
                line2 = br2.readLine();
            }
            if (!available) {
                pw.println(line);
            }
            line = br1.readLine();
        }
        pw.flush();
        pw.close();
    }
}
