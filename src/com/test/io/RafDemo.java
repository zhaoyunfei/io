package com.test.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * Created by yunfei on 2017-03-24.
 */
public class RafDemo {
    public static void main(String[] args) throws Exception{
        File dir = new File("E:\\workspace\\aa");
        if(!dir.exists()){
            dir.mkdir();
        }
        File file = new File(dir,"raf.dat");
        if(!file.exists()){
            file.createNewFile();
        }
        RandomAccessFile raf = new RandomAccessFile(file,"rw");
        raf.write('A');
        int i = 0x7fffffff;
        raf.write(i>>>24);
        raf.write(i>>>16);
        raf.write(i>>>8);
        raf.write(i);
        System.out.println(raf.getFilePointer());

        raf.seek(0);
        byte[] buf = new byte[(int) raf.length()];
        raf.read(buf);
        System.out.println(Arrays.toString(buf));
        raf.close();
    }
}
