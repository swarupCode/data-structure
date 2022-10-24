package com.filehandling;

import java.io.File;

public class FileMethods {
    public static void main(String[] args) {
        String path = "/home/swarupcodes/worker/projects/data-structure/DsaAlgoMay2022/src/resources";
        getAllFilesAndDirNames(path);
    }
    public static void getAllFilesAndDirNames(String path) {
        File f = new File(path);
        String[] list = f.list();
        for (String fileName : list) {

            //to get the File object from the names
            File f2 = new File(f, fileName);
            if (f2.isFile()) System.out.println("File name: "+fileName);
            else if (f2.isDirectory()) System.out.println("Directory name: "+fileName);

            if ("demo.txt".equals(fileName)) f2.delete();

        }
    }

}
