package com.test.io;

import java.io.File;
import java.io.IOException;

/**
 * Created by yunfei on 2017-03-24.
 */
public class FileDemo {
    public static void main(String[] args) {
        File file = new File("E:\\workspace\\aa");
        System.out.println(file.exists());
        if(!file.exists()){
            file.mkdir();
        }else {
            file.delete();
        }
        file.isDirectory();
        file.isFile();

        File file1 = new File("E:\\workspace\\aa.txt");
        try {
            file1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        file.getAbsoluteFile();
        file.getName();
        file.getParent();
    }
}
