package com.filehandling;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/swarupcodes/worker/projects/data-structure/DsaAlgoMay2022/src/resources/demo1.txt");
        System.out.println(file.exists());
        System.out.println(file.createNewFile());
        System.out.println(file.exists());

        // creating new directory
        /*File dir = new File("/home/swarupcodes/worker/projects/data-structure/DsaAlgoMay2022/src/resources/files");
        System.out.println(dir.exists());
        dir.mkdir();
        System.out.println(dir.exists());*/

        //create file inside a dir already referenced by an object

        /*File f2 = new File(dir, "abc.txt");
        f2.createNewFile();*/

    }
}
